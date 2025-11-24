package exercise1;

import javax.swing.*;

public class InsuranceDriver {

    public static void main(String[] args) {
        // Array to hold two policies (you can increase to 3 if required)
        Insurance[] policies = new Insurance[2];

        for (int i = 0; i < policies.length; i++) {
            String choice = askChoice(
                    "Select insurance type for policy #" + (i + 1) + ":\n1) Health\n2) Life",
                    new String[]{"1", "2"},
                    "1"
            );

            double fee = askDouble("Enter monthly fee (e.g., 120.00):", "120.00");

            if ("1".equals(choice)) {
                Insurance h = new Health();
                h.setInsuranceCost(fee);
                policies[i] = h;
            } else {
                Insurance l = new Life();
                l.setInsuranceCost(fee);
                policies[i] = l;
            }
        }

        // Show results in console using polymorphism (displayInfo())
        System.out.println("=== Policies Entered ===");
        for (Insurance p : policies) {
            p.displayInfo();
        }

        // Also show a quick summary popup
        StringBuilder sb = new StringBuilder("Summary:\n");
        for (int i = 0; i < policies.length; i++) {
            sb.append("#").append(i + 1).append("  ")
                    .append(policies[i].getType())
                    .append("  $").append(String.format("%.2f", policies[i].getMonthlyCost()))
                    .append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Insurance Summary", JOptionPane.INFORMATION_MESSAGE);
    }

    // ---------- tiny helpers ----------
    private static String askChoice(String prompt, String[] allowed, String defaultVal) {
        while (true) {
            String s = (String) JOptionPane.showInputDialog(
                    null, prompt, "Choose", JOptionPane.QUESTION_MESSAGE, null, null, defaultVal);
            if (s == null) continue;
            s = s.trim();
            for (String a : allowed) if (a.equals(s)) return s;
            JOptionPane.showMessageDialog(null, "Please enter 1 or 2.");
        }
    }

    private static double askDouble(String prompt, String defaultVal) {
        while (true) {
            try {
                String s = (String) JOptionPane.showInputDialog(
                        null, prompt, "Input", JOptionPane.QUESTION_MESSAGE, null, null, defaultVal);
                if (s == null) continue;
                return Double.parseDouble(s.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Enter a number (e.g., 120.00).");
            }
        }
    }
}

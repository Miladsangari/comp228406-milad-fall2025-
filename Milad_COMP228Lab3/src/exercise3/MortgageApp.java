package exercise3;

import javax.swing.*;

public class MortgageApp {

    public static void main(String[] args) {

        double primeRate = askDouble("Enter current prime interest rate (for example 3.5):", "3.5");

        Mortgage[] mortgages = new Mortgage[3];

        for (int i = 0; i < mortgages.length; i++) {
            int num = askInt("Mortgage #" + (i + 1) + " - Enter mortgage number:", "100" + (i + 1));
            String name = askString("Mortgage #" + (i + 1) + " - Customer name:", "Customer " + (i + 1));
            double amount = askDouble("Mortgage #" + (i + 1) + " - Mortgage amount (max 300000):", "150000");

            int term = askTerm("Mortgage #" + (i + 1) + " - Term in years (1, 3 or 5):");

            char type = askType("Mortgage #" + (i + 1) + " - Type: B = Business, P = Personal:");
            if (type == 'B') {
                mortgages[i] = new BusinessMortgage(num, name, amount, primeRate, term);
            } else {
                mortgages[i] = new PersonalMortgage(num, name, amount, primeRate, term);
            }
        }

        // Build one big message with all mortgage info
        StringBuilder allInfo = new StringBuilder("Mortgage summary:\n\n");
        for (Mortgage m : mortgages) {
            allInfo.append(m.toString()).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, allInfo.toString(),
                "All Mortgages", JOptionPane.INFORMATION_MESSAGE);
    }

    // ---------- small helper methods ----------

    private static String askString(String prompt, String defaultValue) {
        String s;
        do {
            s = (String) JOptionPane.showInputDialog(
                    null, prompt, "Input", JOptionPane.QUESTION_MESSAGE, null, null, defaultValue);
        } while (s == null || s.trim().isEmpty());
        return s.trim();
    }

    private static int askInt(String prompt, String defaultValue) {
        while (true) {
            try {
                return Integer.parseInt(askString(prompt, defaultValue));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a whole number.");
            }
        }
    }

    private static double askDouble(String prompt, String defaultValue) {
        while (true) {
            try {
                return Double.parseDouble(askString(prompt, defaultValue));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a number (for example 250000.00).");
            }
        }
    }

    private static int askTerm(String prompt) {
        while (true) {
            int t = askInt(prompt, "1");
            if (t == MortgageConstants.SHORT_TERM ||
                    t == MortgageConstants.MEDIUM_TERM ||
                    t == MortgageConstants.LONG_TERM) {
                return t;
            }
            JOptionPane.showMessageDialog(null, "Term must be 1, 3 or 5 years.");
        }
    }

    private static char askType(String prompt) {
        while (true) {
            String s = askString(prompt, "B");
            char c = Character.toUpperCase(s.charAt(0));
            if (c == 'B' || c == 'P') {
                return c;
            }
            JOptionPane.showMessageDialog(null, "Please enter B for Business or P for Personal.");
        }
    }
}

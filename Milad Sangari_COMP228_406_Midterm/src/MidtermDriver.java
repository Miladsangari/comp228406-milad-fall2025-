import javax.swing.*;

public class MidtermDriver {

    public static void main(String[] args) {
        // ----- Science book (with 10% discount) -----
        String sTitle      = ask("Science - Title:",             "Physics Essentials");
        String sDesc       = ask("Science - Short description:", "Intro to motion, energy, and matter.");
        String sAuthor     = ask("Science - Author:",            "Isaac Newton");
        String sPublisher  = ask("Science - Publisher:",         "Cambridge Press");
        String sIsbn       = ask("Science - ISBN:",              "9781234567890");
        int sYear          = askInt("Science - Year (e.g., 2023):", "2023");
        double sBasePrice  = askDouble("Science - Base price (10% off applies):", "50.00");

        ScienceBook sBook = new ScienceBook(sTitle, sDesc, sAuthor, sPublisher, sIsbn, sYear);
        sBook.setPrice(sBasePrice); // applies discount inside
        JOptionPane.showMessageDialog(null, sBook.toString(), "Science Book", JOptionPane.INFORMATION_MESSAGE);

        // ----- Math book (fixed price) -----
        String mTitle      = ask("Math - Title:",               "Calculus Simplified");
        String mDesc       = ask("Math - Short description:",   "Limits, derivatives, integrals in plain language.");
        String mAuthor     = ask("Math - Author:",              "Leibniz");
        String mPublisher  = ask("Math - Publisher:",           "Oxford Publications");
        String mIsbn       = ask("Math - ISBN:",                "9780987654321");
        int mYear          = askInt("Math - Year (e.g., 2024):","2024");
        double mFixedPrice = askDouble("Math - Price (fixed):", "60.00");

        MathBook mBook = new MathBook(mTitle, mDesc, mAuthor, mPublisher, mIsbn, mYear);
        mBook.setPrice(mFixedPrice);
        JOptionPane.showMessageDialog(null, mBook.toString(), "Math Book", JOptionPane.INFORMATION_MESSAGE);
    }

    // ---------------- small input helpers with defaults ----------------
    private static String ask(String prompt, String defaultValue) {
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
                return Integer.parseInt(ask(prompt, defaultValue));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a whole number (e.g., 2024).");
            }
        }
    }

    private static double askDouble(String prompt, String defaultValue) {
        while (true) {
            try {
                return Double.parseDouble(ask(prompt, defaultValue));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a number (e.g., 29.99).");
            }
        }
    }
}
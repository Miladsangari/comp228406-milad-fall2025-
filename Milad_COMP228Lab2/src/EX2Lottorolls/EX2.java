package EX2Lottorolls;

import javax.swing.*;
import java.util.Random;

public class EX2 {
    private int[] numbers = new int[3];
    private Random random = new Random();

    public EX2() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(9) + 1; // 1-9
        }
    }

    public int[] getNumbers() {
        return numbers;
    }

    public static void main(String[] args) {
        int userChoice = Integer.parseInt(JOptionPane.showInputDialog("Choose a number between 3 and 27"));
        boolean win = false;

        for (int i = 1; i <= 5; i++) {
            EX2 lotto = new EX2();
            int sum = 0;
            for (int n : lotto.getNumbers()) sum += n;
            JOptionPane.showMessageDialog(null, "Roll " + i + ": " + lotto.getNumbers()[0] + ", " + lotto.getNumbers()[1] + ", " + lotto.getNumbers()[2] + " → Sum = " + sum);

            if (sum == userChoice) {
                JOptionPane.showMessageDialog(null, "You Win! Matched sum: " + sum);
                win = true;
                break;
            }
        }

        if (!win) {
            JOptionPane.showMessageDialog(null, "Computer Wins! No match after 5 rolls.");
        }
    }
}
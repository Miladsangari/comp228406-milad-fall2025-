package EX1;

import javax.swing.*;
import java.util.Random;

public class EX1 {
    private int correct = 0;
    private int incorrect = 0;
    private final Random random = new Random();

    public void inputAnswer() {
        String[][] questions = {
                {"What is the file extension of a Java file?", ".jav", ".java", ".jv", ".class", "2"},
                {"Which keyword is used to inherit a class in Java?", "this", "super", "extends", "import", "3"},
                {"Which of these is NOT a Java primitive type?", "int", "double", "String", "boolean", "3"},
                {"What does JVM stand for?", "Java Variable Machine", "Java Virtual Machine", "Java Verified Module", "Joint Virtual Method", "2"},
                {"Which method is the entry point of a Java program?", "main()", "start()", "run()", "execute()", "1"}
        };

        for (String[] q : questions) {
            String question = q[0]
                    + "\n1. " + q[1]
                    + "\n2. " + q[2]
                    + "\n3. " + q[3]
                    + "\n4. " + q[4];

            String ans = JOptionPane.showInputDialog(null, question, "Quiz", JOptionPane.QUESTION_MESSAGE);

            if (ans != null && ans.equals(q[5])) {
                correct++;
                JOptionPane.showMessageDialog(null, feedback(true));
            } else {
                incorrect++;
                JOptionPane.showMessageDialog(null, feedback(false) + " Correct answer: " + q[Integer.parseInt(q[5])]);
            }
        }

        int total = correct + incorrect;
        double percent = total == 0 ? 0.0 : (correct * 100.0) / total;
        JOptionPane.showMessageDialog(null, "Correct: " + correct + "\nIncorrect: " + incorrect + "\nScore: " + percent + "%");
    }

    private String feedback(boolean ok) {
        switch (random.nextInt(4)) {
            case 0: return ok ? "Excellent!" : "No. Please try again.";
            case 1: return ok ? "Good!"      : "Wrong. Try once more.";
            case 2: return ok ? "Keep up the good work!" : "Don't give up!";
            default:return ok ? "Nice work!" : "No. Keep trying..";
        }
    }

    public static void main(String[] args) {
        new EX1().inputAnswer();
    }
}


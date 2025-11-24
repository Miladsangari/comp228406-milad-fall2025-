package exercise2;

import java.util.Scanner;

public class GameTesterApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // We will create one full time and one part time tester,
        // and store them in an array to show polymorphism.
        GameTester[] testers = new GameTester[2];

        System.out.println("=== Game Tester Application ===");

        // ----- Full time tester -----
        System.out.print("Enter name of full-time tester: ");
        String fullName = input.nextLine();
        testers[0] = new FullTimeGameTester(fullName);

        // ----- Part time tester -----
        System.out.print("Enter name of part-time tester: ");
        String partName = input.nextLine();

        int hours = 0;
        boolean ok = false;
        while (!ok) {
            System.out.print("Enter hours worked this month for " + partName + ": ");
            String hoursStr = input.nextLine();
            try {
                hours = Integer.parseInt(hoursStr);
                if (hours < 0) {
                    System.out.println("Hours cannot be negative. Try again.");
                } else {
                    ok = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a whole number for hours.");
            }
        }

        testers[1] = new PartTimeGameTester(partName, hours);

        // ----- Display results using polymorphism -----
        System.out.println();
        System.out.println("=== Salary Details ===");

        for (GameTester tester : testers) {
            String type = tester.isFullTime() ? "Full-time" : "Part-time";
            double salary = tester.determineSalary();

            System.out.println("Name: " + tester.getName());
            System.out.println("Type: " + type);
            System.out.println("Monthly Salary: $" + String.format("%.2f", salary));
            System.out.println();
        }

        input.close();
    }
}

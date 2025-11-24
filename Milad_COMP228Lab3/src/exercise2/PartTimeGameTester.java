package exercise2;

public class PartTimeGameTester extends GameTester {

    private int hoursWorked;

    public PartTimeGameTester(String name, int hoursWorked) {
        // fullTime = false
        super(name, false);
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    // Part time: salary based on hours × hourly rate
    @Override
    public double determineSalary() {
        double hourlyRate = 20.0;      // $20 per hour
        return hourlyRate * hoursWorked;
    }
}

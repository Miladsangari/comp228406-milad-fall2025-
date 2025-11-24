package exercise2;

public class FullTimeGameTester extends GameTester {

    public FullTimeGameTester(String name) {
        // fullTime = true
        super(name, true);
    }

    // Fixed monthly salary for full time testers
    @Override
    public double determineSalary() {
        return 3000.0;   // simple constant salary
    }
}

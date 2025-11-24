package exercise2;

// Abstract base class for all game testers
public abstract class GameTester {

    protected String name;
    protected boolean fullTime;

    public GameTester(String name, boolean fullTime) {
        this.name = name;
        this.fullTime = fullTime;
    }

    public String getName() {
        return name;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    // Each subclass will implement its own salary rule
    public abstract double determineSalary();
}

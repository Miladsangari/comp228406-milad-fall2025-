package exercise1;

// Abstract base class for all insurances
public abstract class Insurance {
    private String type;         // e.g., "Health" or "Life"
    private double monthlyCost;  // monthly fee

    public Insurance(String type) {
        this.type = type;
    }

    // subclasses will decide how to set monthly cost
    public abstract void setInsuranceCost(double monthlyCostFromUser);

    // subclasses will decide how to display
    public abstract void displayInfo();

    // getters
    public String getType() {
        return type;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    // protected so only subclasses can assign after their rule
    protected void setMonthlyCost(double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }
}

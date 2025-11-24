package exercise1;

public class Health extends Insurance {

    public Health() {
        super("Health");
    }

    // Health: store the monthly fee exactly as given
    @Override
    public void setInsuranceCost(double monthlyCostFromUser) {
        // (If your prof wanted a rule, you could apply it here. We keep it simple.)
        setMonthlyCost(monthlyCostFromUser);
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Insurance Info ===");
        System.out.println("Type: " + getType());
        System.out.println("Monthly Cost: $" + String.format("%.2f", getMonthlyCost()));
        System.out.println();
    }
}

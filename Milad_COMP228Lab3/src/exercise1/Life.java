package exercise1;

public class Life extends Insurance {

    public Life() {
        super("Life");
    }

    // Life: small example rule (keeps it simple but shows polymorphism)
    // If needed, you can remove the rule and store the value as-is like Health.
    @Override
    public void setInsuranceCost(double monthlyCostFromUser) {
        // Example: add a small policy fee of $5.00 to show a different calculation
        double withFee = monthlyCostFromUser + 5.00;
        setMonthlyCost(withFee);
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Insurance Info ===");
        System.out.println("Type: " + getType());
        System.out.println("Monthly Cost: $" + String.format("%.2f", getMonthlyCost()));
        System.out.println();
    }
}

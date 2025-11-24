package exercise3;

// Abstract base class for all mortgages
public abstract class Mortgage implements MortgageConstants {

    private int mortgageNumber;
    private String customerName;
    protected double amount;
    protected double interestRate;  // annual interest in percent
    protected int term;             // years: 1, 3 or 5

    public Mortgage(int mortgageNumber,
                    String customerName,
                    double amount,
                    double interestRate,
                    int term) {

        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;

        // limit the amount to the maximum allowed
        if (amount < 0) {
            this.amount = 0;
        } else if (amount > MAX_MORTGAGE_AMOUNT) {
            this.amount = MAX_MORTGAGE_AMOUNT;
        } else {
            this.amount = amount;
        }

        this.interestRate = interestRate;

        // if term is not 1, 3 or 5, default to SHORT_TERM (1 year)
        if (term == SHORT_TERM || term == MEDIUM_TERM || term == LONG_TERM) {
            this.term = term;
        } else {
            this.term = SHORT_TERM;
        }
    }

    // simple text summary for displaying to user
    public String getMortgageInfo() {
        // simple interest for the assignment
        double totalOwed = amount + (amount * interestRate * term / 100.0);

        StringBuilder info = new StringBuilder();
        info.append("Bank: ").append(BANK_NAME)
                .append("\nMortgage #: ").append(mortgageNumber)
                .append("\nCustomer: ").append(customerName)
                .append("\nAmount: $").append(String.format("%.2f", amount))
                .append("\nInterest rate: ").append(String.format("%.2f", interestRate)).append("%")
                .append("\nTerm: ").append(term).append(" year(s)")
                .append("\nTotal owed at end of term: $")
                .append(String.format("%.2f", totalOwed));

        return info.toString();
    }

    @Override
    public String toString() {
        return getMortgageInfo();
    }
}

package exercise3;

// Business mortgage: prime rate + 1%
public class BusinessMortgage extends Mortgage {

    public BusinessMortgage(int mortgageNumber,
                            String customerName,
                            double amount,
                            double primeRate,
                            int term) {

        // for business we add 1% to prime
        super(mortgageNumber, customerName, amount, primeRate + 1.0, term);
    }
}

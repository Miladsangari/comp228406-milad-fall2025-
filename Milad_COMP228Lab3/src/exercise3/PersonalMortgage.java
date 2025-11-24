package exercise3;

// Personal mortgage: prime rate + 2%
public class PersonalMortgage extends Mortgage {

    public PersonalMortgage(int mortgageNumber,
                            String customerName,
                            double amount,
                            double primeRate,
                            int term) {

        // for personal we add 2% to prime
        super(mortgageNumber, customerName, amount, primeRate + 2.0, term);
    }
}

package entities;

public class BusinessAccount extends Account {
    // Attributes
    private Double loanLimit;


    // Getters & Setters
    public Double getLoanLimit() {
        return loanLimit;
    }
    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }


    // Constructors
    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        setLoanLimit(loanLimit);
    }


    // Methods
    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }


    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2;
    }
}

package entities;

public class BusinessAccount extends Account {
    private Double loanLimit;




    public Double getLoanLimit() {
        return loanLimit;
    }
    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }



    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        setLoanLimit(loanLimit);
    }



    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }

    public void withdraw(double amount) {
        balance -= amount;
    }


}

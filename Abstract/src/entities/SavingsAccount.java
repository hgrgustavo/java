package entities;

public class SavingsAccount extends Account {
    private Double interestRate;



    public Double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }



    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        setInterestRate(interestRate);
    }

    public void updateBalance() {
        balance += balance * getInterestRate();
    }

    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
    }
}
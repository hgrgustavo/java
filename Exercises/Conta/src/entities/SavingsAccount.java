package entities;

public class SavingsAccount extends Account {
    // Attributes
    private Double interestRate;


    // Constructors
    public SavingsAccount() {
        super();
    }
    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        setInterestRate(interestRate);
    }


    // Getters & Setters
    public Double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }


    // Methods
    public void updateBalance() {
        balance += balance * getInterestRate();
    }

    @Override
    public void withdraw(double amount) { balance -= amount; }

}

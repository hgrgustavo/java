package entities;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance;

    // Constructors
    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        setNumber(number);
        setHolder(holder);
        setBalance(balance);
    }

    // Getters & Setters
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) { this.balance = balance; }

    // Methods
    public void withdraw(double amount) {
        this.balance -= amount + 5.0;
    }
    public void deposit(double amount) { this.balance += amount;
    }


}

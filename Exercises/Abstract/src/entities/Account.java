package entities;

public abstract class Account {
    private Integer number;
    private String holder;
    protected Double balance;


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
    public void setBalance(Double balance) {
        this.balance = balance;
    }



    public void withdraw(Double value) { this.balance -= value; }
    public void deposit(Double value) { this.balance += value; }




    public Account(Integer number, String holder, Double balance) {
        setNumber(number);
        setHolder(holder);
        setBalance(balance);
    }




}

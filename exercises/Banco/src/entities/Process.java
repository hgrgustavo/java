package entities;

public class Process {
    private int account_number;
    private String account_holder;
    private double initial_deposit;

    public String getName() { return this.account_holder; }
    public void setName(String account_holder) { this.account_holder = account_holder; }

    public int getNumber() { return this.account_number; }
    public void setNumber(int account_number) {
        this.account_number = account_number;
    }

    public double getBalance() { return this.initial_deposit; }
    public void setBalance(double initial_deposit) {
        this.initial_deposit = initial_deposit;
    }

    public Process(double initial_deposit, int account_number, String account_holder) {
        this.setBalance(initial_deposit);
        this.setNumber(account_number);
        this.setName(account_holder);
    }
    
    public Process (int account_number, String account_holder) {
        this.setNumber(account_number);
        this.setName(account_holder);
    }
    
    public void depositProcess (double reg_d) {this.initial_deposit += reg_d;}

    public void withdrawProcess (double reg_w) {
        this.initial_deposit -= reg_w;
    }

    public String toString() {
        return "Account "
                + getNumber()
                + ", Holder: "
                + getName()
                + ", Balance: "
                + getBalance();
    }
}

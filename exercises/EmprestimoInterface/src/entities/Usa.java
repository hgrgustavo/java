package entities;

import services.InterestService;

public class Usa implements InterestService {
    @Override
    public double getInterestRate() {
        return 1.01;
    }

    @Override
    public double payment(double amount, int months) {
        return amount + amount * (1 + Math.pow(this.getInterestRate(), months));
    }

    public Usa() {
    }
}

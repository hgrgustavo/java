package services;

public class Payment implements Paypal{
    private static final double fee_multiplier = 0.01;
    private static final double tax_multiplier = 0.02;


    @Override
    public double fee(double value, int month) {
        return value * fee_multiplier * month;
    }

    @Override
    public double tax(double value) {
        return value * tax_multiplier;
    }
}
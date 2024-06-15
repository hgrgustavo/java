package services;

public interface Paypal {
    double fee(double value, int month);
    double tax(double value);
}

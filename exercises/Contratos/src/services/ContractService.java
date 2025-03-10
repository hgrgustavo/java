package services;

import entities.*;
import java.time.LocalDate;

public class ContractService {
    private final Paypal paypal;
    private double totalValue;

    public ContractService(Paypal paypal) {
        this.paypal = paypal;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public void generateContract(Contract contract, int months) {
        double payment = contract.getTotalValue() / months;
        int i;



        for(i = 1; i <= months; i++ ) {
            LocalDate installmentDate = contract.getDate().plusMonths(i);
            double feeValue =  paypal.fee(payment, i);
            double taxValue = paypal.tax(payment + feeValue);
            double installmentValue = payment + feeValue + taxValue;
            totalValue += installmentValue;
            contract.getInstallmentList().add(new Installment(installmentDate, installmentValue));
        }

        setTotalValue(totalValue);

    }
}
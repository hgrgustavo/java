// !! It's possible to extract method returning 'acc4' from a long surrounding method !!

package app;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account standard = new Account(1, "Gus", 2500.0);
        BusinessAccount business = new BusinessAccount(2, "Amazon", 1000000.0, 500000.0);
        SavingsAccount savings = new SavingsAccount(3, "O Primo Rico", 300000.0, 10.0);


        // Up casting
        Account acc1 = business;
        Account acc2 = new BusinessAccount(4, "Positive", 21900000.0, 100000.0);
        Account acc3 = new SavingsAccount(5, "Monopoly", 100000.0, 5.0);


        // Down casting
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);


        /*

                    ClassCastException

        BusinessAccount acc5 = (BusinessAccount)acc3;

        if(acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc2;
            acc5.updateBalance();
            System.out.print("Update!");
        }

         */
    }

}

package app;

import java.util.Scanner;
import entities.*;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int number;
        String name;
        double iniBalance, withdrawLimit, withdrawAmount;


        System.out.print("Enter account data: ");
        System.out.print("\nNumber: ");
        number = in.nextInt();

        System.out.print("Holder: ");
        in.nextLine();
        name = in.nextLine();

        System.out.print("Initial balance: ");
        iniBalance = in.nextDouble();

        System.out.print("Withdraw limit: ");
        withdrawLimit = in.nextDouble();

        System.out.print("\nEnter amount for withdraw: ");
        withdrawAmount = in.nextDouble();



        Account acc = new Account(number, name, iniBalance, withdrawLimit);

        try {
            acc.withdraw(withdrawAmount);
            System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
        }

        catch(RuntimeException e) {

            System.out.print(e.getMessage());
        }











    }
}

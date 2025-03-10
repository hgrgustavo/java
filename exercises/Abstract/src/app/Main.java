package app;

import entities.*;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();

        list.add(new BusinessAccount(1, "Gus", 200000.0, 100000.0));
        list.add(new SavingsAccount(2, "Gus", 30000.0, 10.5));


        System.out.print(" Accounts Info ");
        for(Account acc : list) {
            System.out.print("\nBalance: " + acc.getBalance());
        }

        for (Account acc : list) { acc.deposit(10.0); }

        System.out.print("\n\nUpdated Accounts Info ");
        for(Account acc : list) {
            System.out.print("\nBalance: " + acc.getBalance());
        }


    }
}

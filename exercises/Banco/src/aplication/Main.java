package aplication;

import java.util.Objects;
import java.util.Scanner;
import entities.Process;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n> Enter account number: ");
        int account_number = sc.nextInt();

        System.out.print("\n> Enter account holder: ");
        String account_holder = sc.next();

        System.out.print("\n> Is there an initial deposit? (y / n)? ");
        String flag = sc.next();

        if(Objects.equals(flag, "y") || Objects.equals(flag, "Y")) {
            System.out.print("\n> Enter initial deposit value: $");
            double initial_deposit = sc.nextDouble();

            Process pro = new Process(initial_deposit, account_number, account_holder);

            System.out.print("\n> Account data:  " + pro);

            System.out.print("\n> Enter a deposit value: $");
            double regular_deposit = sc.nextDouble();
            pro.depositProcess(regular_deposit);
            System.out.print("\n> Updated account data:  " + pro);

            System.out.print("\n> Enter a withdraw value: $");
            double regular_withdraw = sc.nextDouble();
            pro.withdrawProcess(regular_withdraw);
            System.out.print("\n> Updated account data:  " + pro);

            sc.close();
            System.exit(0);
        }

        if(Objects.equals(flag, "n") || Objects.equals(flag, "N")) {
            Process pro = new Process(account_number, account_holder);

            System.out.print("\n> Account data:  " + pro);

            System.out.print("\n> Enter a deposit value: $");
            double regular_deposit = sc.nextDouble();
            pro.depositProcess(regular_deposit);
            System.out.print("> Updated account data:  " + pro);

            System.out.print("\n> Enter a withdraw value: $");
            double regular_withdraw = sc.nextDouble();
            pro.withdrawProcess(regular_withdraw);
            System.out.print("\n> Updated account data:  " + pro);
            
            sc.close();
            System.exit(0);
        }
    }
}

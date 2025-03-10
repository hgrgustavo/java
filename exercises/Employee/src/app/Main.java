package app;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int i, n, hour;
        char flag;
        String name;
        double valuePerHour, addCharge;

        List<Employee> list = new ArrayList<>();

        System.out.print("~ Insert employee number: ");
        n = sc.nextInt();

        for(i = 0; i < n; i++) {
            System.out.print("Employee #" + (i++) + " data:");
            System.out.print("Outsourced? (y / n)");
            flag = sc.next().charAt(0);

            sc.nextLine();

            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Hours: ");
            hour = sc.nextInt();

            System.out.print("Value per hour: ");
            valuePerHour = sc.nextDouble();

            switch(flag) {
                case 'y':
                    System.out.print("Additional charge: ");
                    addCharge = sc.nextDouble();
                    list.add(new Outsourced(name, hour, valuePerHour, addCharge));
                case 'n':
                    list.add(new Employee(name, hour, valuePerHour));
            }
        }

        System.out.print("\n PAYMENTS: ");
        for(Employee emp: list) {
            System.out.print(emp.getName() + " $ " + String.format("%.2f", emp.payment()));
        }
        sc.close();
    }
}

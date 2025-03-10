package app;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import entities.Employee;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        int i, n;
        String name;
        double salary, percentage;
        
        System.out.print("\n> Insert the number of employees to register:  ");
        n = sc.nextInt();

        for(i = 0; i < n; i++) {
            System.out.print("> Employee #" + (i + 1) + " name: ");
            name = sc.nextLine();

            sc.nextLine();

            while (!Employee.verifyName(list, name)) {
                System.out.print("\n> This name already exists :( Try again.");
                System.out.print("\n\n> Employee #" + (i + 1) + " name: ");
                name = sc.nextLine();
            }

            System.out.print("> Salary: $");
            salary = sc.nextDouble();

            list.add(new Employee(name, salary));       // !!
        }

        for(Employee e : list) {    // !!
            System.out.print(e.getName() + ", $" + e.getSalary() + "\n");
        }

        // Raise
        System.out.print("\n> Choose the employee to give a raise: ");
        name = sc.nextLine();

        sc.nextLine();

        System.out.print("\n> Insert increase percentage: %");
        percentage = sc.nextDouble();

        Employee e = new Employee(list, name, percentage);

        System.out.print(e);

    }
}

package application;

import entities.Employee;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, i, id;
        String name;
        double salary, percentage;

        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("\n> How many employees will be registered? ");
        n = sc.nextInt();

        // Employee Registration
        for(i = 0; i <= n; i++) {
            System.out.print("\n> Employee #" + (i+1));

            System.out.print("\n> Id: ");
            id = sc.nextInt();

            System.out.print("> Name: ");
            name = sc.nextLine();

            System.out.print("> Salary: $ ");
            salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        // Salary increase
        System.out.print("\n> Enter the employee id that will have salary increase: ");
        id = sc.nextInt();

        int finalId = id;
        Employee employee = list.stream().filter(x -> x.getId() == finalId).findFirst().orElse(null);    // Lambda expression

        // Prevent NullPointerException
        if (employee == null) {
            System.out.println("\n> ID does not exist");
        }
        else {
            System.out.print("\n> Enter the percentage: ");
            percentage = sc.nextDouble();

            employee.increaseSalary(percentage);
        }

        // Report
        System.out.print("\n> List of Employees: ");

        for (Employee obj : list) {	           // Enhanced for
            System.out.println(obj);
        }
    }
}

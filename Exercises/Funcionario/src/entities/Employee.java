package entities;

import java.util.List;

public class Employee {
    // Attributes
    private String name;
    private double salary, newSalary, percentage;

    // Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getNewSalary() {
        return newSalary;
    }
    public void setNewSalary(double newSalary) {
        this.newSalary = newSalary;
    }

    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    // Constructors
    public Employee(String name, double salary) {
        setName(name);
        setSalary(salary);
    }
    public Employee(List<Employee> l, String name, double percentage) {
        setName(name);
        setPercentage(percentage);
        raise(l);
    }

    // Methods
    public static boolean verifyName(List<Employee> l, String name) {
        for(Employee _ : l) {
            if(l.stream().anyMatch(x -> x.getName().equals(name))) {    // Lambda
                return false;
            }
        }
        return true;
    }

    public void raise(List<Employee> l) {
        this.newSalary = getSalary() + (getSalary() * getPercentage());

    }

    public String toString() {
        return getName() + " with " + getNewSalary();
    }
}

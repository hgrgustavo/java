package entities;

public class Employee {
    private int id;
    private double salary;
    private String name;

    // Getters
    public int getId() {
        return id;
    }
    public String getName() { return name; }
    public double getSalary() {
        return salary;
    }


    // Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Constructor
    public Employee(int id, String name, double salary) {
        setId(id);
        setName(name);
        setSalary(salary);
    }

    // Methods
    public void increaseSalary(double percentage) {
        this.salary = getSalary() + (getSalary() * percentage);
    }
    public String toString() {
        return getId() + ", " + getName() + ", " + this.salary;
    }

}

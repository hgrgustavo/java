package entities;

public class Approval {
    public String name;
    private double grade_1;
    private double grade_2;
    private final double average = (getGrade_1() + getGrade_2()) / 2;

    // Getters
    public String getName() {return name;}
    public double getGrade_1() {
        return grade_1;
    }
    public double getGrade_2() {
        return grade_2;
    }
    public double getAverage() { return average; }

    // Setters
    public void setName(String name) {this.name = name;}
    public void setGrade_1(double grade_1) {
        this.grade_1 = grade_1;
    }
    public void setGrade_2(double grade_2) { this.grade_2 = grade_2; }
    // public void setAverage(double average) { this.average = average; }

    // Constructor
    public Approval(String name, double a, double b) {
        setName(name);
        setGrade_1(a);
        setGrade_2(b);
    }

    // Print
    public String toString() {
        return getName() + " with " + getAverage() + " average.";
    }



}

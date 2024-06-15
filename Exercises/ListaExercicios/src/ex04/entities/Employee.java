package ex04.entities;

public abstract class Employee {
    public Employee() { }



    public abstract String getName();

    public abstract void setName(String name);

    public abstract void insertData();

    public abstract void printPay();

    public abstract Double getPay();

    public abstract void setPay(Double pay);
}

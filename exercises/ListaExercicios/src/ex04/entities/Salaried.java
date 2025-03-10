package ex04.entities;

import java.util.Scanner;

public class Salaried extends Employee {
    private String name;
    private Double pay;


    public Salaried() { super(); }

    @Override
    public String getName() { return this.name; }

    @Override
    public void setName(String name) { this.name = name; }

    @Override
    public Double getPay() { return this.pay; }

    @Override
    public void setPay(Double pay) { this.pay = pay; }

    @Override
    public void printPay() {
        System.out.printf("""
                \s
                %s recebe R$%.2f""", getName(), getPay());
    }

    @Override
    public void insertData() {
        Scanner in = new Scanner(System.in);
        String s_name;
        double s_pay;

        System.out.print("Nome: ");
        s_name = in.nextLine();


        System.out.print("Salário: R$");
        s_pay = in.nextDouble();


        setName(s_name);
        setPay(s_pay);
    }
}

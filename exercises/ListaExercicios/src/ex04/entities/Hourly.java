package ex04.entities;

import java.util.Scanner;

public class Hourly extends Employee {
    private String name;
    private Double pay, hour;



    public Hourly() {}

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
        String h_name;
        double h_taxHour, h_hour;


        System.out.print("Nome: ");
        h_name = in.nextLine();


        System.out.print("Horas de trabalho: ");
        h_hour = in.nextDouble();

        System.out.print("Taxa por hora: R$");
        h_taxHour = in.nextDouble();


        setName(h_name);
        setHour(h_hour);
        setPay(getHour() * h_taxHour);
    }

    public Double getHour() { return hour; }

    public void setHour(Double hour) { this.hour = hour; }

    public void addHours(Double add) { setHour(this.hour + add); }
}

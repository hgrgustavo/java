package ex01.entities;

import java.util.Scanner;

public class Midia {
    private int code;
    private double price;
    private String name;

    
    /*
    public Midia() { }
    public Midia(Integer c, Double p, String n) {
        setCode(c);
        setPrice(p);
        setName(n);
    }
    */
    

    public int getCode() { return this.code; }
    public void setCode(Integer c) { this.code = c; }

    public double getPrice() { return this.price; }
    public void setPrice(Double p) { this.price = p; }

    public String getName() { return this.name; }
    public void setName(String n) { this.name = n; }



    public String getType() { return "Tipo: "; }
    
    public String getDetails() { return String.format(""" 
        
        Detalhes

        Código: %o
        Nome: %s
        Preço: R$%.2f""", getCode(), getName(), getPrice());
    }

    public void printData() { System.out.print(getDetails() + "\n" + getType()); }

    public void insertData()
    {
        Scanner in = new Scanner(System.in);

        int prd_code;
        double prd_price;
        String prd_name;


        System.out.print("~ Código do produto: ");
        prd_code = in.nextInt();

        System.out.print("~ Preço do produto: R$");
        prd_price = in.nextDouble();

        System.out.print("~ Nome do produto: ");
        prd_name = in.nextLine();
        in.nextLine();

        setCode(prd_code);
        setName(prd_name);
        setPrice(prd_price);
    }

}
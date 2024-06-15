package ex05.entities;

import java.util.Scanner;

public class Carro extends Veiculos {
    private int km;


    public Carro(String modelo, double preco, int km) {
        super(modelo, preco);
        this.km = km;
    }

    public Carro() {
    }

    public double getPreco() { return super.getPreco(); }

    public void setKm(int km) { this.km = km; }

    public void inserirDados() {
        Scanner in = new Scanner(System.in);

        double preco;
        String modelo;


        System.out.print("Modelo: ");
        modelo = in.nextLine();
        in.nextLine();

        System.out.print("Preço: R$");
        preco = in.nextDouble();

        System.out.print("KM total: : ");
        this.km = in.nextInt();


        super.setPreco(preco);
        super.setModelo(modelo);
        setKm(km);


        if(km > 100000) { super.setPreco(super.getPreco() - (super.getPreco() * 0.8)); }
    }
}

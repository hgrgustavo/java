package ex05.entities;

import java.util.Scanner;

public class Moto extends Veiculos {
    private int ano;


    public Moto() {
    }

    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    public double getPreco() { return super.getPreco(); }

    public void setAno(int ano) { this.ano = ano; }

    public void inserirDados() {
        Scanner in = new Scanner(System.in);

        double preco;
        String modelo;


        System.out.print("Modelo: ");
        modelo = in.nextLine();
        in.nextLine();

        System.out.print("Preço: R$");
        preco = in.nextDouble();

        System.out.print("Ano: ");
        this.ano = in.nextInt();


        super.setPreco(preco);
        super.setModelo(modelo);
        setAno(ano);


        if(ano > 2007) { super.setPreco(super.getPreco() + (super.getPreco() * 0.1)); }
    }
}

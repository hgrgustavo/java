package ex05.entities;

public class Veiculos {
    private String modelo;
    private double preco;

    public Veiculos() {}

    public Veiculos(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }


    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getModelo() { return modelo; }

}

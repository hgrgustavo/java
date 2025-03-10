package entities;

public class Ingresso {
    private double valor;

    // Getter & Setter
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    // Methods
    double imprimeValor() {
        return getValor();
    }

    Ingresso() {
        imprimeValor();
    }



}

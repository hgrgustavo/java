package entities;

public class Vip extends Ingresso {
    private double valorAdicional;

    // Getter & Setter
    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    // Constructor
    Vip() {
        super();
    }

    // Methods
    String imprimeVip() {
        return "R$" + getValorAdicional() + imprimeValor();
    }

}

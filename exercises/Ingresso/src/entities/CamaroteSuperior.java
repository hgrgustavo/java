package entities;

public class CamaroteSuperior extends Vip {
    private String localizacao;
    private double valorAdicional;

    // Getters & Setters
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public double getValorAdicional() {
        return valorAdicional;
    }
    @Override
    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    // Constructor

    // Methods
    String imprimeIngressor() {
        return "R$" + imprimeVip() + getValorAdicional();
    }
}

package atividade02.entities;

public class ContaEspecial extends ContaCorrente{
    private float limite;

    // Getter & Setter
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }

    // Constructor
    public ContaEspecial(String nome, Float saldo, Float limite) {
        super(nome, saldo);
        setLimite(limite);
    }

    // Methods
    public boolean sacar(Float valor) {
        if(valor >= -getLimite()) {
            sacar(valor);
            return true;
        }
        return false;
    }

    public String toString() { return ""; }     // Redundant !!








}

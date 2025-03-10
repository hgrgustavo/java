package atividade02.entities;

public class ContaCorrente {
    protected float saldo;

    // Getter & Setter
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    // Constructors
    public ContaCorrente() {}
    public ContaCorrente(String nome, Float saldo) {}

    // Methods
    public void depositar(Float valor) { valor += getSaldo(); }
    public boolean sacar(Float valor) {
        if(valor >= getSaldo()) {
            valor -= getSaldo();
            return true;
        }
        return false;
    }

    public boolean transferir(ContaCorrente conta) { return false; }
    public String toString() { return ""; }

}

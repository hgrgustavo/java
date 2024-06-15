package entities;

public class ContaCorrente {
    private double saldo;
    private String cliente;

    // Getters
    public double getSaldo() { return saldo; }
    public String getCliente() { return cliente; }

    // Setters
    public void setSaldo(double saldo) {
        if (saldo < 1) {
            saldo = 0;
        }
        this.saldo = saldo;
    }
    public void setCliente(String cliente) { this.cliente = cliente; }

    // Constructor
    public ContaCorrente (float saldo, String cliente) {
        setSaldo(saldo);
        setCliente(cliente);
    }


}

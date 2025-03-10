package modelo.entidades;

public class Recibo {
    private Double pagamento, taxa;

    public Recibo() {
    }

    public Recibo(Double pagamento, Double taxa) {
        this.pagamento = pagamento;
        this.taxa = taxa;
    }

    public Double getPagamento() {
        return pagamento;
    }

    public void setPagamento(Double pagamento) {
        this.pagamento = pagamento;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double getTotal() { return getPagamento() + getTaxa(); }
}

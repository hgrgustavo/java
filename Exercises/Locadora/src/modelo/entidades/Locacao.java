package modelo.entidades;

import java.time.LocalDateTime;

public class Locacao {
    private LocalDateTime inicio;
    private LocalDateTime fim;

    private Veiculo veiculo;
    private Recibo recibo;

    public Locacao() {}

    public Locacao(LocalDateTime i, LocalDateTime f, Veiculo v) {
        this.inicio = i;
        this.fim = f;
        this.veiculo = v;
    }


    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
    }
}

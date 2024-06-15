package modelo.servicos;

public class TaxaBrasil implements ServicoTaxa {
    public double taxa(double quantia) {
        if(quantia <= 100) {
            return quantia * 0.2;
        }
        else {
            return quantia * 0.15;
        }
    }
}

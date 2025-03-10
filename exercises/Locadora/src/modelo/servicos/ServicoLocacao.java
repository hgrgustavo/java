package modelo.servicos;

import java.time.Duration;
import modelo.entidades.*;

public class ServicoLocacao {
   private Double preco_diaria, preco_hora;
   private ServicoTaxa servicoTaxa;


    public ServicoLocacao(Double preco_diaria, Double preco_hora, ServicoTaxa servicoTaxa) {
        this.preco_diaria = preco_diaria;
        this.preco_hora = preco_hora;
        this.servicoTaxa = servicoTaxa;
    }

    public void processoRecibo(Locacao locacao) {
        double minutos = Duration.between(locacao.getInicio(), locacao.getFim()).toMinutes();
        double horas = minutos / 60;
        double pagamento, taxa;


        if(horas <= 12) {
            pagamento = this.preco_hora * Math.ceil(horas);
        }
        else {
            pagamento = preco_diaria * Math.ceil(horas / 24);
        }

        taxa = servicoTaxa.taxa(pagamento);

        locacao.setRecibo(new Recibo(pagamento, taxa));

    }
}

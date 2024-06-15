package app;

import java.text.ParseException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Locale;
import java.util.Scanner;

import modelo.entidades.*;
import modelo.servicos.*;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = in.nextLine();
        System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(in.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(in.nextLine(), fmt);

        Locacao loc = new Locacao(start, finish, new Veiculo(carModel));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = in.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = in.nextDouble();

        ServicoLocacao sl = new ServicoLocacao(pricePerDay, pricePerHour, new TaxaBrasil());


        System.out.println("FATURA:");
        System.out.println("Pagamento basico: " + String.format("%.2f", in.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", in.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", in.getInvoice().getTotalPayment()));

        in.close();

        
    }
}

package app;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.Payment;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



// ↓
public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ContractService contractService = new ContractService(new Payment());
        Contract contract;
        LocalDate contract_date;

        int contract_num, contract_installment;
        double contract_value;



        System.out.print("Entre com os dados do contrato: ");
        System.out.print("\n\n~ N° ");
        contract_num = in.nextInt();

        System.out.print("~ Data (dd/MM/yyyy): ");
        contract_date = LocalDate.parse(in.next(), dateFormat);

        System.out.print("~ Valor: R$");
        contract_value = in.nextDouble();

        System.out.print("~ Quantidade de parcelas: ");
        contract_installment = in.nextInt();

        contract = new Contract(contract_date, contract_num, contract_value);


        System.out.print("\n\nParcelas ↓\n");

        contractService.generateContract(contract, contract_installment);

        for(Installment installment : contract.getInstallmentList()) {
            System.out.println(installment);
        }

        System.out.printf("""
                    \s
                    Valor total das parcelas: R$%.2f
                    N° Contrato: %d
                    \s
                    """, contractService.getTotalValue(), contract_num
                );




    }
}

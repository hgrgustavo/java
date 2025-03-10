package app;


import entities.Brazil;
import entities.Usa;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double value;
        int month;



        System.out.print("~ Quantia do empréstimo: R$");
        value = in.nextDouble();

        System.out.print("~ Meses de duração: ");
        month = in.nextInt();



        Brazil br = new Brazil();
        Usa usa = new Usa();



        System.out.printf("\n~ Valor a pagar em %d meses no Brasil: R$%.2f", month, br.payment(value, month));
        System.out.printf("\n~ Valor a pagar em %d meses nos Estados Unidos: $%.2f", month, usa.payment(value, month));
    }
}

package aplication;

import java.util.Scanner;
import entities.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("> Nome: ");
        String nome = sc.nextLine();

        System.out.print("> Saldo de " + nome);
        float saldo = sc.nextFloat();

        ContaCorrente cc = new ContaCorrente(saldo, nome);

        System.out.print("> Nome do cliente: " + nome);
        System.out.print("> Saldo do cliente: " + saldo);

    }
}

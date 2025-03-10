package atividade01.app;

import java.util.Scanner;
import atividade01.entities.*;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome, departamento;
        float salario, comissao;

        System.out.print("\n. . . Insira os dados abaixo . . .");

        System.out.print("\n\n> Nome: ");
        nome = sc.nextLine();

        System.out.print("\n> Salário de " + nome + ":" );
        salario = sc.nextFloat();

        System.out.print("\n> Departamento de" + nome + ":");
        departamento = sc.nextLine();

        System.out.print("\n> Comissão de" + nome + ":");
        comissao = sc.nextFloat();

        Empregado emp = new Empregado(nome, salario);
        Gerente ger = new Gerente(nome, salario, departamento);
        Vendedor ven = new Vendedor(nome, salario, comissao);

        System.out.print(emp + "\n\n" + ger + "\n\n" + ven);
    }
}

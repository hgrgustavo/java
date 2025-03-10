package app;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import entities.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<PessoaFisica> listPF = new ArrayList<>();
    static List<PessoaJuridica> listPJ = new ArrayList<>();

    public static void main(String[] args) {
        int n, i, contrib_numFuncionario;
        char contrib_cadastro;
        double contrib_renda = 0, contrib_gasto = 0;


        String contrib_nome;


        System.out.print("~ N° Contribuintes: ");
        n = sc.nextInt();

        for(i = 0; i < n; i++) {
            System.out.format("\nContribuinte #%d", i++);
            System.out.print("\n~ Pessoa Física ou Jurídica? (f / j): ");
            contrib_cadastro = sc.next().charAt(0);


            System.out.print("~ Nome: ");
            contrib_nome = sc.nextLine();

            sc.nextLine();

            System.out.print("~ Renda anual: R$");
            contrib_renda = sc.nextDouble();

            switch(contrib_cadastro) {
                case 'f':
                    System.out.print("~ Gastos com saúde: R$");
                    contrib_gasto = sc.nextDouble();
                    listPF.add(new PessoaFisica(contrib_nome, contrib_renda, contrib_gasto));
                    break;

                case 'j':
                    System.out.print("~ Número de funcionarios: ");
                    contrib_numFuncionario = sc.nextInt();
                    listPJ.add(new PessoaJuridica(contrib_nome, contrib_renda, contrib_numFuncionario));
                    break;
            }
        }

        System.out.print("\n\nContribuintes Pessoa Física");
        for(PessoaFisica show : listPF) {
            System.out.format("""
                    Nome: %s
                    Renda: R$%.2f
                    Gastos com saúde: R$ %.2f
                    Imposto: %.2f
                    \n
                    \n
                    """, show.getNome(), show.getRenda(), show.getPf_gasto(), show.imposto(contrib_gasto));
        }

        System.out.print("\n\nContribuintes Pessoa Jurídica");
        for(PessoaJuridica show : listPJ) {
            System.out.format("""
                    Nome: %s
                    Renda: R$%.2f
                    Nº Funcionários: %d
                    Imposto: R$%.2f
                    \n
                    \n
                    """, show.getNome(), show.getRenda(), show.getPj_numFuncionario(), show.imposto(contrib_renda));
        }
    }
}
package ex03.entities;

import java.util.Scanner;

public class Arquivo
{
    private int kbytes;
    private double preco;
    private String autor;

    public Arquivo() { }
    public Arquivo(int k, double p, String a)
    {
        this.kbytes = k;
        this.preco = p;
        this.autor = a;
    }

    public String getTipo() { return "Tipo: "; }
    public String getDetalhes()
    {
        return String.format("""
                
                Detalhes
                
                Capacidade: %o
                Preço: R$%.2f
                Autor: %s""", this.kbytes, this.preco, this.autor);
    }

    public void printDados() { System.out.print(getDetalhes()); }

    public void inserirDados()
    {
        Scanner in = new Scanner(System.in);

        int k;
        double p;
        String a;

        System.out.print("\n~ Kilobytes:  ");
        k = in.nextInt();

        System.out.print("~ Preço: R$");
        p = in.nextDouble();

        System.out.print("~ Autor: ");
        a = in.nextLine();
        in.nextLine();
    }
}

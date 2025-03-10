package ex05.app;

import ex05.entities.Veiculos;

import java.util.Scanner;
import ex05.entities.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Veiculos[] lista = new Veiculos[2];

        int escolha, i;
        double total = 0;



        for(i = 0; i < 2; i++) {
            System.out.print("""
                    Digite
                    
                    [1] Moto
                    [2] Carro
                    
                    ~\s"""
            );
            escolha = in.nextInt();


            switch(escolha) {
                case 1:
                    lista[i] = new Moto();
                    ((Moto)lista[i]).inserirDados();    // Cast

                    break;

                case 2:
                    lista[i] = new Carro();
                    ((Carro)lista[i]).inserirDados();   // Cast

                    break;
            }
        }


        for(i = 0; i < 2; i++) {
            total += lista[i].getPreco();
        }

        System.out.format("Preço Total R$%.2f", total);

    }
}
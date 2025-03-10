package ex01.app;

import ex01.entities.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Midia[] lista = new Midia[10];

        int opcao;


        for(int i = 0; i < 2; i++) {

            System.out.print("Digite 1 para CD e 2 para DVD");
            Scanner in = new Scanner(System.in);
            opcao = in.nextInt();
            if(opcao == 1) {
                lista[i] = new Cd();
                lista[i].insertData();
            }
            if(opcao == 2) {
                lista[i] = new Dvd();
                lista[i].insertData();
            }
            else {
                System.exit(0);
            }
        }

        for(int i = 0; i < 2; i++) {
            lista[i].printData();
            lista[i].getDetails();
        }
    }
}


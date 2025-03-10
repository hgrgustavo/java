package Exercicio02;

import java.util.Scanner;

class C {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("> Insira a coordenada X:\t");
        int x = sc.nextInt();
        System.out.print("> Insira a coordenada Y:\t");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.print("> Primeiro Quadrante");
            }
            if (x < 0 && y > 0) {
                System.out.print("> Segundo Quadrante");
            }
            if (x < 0 && y < 0) {
                System.out.print("> Terceiro Quadrante");
            }
            else {
                System.out.print("> Quarto Quadrante");
            }
            System.out.print("> Insira a coordenada X:\t");
            x = sc.nextInt();
            System.out.print("> Insira a coordenada Y:\t");
            y = sc.nextInt();
        }

        System.out.print("> Uma de suas coordenadas é NULA `P-P)");
        sc.close();
    }
}
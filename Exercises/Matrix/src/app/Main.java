package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        int[][] matrix;

        System.out.print("\n> Insira o tamanho da matriz:  ");
        n = sc.nextInt();

        matrix = new int[n][n];

        for(i = 0; i < matrix.length; i++) {
            for(j = 0; j < matrix[i].length; j++) {
                System.out.print("\n> Insira o valor da linha " + i + " coluna " + j);
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("\n> Diagonal principal: ");

        for(i = 0; i < matrix.length; i++) {
            System.out.print("\n> " + matrix[i][i]);
        }

        int count = 0;
        for(i = 0; i < matrix.length; i++) {
            for(j = 0; j < matrix[i].length; i++) {
                if(matrix[i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.print("\n> Números negativos: " + count);

        sc.close();

    }
}

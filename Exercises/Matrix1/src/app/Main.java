package app;
import java.util.Scanner;
import entities.Matrix;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        int i, j;
        int x;
        int[][] matrix;

        System.out.print("\n> Insert matrix row size: ");
        m = sc.nextInt();
        System.out.print("\n> Insert matrix column size: ");
        n = sc.nextInt();

        matrix = new int[m][n];

        for(i = 0; i < matrix.length; i++) {
            for(j = 0; j < matrix[i].length; j++) {
                System.out.print("\n> Insert row " + i + " column " + j + " number: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("\n> Insert a matrix number: ");
        x = sc.nextInt();

        while(!Matrix.verify(matrix, x)) {
            System.out.print("\n> This number does not exist :( Try again.");
            x = sc.nextInt();
        }

        for(i = 0; i < matrix.length; i++) {
            for(j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == x) {
                    if(j > 0) {
                        System.out.print("\n> Left: " + i + (j - 1));
                    }
                    if(i > 0) {
                        System.out.print("\n> Up: " + i + (j + 1));
                    }
                    if(i < matrix.length-1) {
                        System.out.print("\n> Right" + matrix[i][j] + 1);
                    }
                    if(i < matrix.length-1) {
                        System.out.print("\n> Down: " + matrix[i +1][j]);
                    }
                }
            }
        }







    }
}

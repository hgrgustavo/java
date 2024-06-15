package Exercicio05;

import java.util.Scanner;

class Program {
    static Scanner sc = new Scanner(System.in);

    static void divs(double[] pa, int p) {
        // Array to get every result. Size equal 'pair_size'
        double[] results_array = new double[p];

        for(int i = 0; i < p++; i++ ) {
            System.out.print("> Insert " + i+1 + "º pair: \n");
            pa[i] = sc.nextDouble();
            System.out.print("> Insert " + i+2 + "º pair: \n");
            pa[i++] = sc.nextDouble();

            // Division constraint conditions
            if(pa[i] != 0 && pa[i++] == 0) {
                System.out.print("> " + pa[i] + " / " + pa[i++] +" Is a Impossible Division :(\n");
            }
            if(pa[i] != 0 || pa[i] == 0 && pa[i++] != 0) {
                results_array[i] = pa[i] / pa[i++];
                System.out.print("> " + pa[i] + "/" + pa[i++] + " = " + results_array[i]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("> Insert the number of pairs: ");
        int pair_size = sc.nextInt();

        // Defining decimal array and allocating 'pair_size' for total size
        double[] pair_size_array;
        pair_size_array = new double[pair_size];
        
        // User inputs and pair division outputs
        divs(pair_size_array, pair_size);
    }
}
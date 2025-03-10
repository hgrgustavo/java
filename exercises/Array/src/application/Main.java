package application;

import entities.Product;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("> Insert product quantity: ");
        int n = sc.nextInt();

        Product[] array = new Product[n];

        double sum = 0;

        for(int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("\n> Insert product name: ");
            String product_name = sc.nextLine();

            System.out.print("> Insert " + product_name + " price: $");
            float  product_price = sc.nextFloat();

            array[i] = new Product(product_name, product_price);
            
            sum += array[i].getPrice();
        }

        double average = sum / array.length;

        System.out.print("\n> Prices average: $" + average);
    }
}
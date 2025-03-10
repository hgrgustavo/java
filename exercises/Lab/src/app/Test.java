package app;

import entities.Perishable;
import entities.Product;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] expiration = new int[3];

        int choice, id, quantity;
        String description;
        double value, discount;

        System.out.print("""
                . . . MENU . . .
                (1) Create product
                (2) Create perishable product
                (3) Exit
   
                >\s""");
        choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.print(". . . REGISTRATION . . . ");
                System.out.print("> Product ID: ");
                id = sc.nextInt();

                System.out.print("> Product Description: ");
                description = sc.nextLine();
                sc.nextLine();

                System.out.print("> Product Quantity: ");
                quantity = sc.nextInt();

                System.out.print("> Product Value: $");
                value = sc.nextDouble();

                Product pro = new Product(description, value);

                System.out.print(pro);
                
            case 2:
                System.out.print(". . . REGISTRATION . . . ");
                System.out.print("> Product ID: ");
                id = sc.nextInt();

                System.out.print("> Product Description: ");
                description = sc.nextLine();
                sc.nextLine();

                System.out.print("> Product Quantity: ");
                quantity = sc.nextInt();

                System.out.print("> Product Value: $");
                value = sc.nextDouble();
                
                System.out.print("> Expiration day: ");
                expiration[0] = sc.nextInt();
                
                System.out.print("> Expiration month: ");
                expiration[1] = sc.nextInt();
                
                System.out.print("> Expiration year: ");
                expiration[2] = sc.nextInt();

                Perishable per = new Perishable(description, value, expiration[0], expiration[1], expiration[2]);

                System.out.print(per);

                System.out.print("> Discount percentage: ");
                discount = sc.nextDouble();

                System.out.print(per);
                per.applyDiscount(discount);
            default:
                System.exit(0);
        }
    }
}

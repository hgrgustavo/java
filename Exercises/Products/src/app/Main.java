package app;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import entities.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i, n;
        char product_type;
        double product_price, product_fee;

        LocalDate product_date;
        String product_name;
        List<Common> list = new ArrayList<>();

        System.out.print("~ Enter the number of products: ");
        n = sc.nextInt();

        for(i = 0; i < n; i++) {
            System.out.print("~ Product #" + (i++) + " data: \n");
            System.out.print("~ Common, used or imported? (c / u / i): ");
            product_type = sc.next().charAt(0);

            System.out.print("~ Name: ");
            product_name = sc.nextLine();

            sc.nextLine();

            System.out.print("~ Price: $");
            product_price = sc.nextDouble();

            switch(product_type) {
                case 'c':
                    list.add(new Common(product_name, product_price));
                case 'u':
                    System.out.print("~ Manufacture date (DD / MM / YYYY): ");
                    product_date = LocalDate.parse(sc.nextLine());
                    // LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    list.add(new Used(product_name, product_price, product_date));
                case 'i':
                    System.out.print("~ Custom Fee: $");
                    product_fee = sc.nextDouble();
                    list.add(new Imported(product_name, product_price, product_fee));
            }
        }
        System.out.print("~\nPRICE TAGS: ");
        for(Common common: list) {
            System.out.print(common.priceTag());
        }


    }
}
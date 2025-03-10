import java.util.Scanner;
import java.util.Locale;
import entidades.Product;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        int argument_quantity, product_quantity;
        double product_price;
        String product_name;

        System.out.print(">\tEnter product data in the fields below.");
        System.out.print("> Name: ");
        product_name = sc.nextLine();

        System.out.print("> Price: ");
        product_price = sc.nextDouble();

        System.out.print("> Quantity in stock: ");
        product_quantity = sc.nextInt();

        Product pr = new Product(product_name, product_price, product_quantity);
        Product pro = new Product(product_name, product_price);

        System.out.print("> Product data: " + pr);

        System.out.print("> Enter the number of products to be added in stock: ");
        argument_quantity = sc.nextInt();
        pr.addProducts(argument_quantity);
        System.out.print("> Updated data: " + pr);

        System.out.print("> Enter the number of product to be removed from stock: ");
        argument_quantity = sc.nextInt();
        pr.removeProducts(argument_quantity);
        System.out.print("> Updated data: " + pr);



        sc.close();
    }
}
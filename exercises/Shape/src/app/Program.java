package app;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import entities.*;
import entities.enums.Color;

public class Program {
    static Scanner sc = new Scanner(System.in);
    static List<Shape> list = new ArrayList<>();

    public static void main(String[] args) {
        int i, n;
        char shape;
        double width, height, radius;

        System.out.print("~ Enter the number of shapes: ");
        n = sc.nextInt();

        for(i = 1; i <= n; i++) {
            System.out.format("""
            Shape #%d data:
            ~ Rectangle or Circle? (r/c)""", i++);
            shape = sc.next().charAt(0);

            System.out.print("\n~ Color? (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            switch(shape) {
                case 'r':
                    System.out.print("\n~ Width: ");
                    width = sc.nextDouble();

                    System.out.print("\n~ Height: ");
                    height = sc.nextDouble();

                    System.out.print("\n\nAdding rectangle configuration...");

                    list.add(new Rectangle(color, width, height));

                case 'c':
                    System.out.print("\n~ Radius: ");
                    radius = sc.nextDouble();

                    System.out.print("\n\nAdding circle configuration... ");

                    list.add(new Circle(color, radius));

            }
        }
        System.out.println("\n\nSHAPE AREAS:");
        for (Shape show : list) {
            System.out.printf("\n%.2f%n", show.area());
        }
        sc.close();
    }
}
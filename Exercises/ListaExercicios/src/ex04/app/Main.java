package ex04.app;

import ex04.entities.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Employee[] array = new Employee[2];
        Scanner in = new Scanner(System.in);
        int choice, i;

        for(i = 0; i < array.length; i++) {
            System.out.print("""
                    
                    Digite uma opção ↓
                    
                    [1] Assalariado
                    [2] Horista
                    
                    ~\s"""
            );
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    array[i] = new Salaried();
                    array[i].insertData();

                    break;
                case 2:
                    array[i] = new Hourly();
                    array[i].insertData();

                    break;
                default:
                    System.out.print("Esta opção não é válida :(");
                    System.exit(0);
            }
        }

        System.out.print("\nFolha de pagamentos\n");
        for(Employee show : array) {
            show.printPay();
            if(show instanceof Hourly) {
                ((Hourly)show).addHours(7.0);
            }
        }
    }

}

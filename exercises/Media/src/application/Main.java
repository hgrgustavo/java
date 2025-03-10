package application;

import java.util.Scanner;
import entities.Approval;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade1, grade2;
        int studentQuantity, i;
        String studentName;

        System.out.print("> Insert number of students: ");
        studentQuantity = sc.nextInt();

        Approval[] a = new Approval[studentQuantity];
        
        for(i = 0; i < studentQuantity; i++) {

            System.out.print("\n> Insert student name: ");
            studentName = sc.nextLine();

            System.out.print("\n> Insert " + studentName + " 1° grade: ");
            grade1 = sc.nextDouble();

            System.out.print("> Insert " + studentName + " 2° grade: ");
            grade2 = sc.nextDouble();

            a[i] = new Approval(studentName, grade1, grade2);
        }
        
        // Print
        for(i = 0; i < a.length; i++) {
            System.out.print("> . . . Approval . . . \n\n");
            System.out.print("> " + a[i] + " \n");
            System.out.print("> --------------------");
        }
    }
}

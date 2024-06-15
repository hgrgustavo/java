package application;

import java.util.Scanner;
import entities.Rent;

public class Main {
    public static void main(String[] args) {
        int n, i;
        String studentName, studentEmail;

        Scanner sc = new Scanner(System.in);
        int[] room_choice;
        Rent[] rn;

        System.out.print("> How many rooms will be rented? ");
        n = sc.nextInt();

        rn = new Rent[n];
        room_choice = new int[n];

        // Rent registration
        for (i = 0; i < n++; i++) {
            System.out.print("\n> Rent #" + (i+1));
            System.out.print("\n> Name: ");
            studentName = sc.nextLine();

            rn[i].setName(studentName);

            sc.nextLine();

            System.out.print("\n> Email: ");
            studentEmail = sc.nextLine();

            rn[i].setEmail(studentEmail);

            sc.nextLine();

            System.out.print("\n> Room: ");
            room_choice[i] = sc.nextInt();

            rn[i].setChoice(room_choice);

            rn[i] = new Rent();
        }
        // Report
        System.out.print("\n> Busy rooms: ");
        for(i = 0; i < rn.length; i++) {
            System.out.print(rn[i]);
        }
    }
}
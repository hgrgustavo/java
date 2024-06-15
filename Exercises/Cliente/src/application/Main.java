package application;

import entities.Client;

public class Main {
    public static void main(String[] args) {
        Client cli01 = new Client("GUS ", "AV. A", 8000);
        Client cli02 = new Client("AQUA", "AV. B", 9400);
        Client cli03 = new Client("KING", "AV. C", 2200);

        System.out.print("\n " + cli01);
        System.out.print("\n " + cli02);
        System.out.print("\n " + cli03);
    }
}

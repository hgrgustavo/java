package app;

import java.util.Scanner;
import entities.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, color, size, brand, os, sim, cpu, gpu, ram, battery, display, camera, gps;

        System.out.print("~ Insira o nome do celular: ");
        name = sc.nextLine();

        sc.nextLine();

        System.out.print("~ Insira a cor do " + name + ": ");
        color = sc.nextLine();

        sc.nextLine();

        System.out.print("~ Insira o tamanho do " + name + ": ");
        size = sc.nextLine();

        sc.nextLine();

        System.out.print("~ Insira a marca do " + name + ": ");
        brand = sc.nextLine();

        sc.nextLine();

        System.out.print("~ Insira o sistem operacional do " + name + ": ");
        os = sc.nextLine();

        sc.nextLine();

        System.out.print("~ Insira os detalhes sobre o chip SIM (dados móveis) do " + name + ": ");
        sim = sc.nextLine();

        System.out.print("~ Insira os detalhes do processador do + " + name + ": ");
        cpu = sc.nextLine();

        sc.nextLine();

        System.out.print("~ Insira os detalhes da placa de vídeo do " + name + ": ");
        gpu = sc.nextLine();

        sc.nextLine();

        System.out.print("~ Insira os detalhes da memória ram do " + name + ": ");
        ram = sc.nextLine();

        sc.nextLine();

        System.out.print("~ Insira os detalhes da bateria do " + name + ": ");
        battery = sc.nextLine();

        System.out.print("~ Insira os detalhes do display do" + name + ": ");
        display = sc.nextLine();

        sc.nextLine();

        System.out.print("~ Insira os detalhes da câmera do " + name + ": ");
        camera = sc.nextLine();

        sc.nextLine();

        System.out.print("~ Insira os detalhes do GPS do " + name + ": ");
        gps = sc.nextLine();


        switch (name) {
            case "Iphone":
                os = "IOS";
                brand = "Apple Inc.";
                Iphone15 iphone = new Iphone15(name, color, size, brand, os, sim, cpu, gpu, ram, battery, display, camera, gps);
                System.out.print(iphone);
            case "Ipad Pro":
                os = "IOS";
                brand = "Apple Inc.";
                IpadPro ipad = new IpadPro(name, color, size, brand, os, sim, cpu, gpu, ram, battery, display, camera, gps);
                System.out.print(ipad);
            default:
                name = "Prototype";
                Phone phone = new Phone(name, color, size, brand, os, sim, cpu, gpu, ram, battery, display, camera, gps);
                System.out.print(phone);
        }

    }
}

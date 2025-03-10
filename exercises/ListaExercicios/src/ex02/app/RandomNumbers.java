package ex02.app;

import ex02.entities.*;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random randomGen = new Random();
        Midia[] list = new Midia[2];


        int randomChoice, randomQuantity, i;
        double randomPrice;
        String randomName;


        for(i = 0; i < 2; i++) {
            randomChoice = randomGen.nextInt(1, 3);

            switch(randomChoice) {
                case 1:
                    System.out.print("\nCriando um Cd . . .");

                    randomPrice = 15 * randomGen.nextDouble() + 15;
                    randomName = String.format("CD N°%d", i+1);
                    randomQuantity = randomGen.nextInt(15) + 5;

                    list[i] = new Cd(i+1, randomPrice, randomName, randomQuantity);
                    break;

                case 2:
                    System.out.print("\nCriando um Dvd . . .");

                    randomPrice = 30 * randomGen.nextDouble() + 20;
                    randomName = String.format("Dvd N°%d", i+1);
                    randomQuantity = randomGen.nextInt(15) + 20;

                    list[i] = new Dvd(i+1, randomPrice, randomName, randomQuantity);
                    break;
            }
        }

        for(i = 0; i < 2; i++) {
            list[i].printData();
            list[i].getDetails();
        }


    }

}

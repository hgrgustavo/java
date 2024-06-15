package ex03.app;

import ex03.entities.*;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random randomGen = new Random();
        
        Arquivo[] list = new Arquivo[4];
        
        int i, randomChoice, randomQuant, randomCapacity;
        double randomPrice;
        String randomName;
        
        for(i = 0; i < 4; i++) {
            randomChoice = randomGen.nextInt(1, 3);
            
            switch(randomChoice) {
                case 1:
                    randomCapacity = randomGen.nextInt() / 1024;
                    randomPrice = randomGen.nextDouble() + 10;
                    randomName = String.format("MP3 Nº%d", i+1);
                    randomQuant = randomGen.nextInt();

                    if(randomQuant > 5000) { randomPrice -= randomPrice * 0.5; }

                    list[i] = new Mp3(randomCapacity, randomPrice, randomName, randomQuant );

                    break;
                case 2:
                    randomCapacity = randomGen.nextInt() / 1024;
                    randomPrice = randomGen.nextDouble() + 25;
                    randomName = String.format("MP4 Nº%d", i+1);
                    randomQuant = randomGen.nextInt();

                    if(randomQuant > 10000) { randomPrice -= randomPrice * 0.8; }

                    list[i] = new Mp4(randomCapacity, randomPrice, randomName, randomQuant );
                    
                    break;
            }
        }

        for(i = 0; i < 4; i++) {
            list[i].printDados();
            list[i].getDetalhes();
        }

           
    }
}

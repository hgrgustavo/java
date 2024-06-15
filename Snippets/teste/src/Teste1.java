

import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Teste1 {

    public static void main(String[] args) {

        File file = new File("C:\\temp");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }

    }

}
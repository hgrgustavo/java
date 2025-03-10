package Exercicio04;
import java.util.Scanner;
class Impar {
    static void restricao(int n) {
        if(n < 0 || n > 1000) {
            System.out.print("> /// /// Número Inválido! Ele deve ser entre 1 e 1000! /// ///");
        }
        System.exit(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("> Insira um valor INTEIRO: ");
        int x = sc.nextInt();

        // Restrição
        restricao(x);

        for (int i = 0; i < x; i++) {
            if (i % 2 == 0) {
                System.out.print(i+1 + "\n");
            }
        }
        sc.close();
    }
}
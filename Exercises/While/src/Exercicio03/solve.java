/* Solução errada devido a condição incoerente no WHILE.

package Exercicio03;

import java.util.Scanner;

class Switch {
    static Scanner sc = new Scanner(System.in);
    static int alcool = 0;
    static int gasolina = 0;
    static int diesel = 0;

    static void output(int e) {
        if(e > 0 && e < 5) {
            while (e > 0 && e < 5) {
                switch (e) {
                    case 1:
                        alcool++;
                        System.out.print("\t** Muito Obrigado! **\n\n");
                        System.out.print("\t!>> Bem-Vindo ao Posto <<!\n> Digite [1] para ÁLCOOL \n> Digite [2] para GASOLINA\n> Digite [3] para DIESEL\n> Digite [4] para SAIR\n>: ");
                        e = sc.nextInt();
                        break;
                    case 2:
                        gasolina++;
                        System.out.print("\t** Muito Obrigado! **\n\n");
                        System.out.print("\t!>> Bem-Vindo ao Posto <<!\n> Digite [1] para ÁLCOOL \n> Digite [2] para GASOLINA\n> Digite [3] para DIESEL\n> Digite [4] para SAIR\n>: ");
                        e = sc.nextInt();
                        break;
                    case 3:
                        diesel++;
                        System.out.print("\t** Muito Obrigado! **\n\n");
                        System.out.print("\t!>> Bem-Vindo ao Posto <<!\n> Digite [1] para ÁLCOOL \n> Digite [2] para GASOLINA\n> Digite [3] para DIESEL\n> Digite [4] para SAIR\n>: ");
                        e = sc.nextInt();
                        break;
                    case 4:
                        System.out.print("\t** Muito Obrigado! **\n\n\t$$ Quantidade de votos $$\n> ÁLCOOL: " + alcool + "\n> GASOLINA: " + gasolina + "\n> DIESEL: " + diesel);
                        break;
                        sc.close();
                }
                
            }
        }

    }
    public static void main(String[] args) {
        System.out.print("\t!>> Bem-Vindo ao Posto <<!\n> Digite [1] para ÁLCOOL \n> Digite [2] para GASOLINA\n> Digite [3] para DIESEL\n> Digite [4] para SAIR\n>: ");
        
        int escolha  = sc.nextInt();

        output(escolha);
    }
}
 */
package Exercicio03;
import java.util.Scanner;

class P {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Digite uma Opção:");
        System.out.println("[1] - Álcool");
        System.out.println("[2] - Gasolina");
        System.out.println("[3] - Diesel");
        System.out.println("[4] - Sair");

        int escolha = sc.nextInt();

        while (escolha != 4) {
            if (escolha == 1) {
                alcool = alcool + 1;
            }
            else if (escolha == 2) {
                gasolina = gasolina + 1;
            }
            else if (escolha == 3) {
                diesel = diesel + 1;
            }else {
                System.out.println("Opção Inválida!:");

            }

            System.out.println("Digite uma Opção:");
            System.out.println("[1] - Álcool");
            System.out.println("[2] - Gasolina");
            System.out.println("[3] - Diesel");
            System.out.println("[4] - Sair");

        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
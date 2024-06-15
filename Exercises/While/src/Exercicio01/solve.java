package Exercicio01;

import java.util.Scanner;
class S {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("> Digite sua senha:\t");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.print("\n> Senha incorreta, digite novamente:\t");
            senha = sc.nextInt();
        }

        System.out.print("Acesso Permitido");
    }
}
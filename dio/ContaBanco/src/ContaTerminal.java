import java.util.Scanner;

public class ContaTerminal {
    static Scanner scanner = new Scanner(System.in);

    static int numero;
    static String agencia;
    static String nome_cliente;
    static double saldo;

    public static void main(String[] args) {
        System.out.print("Por favor, digite o número da conta! ");
        numero = scanner.nextInt();

        System.out.print("Por favor, digite o número da Agência ! ");
        agencia = scanner.next();

        System.out.print("Por favor, digite o nome do cliente ! ");
        nome_cliente = scanner.next();
        scanner.nextLine();

        System.out.print("Por favor, digite o saldo ! ");
        saldo = scanner.nextDouble();
        scanner.close();

        System.out.print("\nOlá " + nome_cliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta, " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}

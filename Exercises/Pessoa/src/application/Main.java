package application;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.Person;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantas Persons serão digitadas: ");
        int Persons = sc.nextInt();

        List<Person> lista = new ArrayList<>();

        for (int i = 1; i <= Persons; i++) {
            sc.nextLine();

            System.out.printf("\n\nDados da %dª Pessoa:\n", i);

            System.out.printf("Nome: ");
            String nome = sc.nextLine();

            while (existeNome(lista, nome)) {
                System.out.println("O nome já existe na lista. Digite novamente: ");
                nome = sc.nextLine();
            }

            System.out.printf("Idade: ");
            int idade = sc.nextInt();

            lista.add(new Person(nome, idade));
        }

        Person PersonMaisVelha = MaiorIdade(lista, Persons);

        System.out.printf("A Person mais velha é: %s", PersonMaisVelha);

        sc.close();
    }

    public static boolean existeNome(List<Person> lista, String nome) {
        return lista.stream().anyMatch(x -> x.getName().equals(nome));
    }

    public static Person MaiorIdade(List<Person> lista, int idade) {
        int MaiorIdade = 0;
        Person PersonMaisVelha = null;

        for (Person x : lista) {
            if (x.getAge() > MaiorIdade) {
                MaiorIdade = x.getAge();
                PersonMaisVelha = x;
            }
        }
        return PersonMaisVelha;
    }

}

package Aula04;

import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) {
        // // 1.) Crie uma classe em java que contenha uma declaração de uma variável inteira

        // int inteiro = 123;
        // System.out.println(inteiro);

        // // 2.) Crie um programa em que você declare a variável String e atribua um valor qualquer

        // Scanner read = new Scanner(System.in);
        // String text;
        // System.out.println("Digite um texto qualquer: ");
        // text = read.nextLine();
        // System.out.println(text);

        // // 3.) Crie variáveis do tipo int, double e boolean e atribua valores a elas

        // int number;
        // System.out.println("Digite um número: ");
        // number = read.nextInt();
        // System.out.println(number);

        // double batata;
        // System.out.println("Digite um número: ");
        // batata = read.nextDouble();
        // System.out.println(batata);

        // boolean true_or_false;
        // System.out.println("Digite qualquer coisa: ");
        // true_or_false = read.hasNextDouble();
        // System.out.println(true_or_false);

        // 4.) Solicite para o usuário um número e salve em uma variável inteira

        // int userNumber;
        // Scanner read = new Scanner(System.in);
        // System.out.println("Digite um número: ");
        // userNumber = read.nextInt();
        // System.out.printf("Você digitou: %d", userNumber);
        
        // 5.) Solicite que o usuário digite o seu nome e o sobrenome, ambos devem ser salvos em variáveis diferentes e após isso você deve mostrar junto

        String nome;
        String sobrenome;

        Scanner read = new Scanner(System.in);
        System.out.println("Digite seu primeiro nome: ");
        nome = read.next();
        System.out.println("Digite seu último nome: ");
        sobrenome = read.next();
        System.out.printf("Seu nome é: " + nome + " " + sobrenome);
    }
}

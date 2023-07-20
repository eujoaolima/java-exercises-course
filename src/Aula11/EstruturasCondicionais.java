package Aula11;

import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        // Estruturas Condicionais

        // Exemplo 1:

        int n1 = 0, n2 = 11;
        if (n2 > n1) {
            System.out.print("n2 é maior que n1!");
        } else {
            System.out.print("n1 é maior que n2!");
        }

        // Exemplo 2:

        int n3 = 0, n4 = 0;
        if (n3 > n4) {
            System.out.print("n3 é maior que n4!");
        } else if (n3 == n4) {
            System.out.print("n3 é igual a n4!");
        } else {
            System.out.print("n4 é maior que n3!");
        }

        // Exemplo 3:
        Scanner read = new Scanner(System.in);
        int years;
        String name;
        System.out.println("Digite seu nome: ");
        name = read.nextLine();
        System.out.println("Digite sua idade: ");
        years = read.nextInt();

        if (years >= 18) {
            System.out.println("Você é maior de idade!");
        } else if (years > 15 && years < 18) {
            System.out.println("Você precisa completar 18 anos para acessar o site");
        } else {
            System.out.println("Por motivos de segurança, você não pode acessar o site");
        }
    }
}

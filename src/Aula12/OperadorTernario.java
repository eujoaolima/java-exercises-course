package Aula12;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        // Operador Ternário
    
        // ( VERIFICAÇÃO ) ? "Caso for verdadeiro" : "Caso for falso"
    
        // Exemplo:
            int n1 = 2, n2 = 4;
            System.out.println((n2 > n1) ? "n2 é maior que n1" : "n1 é maior que n2"); 

        // Exemplo 2:

            Scanner read = new Scanner(System.in);
            int years;
            String name;
            System.out.println("Digite seu nome: ");
            name = read.nextLine();
            System.out.println("Digite sua idade: ");
            years = read.nextInt();

            System.out.println((years >= 18) ? "Bem-vindo" : "Você não possui autorização para acessar a plataforma");
    }
    }


package Aula15;

import java.util.Scanner;

public class Atividades4 {
    public static void main (String[] args) {
        // Atividades

        // 1.) Faça um programa que leia um valor inteiro e escreva os números pares anteriores a ele;
            for (int i = 0; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
            
            System.out.println("------------------------");

        // 2.) Escreva um algoritmo que calcule a soma dos números de 1 a 15.
            Scanner read = new Scanner(System.in); 
            int resultado = 0;
            
            for (int i = 0; i <= 15; i++) {
                resultado = resultado + i;
            }
            System.out.printf("A soma dos números de 1 a 15 é: %d", resultado);

            System.out.println("------------------------");

        // 3.) Leia um número inteiro e escreva a soma dos números pares do 2 até ele.
            int n;
            int s = 0;
            System.out.println("Digite um número: ");
            n = read.nextInt();
            
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    s = s + i;
                }
            }
            System.out.println(s); // O console.log deve estar sempre fora da estrutura de repetição
            System.out.println("------------------------");

            // 4.) Leia a idade de 20 pessoas e exiba a média das idades.
            int idade;
            int sum = 0, media = 0;
            
            for (int i = 0; i < 5; i++) {
                System.out.println("Digite sua idade: ");
                idade = read.nextInt();
                sum = sum + idade;
                media = sum / 5;
            }
            System.out.println(media);
            System.out.println("------------------------");
    }
}

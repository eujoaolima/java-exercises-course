package Aula03;

import java.util.Scanner;

public class EscritaDeValores {
    public static void main(String[] args) {
        // Métodos:
        /*
         * print = Mostra uma mensagem SEM quebra de linhas
         * println = Mostra uma mensagem COM quebra de linhas
         * printf = Mostra uma mensagem na mesma linha, e quando é necessário mostrar valores (Ex: 
         * int a = 10;
         * System.out.printf("Ola %d", a);
         * )
         */

        // Método Print
        /*
         *  %d = int
         *  %c = char
         *  %s = string
         *  %l = long
         *  %f = float ou double
         *  %e = float ou double
        */

        /*
          * \t = Semelhante a tecla tab
          * \n = Cria uma nova linha
          * \" = Usa aspas duplas
        */

        Scanner read = new Scanner(System.in);
        int number;
        System.out.println("Write a number: ");
        number = read.nextInt();

        System.out.print("Você digitou: " + number);
        System.out.printf("Você digitou: %d" + number);
    }
}

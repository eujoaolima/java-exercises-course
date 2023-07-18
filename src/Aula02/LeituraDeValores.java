package Aula02;

import java.util.Scanner;

public class LeituraDeValores {
    public static void main(String[] args) {

        // Leitura de valores com a classe Scanner:
        /*
         * float || (float)leitura_dados.nextDouble();
         * int || leitura_dados.nextInt();
         * String || leitura_dados.next(); ou leitura_dados.nextLine();
         * double || leitura_dados.nextDouble();
         * boolean || leitura_dados.hasNextDouble(); ou leitura_dados.hasNextInt();
         * long || leitura_dados.nextLong();
         * char || (char)System.in.read();
         */
        
        Scanner read = new Scanner(System.in);
        int number;
        System.out.println("Write a number: ");
        number = read.nextInt();

        System.out.println(number);
    }
}

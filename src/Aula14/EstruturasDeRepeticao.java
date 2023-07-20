package Aula14;

import java.util.Scanner;

public class EstruturasDeRepeticao {
    public static void main (String[] args) {
        // Estruturas de repetição

        // Instrução FOR:
            /*
             * for (VARIÁVEL DE INICIALIZAÇÃO; ANÁLISE DA CONDIÇÃO; INCREMENTO OU DECREMENTO) {
             *      // Trecho de código que será repetido     
             * }
             */
        
        // Exemplo:
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
            }

        // Instrução WHILE:
            /*
             * while (CONDIÇÃO) {
             *  // Trecho a ser repetido
             * }
             */

        // Exemplo:
            int n1 = 0;
            while (n1 <= 10) {
                System.out.println(++n1);
            }

        // Instrução DO WHILE:
            /*
             * do {
             *     // Trecho a ser repetido 
             * } while (CONDIÇÃO)
             */
        
        // Exemplo:
            int i = 0;
            do {
                System.out.println("Estou aqui!");
                i++;
            } while (i != 9);
        
        // Exemplo 2:
            int a = 0;
            Scanner read = new Scanner(System.in);
            System.out.println("Bem-vindo ao jogo");
            do {
                System.out.println("Digite um número:");
                a = read.nextInt();
            } while(a != 9);

            System.out.println("Game over");
    }
}

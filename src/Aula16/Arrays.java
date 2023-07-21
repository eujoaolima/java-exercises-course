package Aula16;

import java.util.Scanner;

public class Arrays {
    public static void main (String[] args) {
        // Arrays

        // Semelhante a um vetor;
        // A contagem dos elementos começa a partir do zero;
        // Por padrão, independente do primitivo (o tipo da variável), ele começa sempre com zero. No caso do primitivo boolean ele é iniciado como false.

        // Exemplo
        int [] i = new int[5];
            // Estrutura:
                // 'primitivo' [] 'nome da variável' = new int[tamanho do array]; 
        System.out.println(i[0]);

        Scanner r = new Scanner(System.in);
        for (int a = 0; a < 5; a++) {
            System.out.println("Digite um número: ");
            i[a] = r.nextInt();
        }
        // System.out.println(i[3]);
        for (int l = 0; l < 5; l++) {
            System.out.println("Valor = " + i[l] + " está no elemento " + l);
        }
    }
}

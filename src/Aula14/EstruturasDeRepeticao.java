package Aula14;

public class EstruturasDeRepeticao {
    public static void main (String[] args) {
        // Estruturas de repetição

        // Instrução For:
            /*
             * for (VARIÁVEL DE INICIALIZAÇÃO; ANÁLISE DA CONDIÇÃO; INCREMENTO OU DECREMENTO) {
             *      // Trecho de código que será repetido     
             * }
             */
        
        // Exemplo:
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
            }

        // Instrução While:
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
    }
}

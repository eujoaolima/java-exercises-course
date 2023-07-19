package Aula05;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        // Exemplo de atribuição de valor:
        // int number = 10;

        // Operadores aritméticos
        /*
         * - | Subtração
         * + | Adição
         * * | Multiplicação
         * / | Divisão
         * % | Resto da divisão
         */

        int x = 15;
        int y = 12;
        int z;

        // Soma
        z = x + y;
        System.out.println(z);

        // Substração
        z = x - y;
        System.out.println(z);

        // Multiplicação
        z = x * y;
        System.out.println(z);

        // Divisão
        z = x / y;
        System.out.println(z);

        // Resto da divisão
        z = x % y;
        System.out.println(z);

        // Na divisão, ele mostra somente números inteiros se você determinar as variáveis como int, se colocar outras variáveis você terá acesso ao número completo
    }
}
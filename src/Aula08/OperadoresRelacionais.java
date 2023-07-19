package Aula08;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        // Operadores relacionais

        // > | Maior que...
        // < | Menor que...
        // >= | Maior ou igual a...
        // <= | Menor ou igual a...

        // Exemplos:
        int var1 = 0, var2 = 1;
        if (var1 > var2) {
            System.out.println("A variável 1 é maior que a variável 2");
        } else {
            System.out.println("A variável 2 é maior que a variável 1");
        }


        int var3 = 4, var4 = 4;
        if (var3 >= var4) {
            System.out.println("A variável 3 é maior ou igual a variável 4");
        } else {
            System.out.println("A variável 3 não é maior ou igual a variável 4");
        }
    }
}

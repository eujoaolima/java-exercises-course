package Aula09;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // Operadores lógicos

        // && => Quando duas expressões devem ser verdadeiras
        // || => Quando pelo menos uma expressão deve ser verdadeira

        // Exemplos:

        int var1 = 0, var2 = 0, n1 = 0, n2 = 0;

        if ((n1 > n2) && (var1 <= var2)) {
            System.out.println("Batata");
        } else {
            System.out.println("Banana");
        }

        int var3 = 0, var4 = 0, n3 = 0, n4 = 0;
        if (((n3 > n4) || (var3 <= var4)) || (n1 >n2)) {
            System.out.println("Maçã");
        } else {
            System.out.println("Morango");
        }
    }
}

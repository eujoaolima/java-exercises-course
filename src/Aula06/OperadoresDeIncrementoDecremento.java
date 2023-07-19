package Aula06;

public class OperadoresDeIncrementoDecremento {
    public static void main(String[] args) {
        // Operadores de Incremento, Decremento e Igualdade

        // ++ | Incremento soma 1
        // -- | Decremento subtrai 1

        int number = 10;
        System.out.println(number);

        number++; // number = number + 1
        System.out.println(number);

        number--; // number = number - 1
        System.out.println(number);

        // Alternativas:
        System.out.println(++number);
        System.out.println(--number);


        // Operadores de Igualdade:

        // == | É utilizado para verificar igualdade
        // != | É utilizado para verificar a diferença

        int n1 = 100;
        int n2 = 120;

        if (n2 == n1) {
            System.out.println("A igualdade é verdadeira!");
        } else if (n2 != n1) {
            System.out.println("A igualdade é falsa!");
        }
    }
}

package Aula01;

public class Variaveis {
    public static void main(String[] args) {
        // Tipos de variáveis e suas capacidades de armazenamento

        // Números inteiros
            // byte: 1 byte -> -128 até 127
            // short: 2 bytes -> -32.768 até 32.767
            // int: 4 bytes -> 	-2.147.483.648 até 2.147.483.647
            // long: 8 bytes -> -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807

        // Números racionais
            // float: 4 bytes -> ≈-3,403 x 10^38 até ≈3,403 x 10^38
            // double: 8 bytes -> ≈-1,793 x 10^308 até ≈1,793 x 10^308

        // Booleanos
            // boolean: 1 byte -> true ou false

        // Caractere (Aceita apenas 1 caractere)
            // char: 2 bytes -> 0 (caracter NUL) até 65.535 (Sem caractere definido)
            
        // Inteiros
        int number = 10;
        System.out.println(number);

        // Caracteres (O uso das aspas é diferente, para string se utiliza aspas duplas, e para char usa=se aspas simples)
        char letter = 'a';
        System.out.println(letter);

        // Short
        short number2 = 33;
        System.out.println(number2);

        // boolean (se não colocar valor na variável, o valor sempre será falso)
        boolean true_false = true;
        System.out.println(true_false);

        // String
        String phrase = "BATATABATATABATATA";
        System.out.println(phrase);

        // byte (Aceita números de -128 a 127)
        byte number3 = 127;
        System.out.println(number3);
    }
}

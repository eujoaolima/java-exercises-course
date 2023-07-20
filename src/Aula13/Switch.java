package Aula13;

public class Switch {
    public static void main(String[] args) {
        // Estrutura Switch

        // Como é utilizado:

        /*
         * switch(VERIFICAÇÃO) {
         *      case opcao1:
         *          // Executa algum código
         *      break;
         *      case opcao2:
         *          // Executa algum código
         *      break;
         *      case opcao3:
         *          // Executa algum código
         *      break;
         *      default:
         *          // Caso não entre em nennhuma condição, executa algum código (como um else)
         * }
         */

        // Exemplo:

        int dia = 1;

        switch(dia) {
            case 1:
                System.out.println("Hoje é domingo");
            break;
            case 2:
                System.out.println("Hoje é segunda-feira");
            break;
            case 3:
                System.out.println("Hoje é terça-feira");
            break;
            case 4:
                System.out.println("Hoje é quarta-feira");
            break;
            case 5:
                System.out.println("Hoje é quinta-feira");
            break;
            case 6:
                System.out.println("Hoje é sexta-feira");
            break;
            default:
                System.out.println("Hoje é sábado");
        }
    }
}

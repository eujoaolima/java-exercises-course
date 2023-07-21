package Aula17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Listas {
    public static void main (String[] args) {
        // Listas

        // Estrutura:
            List<String> lista_string = new ArrayList<String>();
            List<Integer> lista_int = new ArrayList<Integer>();

        // Adicionando valores à lista

            String n;
            Scanner r = new Scanner(System.in);
            lista_string.add("Batata");
            lista_string.add("Maçã");

            for (int i = 0; i < 3; i++) {
                System.out.println("Digite um nome: ");
                n = r.nextLine();
                lista_string .add(n);
            }

            for (String valor : lista_string) {
                System.out.println(valor);
            }

            System.out.println("----- Número de elementos -----");
            System.out.println(lista_string.size());

        // Modificando valores que já estão em uma lista
            
            System.out.println("----- Método GET -----"); // Busca os elementos da lista
            System.out.println(lista_string.get(1));

            System.out.println("----- Método SET -----"); // Altera o valor de um elemento da lista
            System.out.println(lista_string.set(1, "Pudim"));

            System.out.println("----- Lista não ordenada -----");
            for (String i : lista_string) {
                System.out.println(i);
            }
        
        // Excluindo um elemento de uma lista

            Collections.sort(lista_string);
            System.out.println("----- Lista ordenada -----");
            for (String x : lista_string) {
                System.out.println(x);
            }

            lista_string.remove(3);
            for (String y : lista_string) {
                System.out.println(y);
            }

            // Removendo TODOS os itens de uma lista
            lista_string.removeAll(lista_string);
            lista_string.add("batatinha");
            System.out.println("----- Nova lista -----");
            for (String z : lista_string) {
                System.out.println(z);
            }

            // Em resumo, para realizar um CRUD temos:
                // Método GET => nome_lista.get(posicao_elemento);
                // Método POST => nome_lista.add(valor);
                // Método PUT => nome_lista.set(posicao_elemento, novo_valor);
                // Método DELETE => nome_lista.remove(posicao_elemento) ou nome_lista.removeAll(nome_lista);
    }
}

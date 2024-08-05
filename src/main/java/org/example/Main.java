package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] codigos = {1, 2, 3, 4, 5};
        String [] nomes = {"Cachorro quente", "X-Salada", "X-Bacon", "Torrada simples", "Refrigerante"};
        double[] precos = {4.0, 4.5, 5.0, 2.0, 1.5};

        System.out.println("Qual o código do item desejado?");
        int codigo = scanner.nextInt();

        boolean itemEncontrado = false;
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigo) {

                System.out.print("Digite a quantidade do item: ");
                int quantidade = scanner.nextInt();

                double total = precos[i] * quantidade;

                System.out.println("Item: " + nomes[i]);
                System.out.println("Preço: " + precos[i]);
                System.out.println("Quantidade: " + quantidade);
                System.out.println("Total: " + total);

                itemEncontrado = true;

                break;
            }
        }
        if (!itemEncontrado){
            System.out.println("Código inválido, filhinho!");
        }

    }
}

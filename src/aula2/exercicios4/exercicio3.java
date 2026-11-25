package aula2.exercicios4;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] valores = new boolean[8];
        int contagemTrue = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Insira o valor " + (i + 1) + " (true/false): ");
            valores[i] = scanner.nextBoolean();
            if (valores[i]) {
                contagemTrue++;
            }
        }

        System.out.println("Quantidade de valores 'true' inseridos: " + contagemTrue);
        scanner.close();
    }
}

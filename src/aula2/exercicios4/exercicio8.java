package aula2.exercicios4;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] tabela = new double[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Insira o valor [" + i + "][" + j + "]: ");
                tabela[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < 2; i++) {
            double somaLinha = 0;
            for (int j = 0; j < 2; j++) {
                somaLinha += tabela[i][j];
            }
            System.out.println("Soma dos valores da linha " + i + ": " + somaLinha);
        }

        scanner.close();
    }
}
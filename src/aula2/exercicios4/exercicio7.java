package aula2.exercicios4;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        int somaTotal = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Insira o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                somaTotal += matriz[i][j];
            }
        }

        System.out.println("Soma total dos valores da matriz: " + somaTotal);
        scanner.close();
    }
}

package aula2.exercicios1;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor float (ex: 45,67): ");
        float valorFloat = scanner.nextFloat();

        long valorLong = (long) valorFloat;

        double valorDouble = valorLong;

        System.out.println("\n--- Exibição dos Valores ---");
        System.out.println("Valor float original: " + valorFloat);
        System.out.println("Valor long (casting explícito): " + valorLong);
        System.out.println("Valor double (casting implícito): " + valorDouble);

        scanner.close();
    }
}

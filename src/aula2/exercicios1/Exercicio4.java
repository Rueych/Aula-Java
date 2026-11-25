package aula2.exercicios1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número com casas decimais (double, ex: 15,89): ");
        double valorDouble = scanner.nextDouble();

        int valorInt = (int) valorDouble;

        System.out.println("Valor double original: " + valorDouble);
        System.out.println("Valor int após casting explícito: " + valorInt);

        scanner.close();
    }
}
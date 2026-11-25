package aula2.exercicios1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade (int): ");
        int idade = scanner.nextInt();

        System.out.print("Digite a altura em metros (float, ex: 1,75): ");
        float altura = scanner.nextFloat();

        System.out.print("Digite o peso em kg (double, ex: 70,5): ");
        double peso = scanner.nextDouble();

        System.out.println("\n--- Dados Digitados ---");
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");

        scanner.close();
    }
}

package aula2.exercicios1;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo (float): ");
        float largura = scanner.nextFloat();

        System.out.print("Digite a altura do retângulo (float): ");
        float altura = scanner.nextFloat();

        float area = largura * altura;

        System.out.println("Área do retângulo: " + area);

        scanner.close();
    }
}

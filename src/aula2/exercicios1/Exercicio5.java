package aula2.exercicios1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova (int): ");
        int nota1 = scanner.nextInt();

        System.out.print("Digite a nota da segunda prova (int): ");
        int nota2 = scanner.nextInt();

        System.out.print("Digite a nota da terceira prova (int): ");
        int nota3 = scanner.nextInt();

        int somaTotal = nota1 + nota2 + nota3;

        System.out.println("Soma total das notas: " + somaTotal);

        scanner.close();
    }
}
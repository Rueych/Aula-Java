package aula2.exercicios1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInt = scanner.nextInt();

        double numeroDouble = numeroInt;

        System.out.println("Valor em int: " + numeroInt);
        System.out.println("Valor em double (Casting Implícito): " + numeroDouble);

        scanner.close();
    }
}
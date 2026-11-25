package aula2.exercicios1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a condição 1 (true/false): ");
        boolean cond1 = scanner.nextBoolean();

        System.out.print("Digite a condição 2 (true/false): ");
        boolean cond2 = scanner.nextBoolean();

        System.out.print("Digite a condição 3 (true/false): ");
        boolean cond3 = scanner.nextBoolean();

        System.out.println("\n--- Operações Lógicas ---");
        System.out.println("cond1 && cond2 : " + (cond1 && cond2));
        System.out.println("cond1 || cond2 : " + (cond1 || cond2));
        System.out.println("(cond1 && cond2) || cond3 : " + ((cond1 && cond2) || cond3));
        System.out.println("cond1 && cond2 && cond3 : " + (cond1 && cond2 && cond3));

        scanner.close();
    }
}
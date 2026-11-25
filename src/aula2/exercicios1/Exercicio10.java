package aula2.exercicios1;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor pequeno para short (ex: 100): ");
        short valorShort = scanner.nextShort();

        int valorInt = valorShort;

        byte valorByte = (byte) valorShort;

        System.out.println("\n--- Exibição dos Valores ---");
        System.out.println("Valor short original: " + valorShort);
        System.out.println("Valor int (casting implícito): " + valorInt);
        System.out.println("Valor byte (casting explícito): " + valorByte);

        scanner.close();
    }
}

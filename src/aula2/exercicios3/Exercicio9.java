package aula2.exercicios3;

import java.util.Random;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int palpite;
        int tentativas = 0;

        System.out.println("Tente adivinhar o número entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("O número é maior.");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número é menor.");
            }
        } while (palpite != numeroSecreto);

        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativa(s).");

        scanner.close();
    }
}

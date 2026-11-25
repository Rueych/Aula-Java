package aula2.exercicios1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o valor pago por hora: ");
        int valorHora = scanner.nextInt();

        int salarioTotal = horasTrabalhadas * valorHora;

        System.out.println("Salário total: R$ " + salarioTotal);

        scanner.close();
    }
}
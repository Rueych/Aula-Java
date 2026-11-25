package aula2.exercicios4;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = {"Ana", "Bruno", "Clara"};

        System.out.print("Insira o nome que deseja verificar: ");
        String nomeProcurado = scanner.nextLine();

        boolean presente = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeProcurado)) {
                presente = true;
                break;
            }
        }

        if (presente) {
            System.out.println("O nome '" + nomeProcurado + "' está presente no vetor.");
        } else {
            System.out.println("O nome '" + nomeProcurado + "' NÃO está presente no vetor.");
        }

        scanner.close();
    }
}

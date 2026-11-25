package aula2.exercicios4;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        String[][] cadastro = new String[quantidade + 1][4];

        cadastro[0][0] = "ID";
        cadastro[0][1] = "Nome";
        cadastro[0][2] = "E-mail";
        cadastro[0][3] = "Telefone";

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("\n--- Cadastro da pessoa " + i + " ---");

            System.out.print("ID: ");
            cadastro[i][0] = scanner.nextLine();

            System.out.print("Nome: ");
            cadastro[i][1] = scanner.nextLine();

            System.out.print("E-mail: ");
            cadastro[i][2] = scanner.nextLine();

            System.out.print("Telefone: ");
            cadastro[i][3] = scanner.nextLine();
        }

        System.out.println("\n================ REGISTOS CADASTRADOS ================");
        for (int i = 0; i < cadastro.length; i++) {
            System.out.printf("%-6s | %-15s | %-25s | %-15s\n",
                    cadastro[i][0], cadastro[i][1], cadastro[i][2], cadastro[i][3]);

            if (i == 0) {
                System.out.println("------------------------------------------------------------------");
            }
        }

        scanner.close();
    }

}

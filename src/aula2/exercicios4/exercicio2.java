package aula2.exercicios4;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] caracteres = {"A", "B", "C", "D", "E", "F"};

        System.out.print("Insira uma letra para procurar: ");
        String busca = scanner.next();

        boolean encontrado = false;
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i].equalsIgnoreCase(busca)) {
                System.out.println("Letra '" + busca + "' encontrada na posição/índice: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("A letra '" + busca + "' não está presente no vetor.");
        }

        scanner.close();
    }
}
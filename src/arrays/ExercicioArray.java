package arrays;

import java.util.Scanner;

public class ExercicioArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantidade de notas: ");
        int qtdNotas = input.nextInt();

        double[] notas = new double[qtdNotas];

        for (int i = 0; i < qtdNotas; i++) {
            System.out.print("Insira a " + (i + 1) + " nota: ");
            notas[i] = input.nextDouble();
        }

        double total = 0;
        for (double nota : notas) {
            total += nota;
        }

        System.out.print("A média das " + qtdNotas + " foram: " + (total / qtdNotas));

        input.close();
    }
}

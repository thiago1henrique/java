package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos alunos? ");
        int qtdAlunos = input.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int qtdNotas = input.nextInt();

        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

        double total = 0;
        for(int i = 0; i < qtdAlunos; i++){
            for(int j = 0; j < qtdNotas; j++){
                System.out.print("Informe a nota do aluno " + (i + 1) + " nota número " + (j + 1) + ": ");
                notasDaTurma[i][j] = input.nextDouble();
                total += notasDaTurma[i][j];
            }
        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("A média é: " + media);



        input.close();
    }
}

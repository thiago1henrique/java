package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.print("Informe a nota: ");
            nota = input.nextDouble();

            if(nota <= 10 && nota >= 0) {
                total += nota;
                quantidadeDeNotas++;
            } else if (nota != -1) {
                System.out.println("Nota inválida.");
            }

        }

        double media = total /  quantidadeDeNotas;
        System.out.printf("Média = %.2f", media);

        input.close();
    }
}

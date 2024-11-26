package controle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a note: ");
        double nota = input.nextDouble();

        if(nota > 10 || nota < 0)
            System.out.println("Nota inválida");
        else if (nota >=7)
            System.out.println("Aprovado!");
        else if (nota < 7)
            System.out.println("Reprovado!");

        input.close();
    }
}

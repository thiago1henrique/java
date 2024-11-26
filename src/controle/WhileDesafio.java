package controle;

import java.util.Scanner;

public class WhileDesafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira algo aqui: ");
        String entrada = input.nextLine();
        System.out.println(entrada);

        while (!entrada.equals("sair")) {
            System.out.print("Insira algo aqui: ");
            entrada = input.nextLine();
            System.out.println(entrada);
        }
    }
}

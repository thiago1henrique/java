package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!");
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.printf("Nome: %s \n", nome);

        System.out.print("Me diga a sua idade: ");
        int idade = entrada.nextInt();
        System.out.printf("Olá %s, a sua idade é: %d", nome, idade);

        entrada.close();
    }
}

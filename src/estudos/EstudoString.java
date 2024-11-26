package estudos;

import java.util.Objects;
import java.util.Scanner;

public class EstudoString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira seu nome: ");
        String nome = input.nextLine();

        if (Objects.equals(nome, "")) System.out.println("Por favor, insira seu nome!");
        else {
            System.out.printf("Olá %s, bom te ver por aqui!%n", nome);

            System.out.print("Insira agora a sua idade: ");
            int idade = input.nextInt();
            System.out.printf("Você tem %d anos? Muito bem %s!!!%n", idade, nome);
        }

        System.out.println("Testando aqui\nquebra de linhas\n");

        input.close();
    }
}

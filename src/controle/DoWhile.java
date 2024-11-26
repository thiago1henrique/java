package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String texto = "";
        do {
            System.out.println("diga suas palavras: ");
            texto = input.nextLine();
        } while (!texto.equalsIgnoreCase("diga as palavras mágicas"));

        input.close();
    }
}

package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        double num1 = input.nextDouble();
        System.out.print("Insira o segundo valor: ");
        double num2 = input.nextDouble();
        System.out.print("Insira se deseja: +, -, *, /, %: ");
        String escolha = input.next();
        double resultado = escolha.equals("+") ? num1 + num2 : escolha.equals("-") ? num1 - num2
                : escolha.equals("*") ? num1 * num2 : escolha.equals("/") ? num1 / num2
                : escolha.equals("%") ? num1 % num2 : null;
        System.out.println(resultado);


    }
}

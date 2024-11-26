package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o primeiro salário: ");
        String salarioOne = input.nextLine().replace(",",".");

        System.out.print("Insira o segundo salário: ");
        String salarioTwo = input.nextLine().replace(",",".");

        System.out.print("Insira o terceiro salário: ");
        String salarioThree = input.nextLine().replace(",",".");

        double salarioOneConvert = Double.parseDouble(salarioOne);
        double salarioTwoConvert = Double.parseDouble(salarioTwo);
        double salarioThreeConvert = Double.parseDouble(salarioThree);

        double media = (salarioOneConvert + salarioTwoConvert + salarioThreeConvert) / 3;
        System.out.printf("A média é: %.2f Reais", media);

        input.close();
    }
}

package fundamentos;

import javax.swing.*;
import java.math.BigDecimal;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);


        System.out.println(valor1 + valor2);
        System.out.printf("A soma dos valores são: %.2f\n", (numero1 + numero2));
        System.out.printf("A média é: %.2f", (numero1 + numero2) / 2);

    }

}

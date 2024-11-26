package exercicioTemperatura;

public class Temperatura {
    public static void main(String[] args) {
        // (°F - 32) * 5/9 = °C
        final double FATOR = 5.0/9.0;
        final int AJUSTE = 32;

        int fahrenheit = 86;
        double celsisus = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("Resultado: " + celsisus + "°C.");


        fahrenheit = 0;
        celsisus = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("Resultado: " + celsisus + "°C.");

    }
}

package classes;

public class AreaCirc {
    double raio;
    final static double PI = 3.14;

    AreaCirc(){}

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    }
}

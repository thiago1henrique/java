package classes;

public class Jantar {
    public static void main(String[] args) {
        Comida macarrao = new Comida(0.200, "Macarrão");

        Pessoa thiago = new Pessoa("Thiago", 69.00);

        System.out.printf("Pesso inicial: %.2f\n", thiago.peso);
        thiago.comer(macarrao);
    }
}

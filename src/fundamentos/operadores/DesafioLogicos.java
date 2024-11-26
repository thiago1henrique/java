package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        boolean trabalhoUm = true;
        boolean trabalhoDois = true;

        boolean comprouTV50 = trabalhoUm && trabalhoDois;
        boolean comprouTV32 = trabalhoUm ^ trabalhoDois;
        boolean naoComrpouTV = !trabalhoUm && !trabalhoDois;

        System.out.println("Comprou a TV de 50? " + comprouTV50);
        System.out.println("Comprou a TV de 32? " + comprouTV32);


    }
}

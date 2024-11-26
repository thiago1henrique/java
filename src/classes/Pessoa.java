package classes;

public class Pessoa {

    String nome;
    double peso;

    public Pessoa(){}

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        if(comida != null) {
            peso += comida.peso;
            System.out.println("Peso final: " + peso);
        }
    }
}

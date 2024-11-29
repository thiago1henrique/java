package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add('A');
        conjunto.add(12);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1.2);

        System.out.println("Tamanho é " + conjunto.size());
        conjunto.remove('A');
        conjunto.contains('A'); //false
    }
}

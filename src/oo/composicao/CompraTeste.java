package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();

        c1.clinete = "Thiago";
        c1.adicionarItem(new Item("Caneta", 20, 7.45));
        c1.adicionarItem(new Item("Borracha", 12, 3.89));
        c1.adicionarItem(new Item("Caderno", 3, 18.79));

        System.out.println(c1.items.size());
        System.out.println(c1.obterValorTotal());
    }
}

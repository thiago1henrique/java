package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    String clinete;
    List<Item> items = new ArrayList<>();

    void adicionarItem(Item item) {
        items.add(item);
        item.compra = this;
    }

    double obterValorTotal() {
        double total = 0;

        for(Item item : items) {
            total += item.quantidade * item.preco;
        }

        return  total;
    }
}

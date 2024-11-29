package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Thiago"));
        lista.add(new Usuario("Henrique"));
        lista.add(new Usuario("Chrono"));
        lista.add(new Usuario("Marle"));

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }
    }
}

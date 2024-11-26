package classes;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto camisa = new Produto("Camisa V");
        //camisa.nome = "Camisa polo";
        camisa.preco = 39.90;

        Produto.desconto = 0.50;

        Produto calca = new Produto("Calça jeans", 150.00);

        System.out.println(calca.nome);

        System.out.println(camisa.nome);
        System.out.println(camisa.precoComDesconto());
    }
}

package org.example;

public class Carrinho {
    public static void main(String[] args) {
        Produto produto = new ProdutoSimples("Notebook", 8500.00);

        produto = new DescontoDecorator(produto, 0.10);
        produto = new ImpostoDecorator(produto, 0.25);
        produto = new FreteDecorator(produto, 50.00);

        System.out.println(produto.getDescricao());
        System.out.printf("Preço final: R$ %.2f\n", produto.getPreco());
    }
}
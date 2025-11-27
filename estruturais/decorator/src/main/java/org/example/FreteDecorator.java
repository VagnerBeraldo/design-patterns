package org.example;

public class FreteDecorator extends ProdutoDecorator {
    private double valorFrete;

    public FreteDecorator(Produto produto, double valorFrete) {
        super(produto);
        this.valorFrete = valorFrete;
    }

    public double getPreco() {
        return produto.getPreco() + valorFrete;
    }

    public String getDescricao() {
        return produto.getDescricao() + " + frete de R$ " + valorFrete;
    }
}
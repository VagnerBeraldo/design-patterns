package org.example;

public abstract class ProdutoDecorator implements Produto {
    protected Produto produto;

    public ProdutoDecorator(Produto produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return produto.getPreco();
    }

    public String getDescricao() {
        return produto.getDescricao();
    }
}
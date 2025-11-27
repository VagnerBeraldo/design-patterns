package org.example.decorator;

public abstract class ProdutoDecorator implements I_ProdutoDecorator {
    protected I_ProdutoDecorator produtoDecorado;

    public ProdutoDecorator(I_ProdutoDecorator produtoDecorado) {
        this.produtoDecorado = produtoDecorado;
    }

    public double getPreco() {
        return produtoDecorado.getPreco();
    }

    public String getDescricao() {
        return produtoDecorado.getDescricao();
    }
}
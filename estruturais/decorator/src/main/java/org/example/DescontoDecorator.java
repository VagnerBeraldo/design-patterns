package org.example;

public class DescontoDecorator extends ProdutoDecorator {
    private double percentual;

    public DescontoDecorator(Produto produto, double percentual) {
        super(produto);
        this.percentual = percentual;
    }

    public double getPreco() {
        return produto.getPreco() * (1 - percentual);
    }

    public String getDescricao() {
        return produto.getDescricao() + ": com " + (percentual * 100) + "% de desconto";
    }
}
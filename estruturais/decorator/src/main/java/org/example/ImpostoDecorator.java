package org.example;

public class ImpostoDecorator extends ProdutoDecorator {
    private double taxa;

    public ImpostoDecorator(Produto produto, double taxa) {
        super(produto);
        this.taxa = taxa;
    }

    public double getPreco() {
        return produto.getPreco() * (1 + taxa);
    }

    public String getDescricao() {
        return produto.getDescricao() + " + " + (taxa * 100) + "% de imposto";
    }
}
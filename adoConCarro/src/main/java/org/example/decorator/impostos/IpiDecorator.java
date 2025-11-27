package org.example.decorator.impostos;

import org.example.decorator.I_ProdutoDecorator;
import org.example.decorator.ProdutoDecorator;

public class IpiDecorator extends ProdutoDecorator {
    private double taxa;

    public IpiDecorator(I_ProdutoDecorator produtoDecorado, double taxa) {
        super(produtoDecorado);
        this.taxa = taxa;
    }

    @Override
    public double getPreco() {
        return produtoDecorado.getPreco() * (1 + taxa);
    }

    @Override
    public String getDescricao() {
        return produtoDecorado.getDescricao() + "\n + " + (taxa * 100) + "% de IPI";
    }
}
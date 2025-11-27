package org.example.decorator.desconto;

import org.example.decorator.I_ProdutoDecorator;
import org.example.decorator.ProdutoDecorator;

public class DescontoDecorator extends ProdutoDecorator {
    private double percentual;

    public DescontoDecorator(I_ProdutoDecorator produtoDecorado, double percentual) {
        super(produtoDecorado);
        this.percentual = percentual;
    }

    @Override
    public double getPreco() {
        return produtoDecorado.getPreco() * (1 - percentual);
    }

    @Override
    public String getDescricao() {
        return produtoDecorado.getDescricao() + ": com " + (percentual * 100) + "% de desconto";
    }
}
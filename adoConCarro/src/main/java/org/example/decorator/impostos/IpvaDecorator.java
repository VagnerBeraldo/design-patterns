package org.example.decorator.impostos;

import org.example.decorator.I_ProdutoDecorator;
import org.example.decorator.ProdutoDecorator;
import org.example.utilitariaFormatadorMoeda.FormatadorMoeda;

public class IpvaDecorator extends ProdutoDecorator {
    private double valorIpva;

    public IpvaDecorator(I_ProdutoDecorator produtoDecorado, double valorIpva) {
        super(produtoDecorado);
        this.valorIpva = valorIpva;
    }

    @Override
    public double getPreco() {
        return produtoDecorado.getPreco() + valorIpva;
    }

    @Override
    public String getDescricao() {
        return produtoDecorado.getDescricao() + "\n + IPVA de R$ " + FormatadorMoeda.formatar(valorIpva);
    }

}
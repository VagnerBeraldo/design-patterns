package org.example.decorator.impostos;

import org.example.decorator.I_ProdutoDecorator;
import org.example.decorator.ProdutoDecorator;
import org.example.utilitariaFormatadorMoeda.FormatadorMoeda;

public class LicenciamentoDecorator extends ProdutoDecorator {
    private double valorLicenciamento;

    public LicenciamentoDecorator(I_ProdutoDecorator produtoDecorado, double valorLicenciamento) {
        super(produtoDecorado);
        this.valorLicenciamento = valorLicenciamento;
    }

    @Override
    public double getPreco() {
        return produtoDecorado.getPreco() + valorLicenciamento;
    }

    @Override
    public String getDescricao() {
        return produtoDecorado.getDescricao() + "\n + Licencimento de R$ " + FormatadorMoeda.formatar(valorLicenciamento);
    }
}
package org.example.decorator.integracao;

import org.example.builder.produto.Carro;
import org.example.builder.classes_de_atributos.ValorDeCusto;
import org.example.decorator.I_ProdutoDecorator;

public class CarroDecorator implements I_ProdutoDecorator {
    private final Carro carro;

    public CarroDecorator(Carro carro) {
        this.carro = carro;
    }

    @Override
    public double getPreco() {
        ValorDeCusto valor = carro.getValorDeCusto();
        return valor != null ? valor.getValorDeCusto() : 0.0;
    }

    @Override
    public String getDescricao() {
        return carro.imprimir();
    }

    public Carro getCarro() {
        return carro;
    }
}
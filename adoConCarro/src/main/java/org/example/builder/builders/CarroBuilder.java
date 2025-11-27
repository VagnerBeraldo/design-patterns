package org.example.builder.builders;

import org.example.builder.classes_de_atributos.*;
import org.example.builder.produto.Carro;

public class CarroBuilder implements I_Builder {
    private Cor cor;
    private Rodas rodas;
    private Som som;
    private Estofamento estofamento;
    private Modelo modelo;
    private CondicaoModelo condicaoModelo;
    private ValorDeCusto valor;

    @Override
    public CarroBuilder setModelo(Modelo modelo) {
        this.modelo = modelo;
        return this;
    }

    @Override
    public CarroBuilder setCondicao(CondicaoModelo condicao) {
        this.condicaoModelo = condicao;
        return this;
    }

    @Override
    public CarroBuilder setCor(Cor cor) {
        this.cor = cor;
        return this;
    }

    @Override
    public CarroBuilder setRodas(Rodas rodas) {
        this.rodas = rodas;
        return this;
    }

    @Override
    public CarroBuilder setSom(Som som) {
        this.som = som;
        return this;
    }

    @Override
    public CarroBuilder setEstofamento(Estofamento estofamento) {
        this.estofamento = estofamento;
        return this;
    }

    @Override
    public CarroBuilder setPagamento(ValorDeCusto valor) {
        this.valor = valor;
        return this;
    }

    public Carro getResultado() {
        return new Carro(
                modelo.getEnumModelos(),
                condicaoModelo.getEnumModeloTipo(),
                cor,
                estofamento,
                rodas,
                som,
                valor
        );
    }
}
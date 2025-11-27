package org.example.builder;

import org.example.builder.builders.I_Builder;
import org.example.builder.classes_de_atributos.*;
import org.example.builder.enum_opcoes.*;

public class Diretor {

    public void construirCarroPopular(I_Builder builder) {
        builder
                .setModelo(new Modelo(EnumModelos.VOLKSWAGEM_FUSCA))
                .setCondicao(new CondicaoModelo(EnumModeloTipo.SEMI_NOVO))
                .setCor(new Cor(EnumTipoCor.PRETA))
                .setEstofamento(new Estofamento(EnumTipoEstofamento.EM_TECIDO))
                .setRodas(new Rodas(EnumTipoRoda.FERRO))
                .setSom(new Som(EnumTipoSom.DE_FABRICA))
                .setPagamento(new ValorDeCusto(25000));
    }

    public void construirCarroLuxo(I_Builder builder) {
        builder
                .setModelo(new Modelo(EnumModelos.MERCEDES_GLA_250))
                .setCondicao(new CondicaoModelo(EnumModeloTipo.NOVO))
                .setCor(new Cor(EnumTipoCor.AZUL_PEROLIZADA))
                .setEstofamento(new Estofamento(EnumTipoEstofamento.EM_COURO))
                .setRodas(new Rodas(EnumTipoRoda.LIGA_LEVE))
                .setSom(new Som(EnumTipoSom.PREMIUM))
                .setPagamento(new ValorDeCusto(180000));
    }
}
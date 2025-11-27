package org.example.builder;

import org.example.builder.builders.I_Builder;
import org.example.builder.classes_de_atributos.BordaRecheada;
import org.example.builder.classes_de_atributos.Pagamento;
import org.example.builder.classes_de_atributos.RetiradaItem;
import org.example.builder.enum_opcoes.EnumSabor;
import org.example.builder.enum_opcoes.EnumTipoPizza;

public class Diretor {
    public void construirPizza(I_Builder builder) {
        builder.setTipoPizza(EnumTipoPizza.FAMILIA);
        builder.setEnumSabor(EnumSabor.CALABRESA);
        builder.setBordaRecheada(new BordaRecheada(true, "CATUPIRI"));
        builder.setRetiradaItem(new RetiradaItem(""));
        builder.setPagamento(new Pagamento(95.0));
    }

    public void construirPizza2(I_Builder builder) {
        builder.setTipoPizza(EnumTipoPizza.BROTINHO);
        builder.setEnumSabor(EnumSabor.BAIANA);
        builder.setBordaRecheada(new BordaRecheada(false, ""));
        builder.setRetiradaItem(new RetiradaItem("CEBOLA, QUEIJO"));
        builder.setPagamento(new Pagamento(45.0));
    }


}

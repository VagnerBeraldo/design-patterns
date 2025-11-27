package org.example.builder.builders;

import org.example.builder.classes_de_atributos.BordaRecheada;
import org.example.builder.classes_de_atributos.Pagamento;
import org.example.builder.classes_de_atributos.RetiradaItem;
import org.example.builder.enum_opcoes.EnumSabor;
import org.example.builder.enum_opcoes.EnumTipoPizza;
import org.example.builder.produto.Pizza;

public class PizzaBuilder implements I_Builder {
    private EnumTipoPizza tipo;
    private BordaRecheada bordaRecheada;
    private EnumSabor enumSabor;
    private RetiradaItem retiradaItem;
    private Pagamento valor;

    @Override
    public void setTipoPizza(EnumTipoPizza tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setBordaRecheada(BordaRecheada bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }

       @Override
    public void setEnumSabor(EnumSabor enumSabor) {
        this.enumSabor = enumSabor;
    }

    @Override
    public void setRetiradaItem(RetiradaItem retiradaItem){ this.retiradaItem = retiradaItem; }

    @Override
    public void setPagamento(Pagamento valor){ this.valor = valor;}

    public Pizza getResultado() {
        return new Pizza(tipo, bordaRecheada, enumSabor, retiradaItem, valor);
    }
}
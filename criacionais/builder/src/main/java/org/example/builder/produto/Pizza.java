package org.example.builder.produto;

import org.example.builder.classes_de_atributos.BordaRecheada;
import org.example.builder.classes_de_atributos.Pagamento;
import org.example.builder.classes_de_atributos.RetiradaItem;
import org.example.builder.enum_opcoes.EnumSabor;
import org.example.builder.enum_opcoes.EnumTipoPizza;

public class Pizza {
    private final EnumTipoPizza enumTipoPizza;
    private final BordaRecheada bordaRecheada;
    private final EnumSabor enumSabor;
    private final RetiradaItem retiradaItem;
    private final Pagamento valorPizza;

    public Pizza(EnumTipoPizza enumTipoPizza, BordaRecheada bordaRecheada, EnumSabor enumSabor,
                 RetiradaItem retiradaItem, Pagamento valorPizza) {
        this.enumTipoPizza = enumTipoPizza;
        this.bordaRecheada = bordaRecheada;
        this.enumSabor = enumSabor;
        this.retiradaItem = retiradaItem;
        this.valorPizza = valorPizza;

    }

    public String imprimir() {
        String info = "";
        info += "Tamanho da pizza: " + enumTipoPizza + "\n";
        info += "Sabor: " + enumSabor + "\n";
        info += "Borda recheada: " + bordaRecheada.isRecheio() + " " + bordaRecheada.getTipoBorda() + "\n";
        info += retiradaItem + "\n";
        info += valorPizza + "\n";

        return info;
    }
}

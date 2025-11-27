package org.example.builder.builders;

import org.example.builder.classes_de_atributos.BordaRecheada;
import org.example.builder.classes_de_atributos.Pagamento;
import org.example.builder.classes_de_atributos.RetiradaItem;
import org.example.builder.enum_opcoes.EnumSabor;
import org.example.builder.enum_opcoes.EnumTipoPizza;

public interface I_Builder {
    void setTipoPizza(EnumTipoPizza tipo);
    void setBordaRecheada(BordaRecheada bordaRecheada);
    void setEnumSabor(EnumSabor enumSabor);
    void setRetiradaItem(RetiradaItem retiradaItem);
    void setPagamento(Pagamento valor);
}

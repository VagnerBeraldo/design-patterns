package org.example.builder.builders;

import org.example.builder.classes_de_atributos.*;

public interface I_Builder {
    I_Builder setModelo(Modelo modelo);
    I_Builder setCondicao(CondicaoModelo condicao);
    I_Builder setCor(Cor cor);
    I_Builder setEstofamento(Estofamento banco);
    I_Builder setRodas(Rodas roda);
    I_Builder setSom(Som som);
    I_Builder setPagamento(ValorDeCusto valor);
}
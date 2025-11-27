package org.example.builder.classes_de_atributos;

import org.example.builder.enum_opcoes.EnumTipoCor;

public class Cor {
    private EnumTipoCor cor;

    public Cor(EnumTipoCor cor) {
        this.cor = cor;
    }

    public void setCor(EnumTipoCor cor) {
        this.cor = cor;
    }

    public EnumTipoCor getCor() {
        return cor;
    }

}

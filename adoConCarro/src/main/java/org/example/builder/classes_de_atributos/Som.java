package org.example.builder.classes_de_atributos;

import org.example.builder.enum_opcoes.EnumTipoSom;

public class Som {
    private EnumTipoSom som;

    public Som(EnumTipoSom som) {
        this.som = som;
    }

    public EnumTipoSom getSom() {
        return som;
    }

    public void setSom(EnumTipoSom som) {
        this.som = som;
    }

}
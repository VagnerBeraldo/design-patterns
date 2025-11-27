package org.example.builder.classes_de_atributos;

import org.example.builder.enum_opcoes.EnumTipoRoda;

public class Rodas {
    private EnumTipoRoda roda;

    public Rodas(EnumTipoRoda roda) {
        this.roda = roda;
    }

    public EnumTipoRoda getRoda() {
        return roda;
    }

    public void setRoda(EnumTipoRoda roda) {
        this.roda = roda;
    }

}
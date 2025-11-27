package org.example.builder.classes_de_atributos;

import org.example.builder.enum_opcoes.EnumTipoEstofamento;

public class Estofamento {
    private EnumTipoEstofamento tecido;

    public Estofamento(EnumTipoEstofamento tecido) {
        this.tecido = tecido;
    }

    public EnumTipoEstofamento getTecido() {
        return tecido;
    }

    public void setTecido(EnumTipoEstofamento tecido) {
        this.tecido = tecido;
    }

}
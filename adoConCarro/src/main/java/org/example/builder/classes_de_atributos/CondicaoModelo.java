package org.example.builder.classes_de_atributos;

import org.example.builder.enum_opcoes.EnumModeloTipo;

public class CondicaoModelo {
    private EnumModeloTipo enumModeloTipo;

    public CondicaoModelo(EnumModeloTipo enumModeloTipo){
        this.enumModeloTipo = enumModeloTipo;
    }

    public EnumModeloTipo getEnumModeloTipo() {
        return enumModeloTipo;
    }

    public void setEnumModeloTipo(EnumModeloTipo enumModeloTipo) {
        this.enumModeloTipo = enumModeloTipo;
    }
}
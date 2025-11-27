package org.example.builder.classes_de_atributos;

import org.example.builder.enum_opcoes.EnumModelos;

public class Modelo {
    private EnumModelos enumModelos;

    public Modelo(EnumModelos enumModelos){
        this.enumModelos = enumModelos;
    }

    public EnumModelos getEnumModelos() {
        return enumModelos;
    }

    public void setEnumModelos(EnumModelos enumModelos) {
        this.enumModelos = enumModelos;
    }
}
package org.example.builder.classes_de_atributos;

public class RetiradaItem {
    private String item;

    public RetiradaItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Item retirado: " + item;
    }

}

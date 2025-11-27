package org.example.builder.classes_de_atributos;

public class BordaRecheada {
    private boolean recheio;
    private String tipoBorda;

    public BordaRecheada(boolean recheio, String tipoBorda) {
        this.recheio = recheio;
        this.tipoBorda = tipoBorda;
    }

    public boolean isRecheio() {
        return recheio;
    }

    public String getTipoBorda() {
        return tipoBorda;
    }

}
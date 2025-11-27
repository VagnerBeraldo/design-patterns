package org.example;

/**
 * Adaptador que permite encaixar plugues quadrados em tomadas redondas.
 */
public class SquarePlugAdapter extends RoundPlug {
    private SquarePlug plug;

    public SquarePlugAdapter(SquarePlug plug) {
        this.plug = plug;
    }

    @Override
    public double getDiametro() {
        // Calcula o diâmetro mínimo de um círculo que pode conter o plugue quadrado.
        return Math.sqrt(2) * (plug.getLado() / 2) * 2;
    }
}
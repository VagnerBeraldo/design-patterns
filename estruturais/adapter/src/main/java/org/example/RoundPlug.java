package org.example;

/**
 * Plugues redondos são compatíveis com tomadas redondas.
 */
public class RoundPlug {
    private double diametro;

    public RoundPlug() {}

    public RoundPlug(double diametro) {
        this.diametro = diametro;
    }

    public double getDiametro() {
        return diametro;
    }
}
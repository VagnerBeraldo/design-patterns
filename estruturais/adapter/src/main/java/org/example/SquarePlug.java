package org.example;

/**
 * Plugues quadrados não são compatíveis com tomadas redondas.
 * Foram desenvolvidos por outra equipe e precisam ser adaptados.
 */
public class SquarePlug {
    private double lado;

    public SquarePlug(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double getArea() {
        return Math.pow(this.lado, 2);
    }
}
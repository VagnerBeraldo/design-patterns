package org.example.builder_guru;

public class Motor {
    private final double volume;
    private double quilometragem;
    private boolean iniciado;

    public Motor(double volume, double quilometragem) {
        this.volume = volume;
        this.quilometragem = quilometragem;
    }

    public void ligado() {
        iniciado = true;
    }

    public void desligado() {
        iniciado = false;
    }

    public boolean isIniciado() {
        return iniciado;
    }

    public void prosseguir(double quilometragem) {
        if (iniciado) {
            this.quilometragem += quilometragem;
        } else {
            System.err.println("Não é possível prosseguir, você deve ligar o motor primeiro!");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getQuilometragem() {
        return quilometragem;
    }
}

package org.example.builder_guru;

public class Carro {
    private final EnumTipoCarro enumTipoCarro;
    private final int assento;
    private final Motor motor;
    private final EnumTransmissao enumTransmissao;
    private final ComputadorBordo computadorBordo;
    private final GPSNavegador gpsNavegador;
    private double combustivel = 0;

    public Carro(EnumTipoCarro enumTipoCarro, int assento, Motor motor, EnumTransmissao enumTransmissao,
                 ComputadorBordo computadorBordo, GPSNavegador gpsNavegador) {
        this.enumTipoCarro = enumTipoCarro;
        this.assento = assento;
        this.motor = motor;
        this.enumTransmissao = enumTransmissao;
        this.computadorBordo = computadorBordo;
        if (this.computadorBordo != null) {
            this.computadorBordo.setCarro(this);
        }
        this.gpsNavegador = gpsNavegador;
    }

    public EnumTipoCarro getTipoCarro() {
        return enumTipoCarro;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public ComputadorBordo getComputadorBordo() { return computadorBordo; }

    public int getAsseto() {
        return assento;
    }

    public Motor getMotor() {
        return motor;
    }

    public EnumTransmissao getTransmissao() {
        return enumTransmissao;
    }

    public GPSNavegador getGpsNavegador() {
        return gpsNavegador;
    }
}

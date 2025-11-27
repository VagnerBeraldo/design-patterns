package org.example.builder_guru;

public class ManualBuilder implements I_Builder {
    private EnumTipoCarro tipo;
    private int assento;
    private Motor motor;
    private EnumTransmissao enumTransmissao;
    private ComputadorBordo computadorBordo;
    private GPSNavegador gpsNavegador;

    @Override
    public void setTipoCarro(EnumTipoCarro tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setAssento(int assento) {
        this.assento = assento;
    }

    @Override
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void setTransmissao(EnumTransmissao enumTransmissao) {
        this.enumTransmissao = enumTransmissao;
    }

    @Override
    public void setComputadorBordo(ComputadorBordo computadorBordo) {
        this.computadorBordo = computadorBordo;
    }

    @Override
    public void setGpsNavegador(GPSNavegador gpsNavegador) {
        this.gpsNavegador = gpsNavegador;
    }

    public Manual getResultado() {
        return new Manual(tipo, assento, motor, enumTransmissao, computadorBordo, gpsNavegador);
    }
}
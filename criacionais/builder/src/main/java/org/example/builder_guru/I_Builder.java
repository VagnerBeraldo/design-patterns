package org.example.builder_guru;

public interface I_Builder {
    void setTipoCarro(EnumTipoCarro tipo);
    void setAssento(int assento);
    void setMotor(Motor motor);
    void setTransmissao(EnumTransmissao enumTransmissao);
    void setComputadorBordo(ComputadorBordo computadorBordo);
    void setGpsNavegador(GPSNavegador gpsNavegador);
}

package org.example.builder_guru;

public class Diretor {
    public void construirCarroEsporte(I_Builder builder) {
        builder.setTipoCarro(EnumTipoCarro.CARRO_ESPORTE);
        builder.setAssento(2);
        builder.setMotor(new Motor(3.0, 0));
        builder.setTransmissao(EnumTransmissao.SEMI_AUTOMATICO);
        builder.setComputadorBordo(new ComputadorBordo());
        builder.setGpsNavegador(new GPSNavegador());
    }

    public void construirCarroCidade(I_Builder builder) {
        builder.setTipoCarro(EnumTipoCarro.CARRO_CIDADE);
        builder.setAssento(2);
        builder.setMotor(new Motor(1.2, 0));
        builder.setTransmissao(EnumTransmissao.AUTOMATICO);
        builder.setComputadorBordo(new ComputadorBordo());
        builder.setGpsNavegador(new GPSNavegador());
    }

    public void construirSUV(I_Builder builder) {
        builder.setTipoCarro(EnumTipoCarro.SUV);
        builder.setAssento(4);
        builder.setMotor(new Motor(2.5, 0));
        builder.setTransmissao(EnumTransmissao.MANUAL);
        builder.setGpsNavegador(new GPSNavegador());
    }
}

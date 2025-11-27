package org.example.builder_guru;

public class Manual {
    private final EnumTipoCarro enumTipoCarro;
    private final int assento;
    private final Motor motor;
    private final EnumTransmissao enumTransmissao;
    private final ComputadorBordo computadorBordo;
    private final GPSNavegador gpsNavegador;

    public Manual(EnumTipoCarro enumTipoCarro, int assento, Motor motor, EnumTransmissao enumTransmissao,
                  ComputadorBordo computadorBordo, GPSNavegador gpsNavegador) {
        this.enumTipoCarro = enumTipoCarro;
        this.assento = assento;
        this.motor = motor;
        this.enumTransmissao = enumTransmissao;
        this.computadorBordo = computadorBordo;
        this.gpsNavegador = gpsNavegador;
    }

    public String imprimir() {
        String info = "";
        info += "Tipo de carro: " + enumTipoCarro + "\n";
        info += "Número de assentos: " + assento + "\n";
        info += "Motor: volume - " + motor.getVolume() + "; quilometragem - " + motor.getQuilometragem() + "\n";
        info += "Transmissão: " + enumTransmissao + "\n";
        if (this.computadorBordo != null) {
            info += "Computador de Bordo: Funcional" + "\n";
        } else {
            info += "Computador de Bordo: N/A" + "\n";
        }
        if (this.gpsNavegador != null) {
            info += "Navegador GPS: Funcional" + "\n";
        } else {
            info += "Navegador GPS: N/A" + "\n";
        }
        return info;
    }
}

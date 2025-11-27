package org.example.logistica;

import org.example.transportes.tipo_transporte_enum.Enum_TransporteAereo;
import org.example.transportes.I_Transporte;
import org.example.transportes.aereo.AviaoGrande;
import org.example.transportes.aereo.AviaoPequeno;

public class LogAerea extends Logistica{
    private Enum_TransporteAereo tipo;

    public LogAerea(Enum_TransporteAereo tipo){
        this.tipo = tipo;
    }

    @Override
    public I_Transporte criarTransporte() {
        switch (tipo){
            case AVIAO_GRANDE -> {
                return new AviaoGrande();
            }
            case AVIAO_PEQUENO -> {
                return new AviaoPequeno();
            }
            default -> {
                System.out.println("Transporte inexistente");
                return null;
            }
        }
    }
}

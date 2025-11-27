package org.example.logistica;

import org.example.transportes.terrestre.Carreta;
import org.example.transportes.terrestre.MiniVan;
import org.example.transportes.terrestre.Moto;
import org.example.transportes.I_Transporte;
import org.example.transportes.tipo_transporte_enum.Enum_TransporteTerrestre;

public class LogTerrestre extends Logistica {
    private Enum_TransporteTerrestre tipo;

    public LogTerrestre(Enum_TransporteTerrestre tipo){
        this.tipo = tipo;
    }

    @Override
    public I_Transporte criarTransporte() {
        switch (tipo) {
            case CARRETA -> {
                return new Carreta();
            }
            case MINIVAN -> {
                return new MiniVan();
            }
            case MOTO -> {
                return new Moto();
            }
            default -> {
                System.out.println("Transporte inexistente");
                return null;
            }
        }

    }
}

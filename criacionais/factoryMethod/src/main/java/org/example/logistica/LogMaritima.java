package org.example.logistica;

import org.example.transportes.tipo_transporte_enum.Enum_TransporteMaritimo;
import org.example.transportes.maritimo.NavioPequeno;
import org.example.transportes.maritimo.NavioGrande;
import org.example.transportes.maritimo.NavioMedio;
import org.example.transportes.I_Transporte;


public class LogMaritima extends Logistica{

    private Enum_TransporteMaritimo tipo;

    public LogMaritima(Enum_TransporteMaritimo tipo) {
        this.tipo = tipo;
    }

    @Override
    public I_Transporte criarTransporte() {
        switch (tipo) {
            case NAVIO_GRANDE -> {
                return new NavioGrande();
            }
            case NAVIO_MÉDIO -> {
                return new NavioMedio();
            }
            case NAVIO_PEQUENO -> {
                return new NavioPequeno();
            }
            default -> {
                System.out.println("Transporte inexistente");
                return null;
            }

        }
    }

    // para duas opções de transporte
//    private boolean grandePorte;
//
//    public LogMaritima(boolean grandePorte) {
//        this.grandePorte = grandePorte;
//    }
//
//    @Override
//    public Transportes criarTransporte() {
//        if(grandePorte){
//            return new NavioCargueiro();
//        }else{
//            return new EmbarcacaoMedia();
//        }
//
//    }
}

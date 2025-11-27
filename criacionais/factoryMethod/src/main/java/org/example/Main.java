package org.example;

import org.example.logistica.LogAerea;
import org.example.logistica.LogMaritima;
import org.example.logistica.LogTerrestre;
import org.example.logistica.Logistica;
import org.example.transportes.tipo_transporte_enum.Enum_TransporteAereo;
import org.example.transportes.tipo_transporte_enum.Enum_TransporteMaritimo;
import org.example.transportes.tipo_transporte_enum.Enum_TransporteTerrestre;

public class Main {
    public static void main(String[] args) {

        // Transporte terrestre
        Logistica carreta = new LogTerrestre(Enum_TransporteTerrestre.CARRETA);
        carreta.executarTransporte();

        Logistica minivan = new LogTerrestre(Enum_TransporteTerrestre.MINIVAN);
        minivan.executarTransporte();

        Logistica moto = new LogTerrestre(Enum_TransporteTerrestre.MOTO);
        moto.executarTransporte();



        // Transporte marítimo
        Logistica cargueiro = new LogMaritima(Enum_TransporteMaritimo.NAVIO_GRANDE);
        cargueiro.executarTransporte();

        Logistica embarcMedia = new LogMaritima(Enum_TransporteMaritimo.NAVIO_MÉDIO);
        embarcMedia.executarTransporte();

        Logistica embarcPequena = new LogMaritima(Enum_TransporteMaritimo.NAVIO_PEQUENO);
        embarcPequena.executarTransporte();


        // Transporte Aéreo
        Logistica aereoGrande = new LogAerea(Enum_TransporteAereo.AVIAO_GRANDE);
        aereoGrande.executarTransporte();

        Logistica aereoPequeno = new LogAerea(Enum_TransporteAereo.AVIAO_PEQUENO);
        aereoPequeno.executarTransporte();

//        condição para duas subclasses
//        Logistica terrestre = new LogRodoviaria(false);
//        terrestre.executarTransporte();
//
//        Logistica maritima = new LogMaritima(false);
//        maritima.executarTransporte();

    }
}
package org.example.transportes.terrestre;

import org.example.transportes.I_Transporte;

public class Carreta implements I_Transporte {
    @Override
    public void tipoTransporte() {
        System.out.println("Transporte por caminhão");
    }
}

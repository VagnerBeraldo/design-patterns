package org.example.transportes.aereo;

import org.example.transportes.I_Transporte;

public class AviaoPequeno implements I_Transporte {
    @Override
    public void tipoTransporte() {
        System.out.println("Transporte realizado por avião pequeno");
    }
}

package org.example.transportes.maritimo;

import org.example.transportes.I_Transporte;

public class NavioGrande implements I_Transporte {
    @Override
    public void tipoTransporte() {
        System.out.println("Transporte por barco de grande porte");
    }
}

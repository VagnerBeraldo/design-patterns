package org.example.transportes.maritimo;

import org.example.transportes.I_Transporte;

public class NavioMedio implements I_Transporte {

    @Override
    public void tipoTransporte() {
        System.out.println("Transporte por barco de médio porte");
    }
}

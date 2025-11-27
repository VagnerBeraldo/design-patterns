package org.example.logistica;

import org.example.transportes.I_Transporte;

public abstract class Logistica {
    public abstract I_Transporte criarTransporte();

    public void executarTransporte(){
        I_Transporte itransporte = criarTransporte();
        itransporte.tipoTransporte();
    }

}

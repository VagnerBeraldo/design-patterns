package org.example.produtos.italianos.pratos_principais;

import org.example.produtos.interfaces.I_PratoPrincipal;

public class PpLasanha implements I_PratoPrincipal {

    @Override
    public String getDescricao() {
        return "Lasanha";
    }
}

package org.example.produtos.italianos.pratos_principais;

import org.example.produtos.interfaces.I_PratoPrincipal;

public class PpRisoto implements I_PratoPrincipal {
    @Override
    public String getDescricao() {
        return "Risoto de cogumelos";
    }
}

package org.example.produtos.japoneses.pratos_principais;

import org.example.produtos.interfaces.I_PratoPrincipal;

public class PpYakissoba implements I_PratoPrincipal {
    @Override
    public String getDescricao(){
        return "Yakissoba com legumes e molho shoyu";
    }
}

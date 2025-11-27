package org.example.produtos.italianos.bebidas;

import org.example.produtos.interfaces.I_Bebida;

public class BbVinhoTinto implements I_Bebida {

    @Override
    public String getDescricao() {
        return "Vinho Tinto, safra de 1978";
    }
}

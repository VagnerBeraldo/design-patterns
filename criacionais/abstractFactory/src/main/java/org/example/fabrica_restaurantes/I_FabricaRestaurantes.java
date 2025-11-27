package org.example.fabrica_restaurantes;

import org.example.produtos.interfaces.I_Bebida;
import org.example.produtos.interfaces.I_Entrada;
import org.example.produtos.interfaces.I_PratoPrincipal;
import org.example.produtos.interfaces.I_Sobremesa;

public interface I_FabricaRestaurantes {
     I_PratoPrincipal criarPrato();
     I_Bebida criarBebidas();
     I_Entrada criarEntrada();
     I_Sobremesa criarSobremesa();
}

package org.example;

import org.example.produtos.interfaces.I_Entrada;
import org.example.fabrica_restaurantes.I_FabricaRestaurantes;
import org.example.produtos.interfaces.I_PratoPrincipal;
import org.example.produtos.interfaces.I_Bebida;
import org.example.produtos.interfaces.I_Sobremesa;

public class ServicoRestaurante {
    private final I_PratoPrincipal prato;
    private final I_Bebida bebida;
    private final I_Entrada entrada;
    private final I_Sobremesa sobremesa;

    public ServicoRestaurante(I_FabricaRestaurantes fabrica) {
        this.prato = fabrica.criarPrato();
        this.bebida = fabrica.criarBebidas();
        this.entrada = fabrica.criarEntrada();
        this.sobremesa = fabrica.criarSobremesa();
    }

    public void servir() {
        System.out.println("Entrada: " + entrada.getDescricao());
        System.out.println("Prato principal: " + prato.getDescricao());
        System.out.println("Bebida: " + bebida.getDescricao());
        System.out.println("Sobremesa: " + sobremesa.getDescricao());
    }
}
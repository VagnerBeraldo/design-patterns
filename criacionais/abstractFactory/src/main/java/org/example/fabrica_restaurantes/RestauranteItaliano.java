package org.example.fabrica_restaurantes;

import org.example.produtos.interfaces.I_Bebida;
import org.example.produtos.interfaces.I_Entrada;
import org.example.produtos.interfaces.I_PratoPrincipal;
import org.example.produtos.interfaces.I_Sobremesa;
import org.example.produtos.italianos.enum_cardapio.EnumTipo_BebidaItaliana;
import org.example.produtos.italianos.enum_cardapio.EnumTipo_EntradaItaliana;
import org.example.produtos.italianos.enum_cardapio.EnumTipo_PratoItaliano;
import org.example.produtos.italianos.bebidas.BbLimoncello;
import org.example.produtos.italianos.bebidas.BbVinhoTinto;
import org.example.produtos.italianos.entradas.EtBruschetta;
import org.example.produtos.italianos.entradas.EtCarpaccio;
import org.example.produtos.italianos.enum_cardapio.EnumTipo_SobremesaItaliana;
import org.example.produtos.italianos.pratos_principais.PpLasanha;
import org.example.produtos.italianos.pratos_principais.PpRisoto;
import org.example.produtos.italianos.sobremesa.SbTiramissu;
import org.example.produtos.japoneses.enum_cardapio.EnumTipo_SobremesaJaponesa;
import org.example.produtos.japoneses.sobremesa.SbMochi;

import static org.example.produtos.italianos.enum_cardapio.EnumTipo_SobremesaItaliana.TIRAMISSU;

public class RestauranteItaliano implements I_FabricaRestaurantes{
    private final EnumTipo_PratoItaliano tipoPrato;
    private final EnumTipo_BebidaItaliana tipoBebida;
    private final EnumTipo_EntradaItaliana tipoEntrada;
    private final EnumTipo_SobremesaItaliana tipoSobremesa;

    public RestauranteItaliano(EnumTipo_EntradaItaliana tipoEntrada, EnumTipo_PratoItaliano tipoPrato,
                               EnumTipo_BebidaItaliana tipoBebida, EnumTipo_SobremesaItaliana tipoSobremesa) {
        this.tipoEntrada = tipoEntrada;
        this.tipoPrato = tipoPrato;
        this.tipoBebida = tipoBebida;
        this.tipoSobremesa = tipoSobremesa;
    }

    @Override
    public I_PratoPrincipal criarPrato() {
        return switch (tipoPrato) {
            case LASANHA -> new PpLasanha();
            case RISOTO -> new PpRisoto();
        };
    }

    @Override
    public I_Bebida criarBebidas() {
        return switch (tipoBebida) {
            case VINHO_TINTO -> new BbVinhoTinto();
            case LIMONCELLO -> new BbLimoncello();
        };
    }

    @Override
    public I_Entrada criarEntrada() {
        return switch (tipoEntrada) {
            case BRUSCHETTA -> new EtBruschetta();
            case CARPACCIO -> new EtCarpaccio();
        };
    }

    @Override
    public I_Sobremesa criarSobremesa() {
        return switch (tipoSobremesa) {
            case TIRAMISSU -> new SbTiramissu();
        };
    }


}

package org.example.fabrica_restaurantes;

import org.example.produtos.interfaces.I_Bebida;
import org.example.produtos.interfaces.I_Entrada;
import org.example.produtos.interfaces.I_PratoPrincipal;
import org.example.produtos.interfaces.I_Sobremesa;
import org.example.produtos.japoneses.enum_cardapio.EnumTipo_BebidaJaponesa;
import org.example.produtos.japoneses.enum_cardapio.EnumTipo_EntradaJaponesa;
import org.example.produtos.japoneses.enum_cardapio.EnumTipo_PratoJapones;
import org.example.produtos.japoneses.bebidas.BbMacha;
import org.example.produtos.japoneses.bebidas.BbSaque;
import org.example.produtos.japoneses.entradas.EtEdamame;
import org.example.produtos.japoneses.entradas.EtSunomono;
import org.example.produtos.japoneses.enum_cardapio.EnumTipo_SobremesaJaponesa;
import org.example.produtos.japoneses.pratos_principais.PpSushi;
import org.example.produtos.japoneses.pratos_principais.PpYakissoba;
import org.example.produtos.japoneses.sobremesa.SbMochi;

public class RestauranteJapones implements I_FabricaRestaurantes{

    private final EnumTipo_PratoJapones tipoPrato;
    private final EnumTipo_BebidaJaponesa tipoBebida;
    private final EnumTipo_EntradaJaponesa tipoEntrada;
    private final EnumTipo_SobremesaJaponesa tipoSobremesa;

    public RestauranteJapones(EnumTipo_EntradaJaponesa tipoEntrada, EnumTipo_PratoJapones tipoPrato,
                              EnumTipo_BebidaJaponesa tipoBebida, EnumTipo_SobremesaJaponesa tipoSobremesa) {
        this.tipoEntrada = tipoEntrada;
        this.tipoPrato = tipoPrato;
        this.tipoBebida = tipoBebida;
        this.tipoSobremesa = tipoSobremesa;
    }


    @Override
    public I_PratoPrincipal criarPrato() {
        return switch (tipoPrato) {
            case SUSHI -> new PpSushi();
            case YAKISSOBA -> new PpYakissoba();
        };
    }

    @Override
    public I_Bebida criarBebidas() {
        return switch (tipoBebida) {
            case MACHA -> new BbMacha();
            case SAQUE -> new BbSaque();
        };
    }


    @Override
    public I_Entrada criarEntrada(){
        return switch (tipoEntrada){
            case EDAMAME -> new EtEdamame();
            case SUNOMONO -> new EtSunomono();
        };
    }

    @Override
    public I_Sobremesa criarSobremesa(){
        return switch (tipoSobremesa){
            case MOCHI -> new SbMochi();

        };
    }



}

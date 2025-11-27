package org.example.builder.produto;

import org.example.builder.classes_de_atributos.*;
import org.example.builder.enum_opcoes.EnumModeloTipo;
import org.example.builder.enum_opcoes.EnumModelos;


public class Carro {
    private final Rodas rodas;
    private final Som som;
    private final Estofamento estofamento;
    private final EnumModelos enumModelos;
    private final ValorDeCusto valorCarro;
    private final EnumModeloTipo enumModeloTipo;
    private final Cor cor;

    public Carro(EnumModelos enumModelos,
                 EnumModeloTipo enumModeloTipo,
                 Cor cor,
                 Estofamento estofamento,
                 Rodas rodas,
                 Som som,
                 ValorDeCusto valorCarro) {
        this.enumModelos = enumModelos;
        this.enumModeloTipo = enumModeloTipo;
        this.cor = cor;
        this.estofamento = estofamento;
        this.rodas = rodas;
        this.som = som;
        this.valorCarro = valorCarro;
    }

    public ValorDeCusto getValorDeCusto() {
        return valorCarro;
    }

    public String imprimir() {
        String info = "";
        info += "Marca/Modelo: " + enumModelos + "\n";
        info += "Condição: " + enumModeloTipo + "\n";
        info += "Cor: " + cor.getCor() + "\n";
        info += "Estofamento: " + estofamento.getTecido() + "\n";
        info += "Rodas: " + rodas.getRoda() + "\n";
        info += "Som: " + som.getSom() + "\n";
        info += valorCarro + "\n";

        return info;
    }
}

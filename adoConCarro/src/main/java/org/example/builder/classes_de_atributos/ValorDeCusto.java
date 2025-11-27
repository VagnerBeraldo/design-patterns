package org.example.builder.classes_de_atributos;

import org.example.utilitariaFormatadorMoeda.FormatadorMoeda;

public class ValorDeCusto {
    private double valorDeCusto;

    public ValorDeCusto(double valorDeCusto){
        this.valorDeCusto = valorDeCusto;
    }

    public double getValorDeCusto() {
        return valorDeCusto;
    }

    public void setValorDeCusto(double valorDeCusto) {
        this.valorDeCusto = valorDeCusto;
    }

    @Override
    public String toString(){
        return "Valor de Custo R$ " + FormatadorMoeda.formatar(valorDeCusto);
    }
}

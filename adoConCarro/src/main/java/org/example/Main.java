package org.example;

import org.example.builder.builders.CarroBuilder;
import org.example.builder.Diretor;
import org.example.builder.produto.Carro;
import org.example.decorator.*;
import org.example.decorator.impostos.*;
import org.example.decorator.integracao.CarroDecorator;
import org.example.utilitariaFormatadorMoeda.FormatadorMoeda;

public class Main {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        CarroBuilder builder = new CarroBuilder();

        diretor.construirCarroLuxo(builder);
        Carro carro = builder.getResultado();

        I_ProdutoDecorator produto = new CarroDecorator(carro);
        produto = new IcmsDecorator(produto, 0.15);
        produto = new IpiDecorator(produto, 0.12);
        produto = new PisECofinsDecorator(produto, 0.11);
        produto = new IpvaDecorator(produto, produto.getPreco() * 0.04);
        produto = new LicenciamentoDecorator(produto, 200);

        System.out.println("### Dados do Carro ###");
        System.out.println(produto.getDescricao());
        System.out.println("Preço final com impostos: R$ " + FormatadorMoeda.formatar(produto.getPreco()));
    }
}
package org.example.builder_simplificado;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro.Builder()
                .tipo("Sedan")
                .modelo("Civic")
                .marca("Honda")
                .ano(2022)
                .build();

        System.out.println(carro.descricao());

        Carro carro1 = new Carro.Builder()
                .tipo("SUV")
                .cor("Preta")
                .modelo("GLA 200")
                .marca("Mercedes")
                .combustivel("gasolina")
                .ano(2025)
                .arCondicionado(true)
                .build();

        System.out.println(carro1.descricao());

    }
}
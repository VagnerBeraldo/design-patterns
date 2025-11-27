package org.example;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        circulo.raio = 15;
        circulo.cor = "vermelho";

        Circulo circulo2 = (Circulo) circulo.clone();

        System.out.println(circulo.toString());
        circulo2.setRaio(8);
        System.out.println(circulo2.toString());


        Retangulo retangulo = new Retangulo();
        retangulo.largura = 10;
        retangulo.altura = 20;
        retangulo.cor = "azul";

        Retangulo retangulo2 = (Retangulo) retangulo.clone();
        retangulo2.setAltura(2);
        retangulo2.setLargura(5);

        System.out.println(retangulo.toString());
        System.out.println(retangulo2.toString());
    }
}
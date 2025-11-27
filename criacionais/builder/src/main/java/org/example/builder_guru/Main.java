package org.example.builder_guru;

public class Main {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();

        CarroBuilder builder = new CarroBuilder();
        diretor.construirCarroEsporte(builder);

        Carro carro = builder.getResultado();
        System.out.println("Carro construído:\n" + carro.getTipoCarro());

        ManualBuilder manualBuilder = new ManualBuilder();

        diretor.construirCarroEsporte(manualBuilder);
        Manual carroManual = manualBuilder.getResultado();
        System.out.println("\nManual do Carro:\n" + carroManual.imprimir());



        CarroBuilder builder1 = new CarroBuilder();
        diretor.construirCarroCidade(builder1);

        Carro carro1 = builder1.getResultado();
        System.out.println("Carro construído:\n" + carro1.getTipoCarro());

        ManualBuilder manualBuilder1 = new ManualBuilder();

        diretor.construirCarroCidade(manualBuilder1);
        Manual carroManual1 = manualBuilder1.getResultado();
        System.out.println("\nManual do Carro:\n" + carroManual1.imprimir());


        CarroBuilder builder2 = new CarroBuilder();
        diretor.construirSUV(builder2);

        Carro carro2 = builder2.getResultado();
        System.out.println("Carro construído:\n" + carro2.getTipoCarro());

        ManualBuilder manualBuilder2 = new ManualBuilder();

        diretor.construirSUV(manualBuilder2);
        Manual carroManual2 = manualBuilder2.getResultado();
        System.out.println("\nManual do Carro:\n" + carroManual2.imprimir());
    }
}

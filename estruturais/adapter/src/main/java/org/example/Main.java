package org.example;

/**
 * Código cliente simulando a compatibilidade entre plugues e tomadas.
 */
public class Main {
    public static void main(String[] args) {
        RoundSocket tomada = new RoundSocket(5);
        RoundPlug plugRedondo = new RoundPlug(5);

        if (tomada.aceita(plugRedondo)) {
            System.out.println("Plugue redondo d5 encaixa na tomada redonda d5.");
        }

        SquarePlug plugQuadradoPequeno = new SquarePlug(2);
        SquarePlug plugQuadradoGrande = new SquarePlug(20);

        // tomada.aceita(plugQuadradoPequeno); // Não compila.

        SquarePlugAdapter adaptadorPequeno = new SquarePlugAdapter(plugQuadradoPequeno);
        SquarePlugAdapter adaptadorGrande = new SquarePlugAdapter(plugQuadradoGrande);

        if (tomada.aceita(adaptadorPequeno)) {
            System.out.println("Plugue quadrado l2 encaixa na tomada redonda d5.");
        }
        if (!tomada.aceita(adaptadorGrande)) {
            System.out.println("Plugue quadrado l20 não encaixa na tomada redonda d5.");
        }
    }
}
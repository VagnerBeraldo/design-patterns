package org.example.builder;

import org.example.builder.builders.PizzaBuilder;
import org.example.builder.produto.Pizza;

public class Main {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();

        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        diretor.construirPizza(pizzaBuilder);
        Pizza carroPizza = pizzaBuilder.getResultado();
        System.out.println("\nPedido:\n" + carroPizza.imprimir());

        //novo pedido
        PizzaBuilder pizzaBuilder1 = new PizzaBuilder();
        diretor.construirPizza2(pizzaBuilder1);
        Pizza carroPizza1 = pizzaBuilder1.getResultado();
        System.out.println("\nPedido:\n" + carroPizza1.imprimir());

    }
}

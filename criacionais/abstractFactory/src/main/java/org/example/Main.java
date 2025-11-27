/*
*
* incluir:
* sobremesa para todos os restaurantes:
* Japonês Mochi e Dorayaki
* Italiano Tiramisu e Panna Cotta
*
* incluir novo restaurante Mexicano:
* Entradas Guacamole e Queso Fundido
* Pratos Principais Enchiladas e Chili con Carne
* Bebidas Horchata e Margarita
* Sobremesa Pastel de Elote e Jericalla
*
* */

package org.example;

import org.example.produtos.italianos.enum_cardapio.EnumTipo_BebidaItaliana;
import org.example.produtos.italianos.enum_cardapio.EnumTipo_EntradaItaliana;
import org.example.produtos.italianos.enum_cardapio.EnumTipo_PratoItaliano;
import org.example.produtos.italianos.enum_cardapio.EnumTipo_SobremesaItaliana;
import org.example.produtos.japoneses.enum_cardapio.EnumTipo_BebidaJaponesa;
import org.example.produtos.japoneses.enum_cardapio.EnumTipo_EntradaJaponesa;
import org.example.produtos.japoneses.enum_cardapio.EnumTipo_PratoJapones;
import org.example.fabrica_restaurantes.RestauranteItaliano;
import org.example.fabrica_restaurantes.RestauranteJapones;
import org.example.produtos.japoneses.enum_cardapio.EnumTipo_SobremesaJaponesa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*** Bem-Vindo ao Hotel Aurora ***");
        System.out.println("Escolha um tipo de restaurante:");
        System.out.println("1) Comida Japonesa\t\t2) Comida Italiana");
        System.out.print("Opção: ");
        int tipoComida = sc.nextInt();

        if (tipoComida == 1) {
            System.out.println("\nCardápio Japonês:");
            System.out.println("Escolha a entrada:");
            System.out.println("1) Edamame\t2) Sunomono");
            System.out.print("Opção: ");
            int entradaEscolhida = sc.nextInt();

            System.out.println("\nEscolha o prato:");
            System.out.println("1) Sushi\t\t2) Yakissoba");
            System.out.print("Opção: ");
            int pratoEscolhido = sc.nextInt();

            System.out.println("\nEscolha a bebida:");
            System.out.println("1) Matchá\t2) Saquê");
            System.out.print("Opção: ");
            int bebidaEscolhida = sc.nextInt();

            System.out.println("\nEscolha a sobremesa:");
            System.out.println("1) Mochi\t2) Mochi");
            System.out.print("Opção: ");
            int sobremesaEscolhida = sc.nextInt();


            EnumTipo_EntradaJaponesa entrada = (entradaEscolhida == 2) ? EnumTipo_EntradaJaponesa.SUNOMONO : EnumTipo_EntradaJaponesa.EDAMAME;
            EnumTipo_PratoJapones prato = (pratoEscolhido == 2) ? EnumTipo_PratoJapones.YAKISSOBA : EnumTipo_PratoJapones.SUSHI;
            EnumTipo_BebidaJaponesa bebida = (bebidaEscolhida == 2) ? EnumTipo_BebidaJaponesa.SAQUE : EnumTipo_BebidaJaponesa.MACHA;
            EnumTipo_SobremesaJaponesa sobremesa = (sobremesaEscolhida == 2) ? EnumTipo_SobremesaJaponesa.MOCHI : EnumTipo_SobremesaJaponesa.MOCHI;

            System.out.println("\nPedido:");
            ServicoRestaurante servico = new ServicoRestaurante(new RestauranteJapones(entrada, prato, bebida, sobremesa));
            servico.servir();


        } else if (tipoComida == 2) {
            System.out.println("\nCardápio Italiano:");
            System.out.println("Escolha a entrada:");
            System.out.println("1) Bruschetta\t2) Carpaccio");
            System.out.print("Opção: ");
            int entradaEscolhida = sc.nextInt();

            System.out.println("\nEscolha o prato:");
            System.out.println("1) Lasanha\t2) Risoto de cogumelos");
            System.out.print("Opção: ");
            int pratoEscolhido = sc.nextInt();

            System.out.println("\nEscolha a bebida:");
            System.out.println("1) Vinho Tinto\t2) Limoncello");
            System.out.print("Opção: ");
            int bebidaEscolhida = sc.nextInt();

            System.out.println("\nEscolha a sobremesa:");
            System.out.println("1) Tiramissu\t2) Tiramissu");
            System.out.print("Opção: ");
            int sobremesaEscolhida = sc.nextInt();


            EnumTipo_EntradaItaliana entrada = (entradaEscolhida == 2) ? EnumTipo_EntradaItaliana.BRUSCHETTA : EnumTipo_EntradaItaliana.CARPACCIO;
            EnumTipo_PratoItaliano prato = (pratoEscolhido == 2) ? EnumTipo_PratoItaliano.RISOTO : EnumTipo_PratoItaliano.LASANHA;
            EnumTipo_BebidaItaliana bebida = (bebidaEscolhida == 2) ? EnumTipo_BebidaItaliana.LIMONCELLO : EnumTipo_BebidaItaliana.VINHO_TINTO;
            EnumTipo_SobremesaItaliana sobremesa = (sobremesaEscolhida == 2) ? EnumTipo_SobremesaItaliana.TIRAMISSU : EnumTipo_SobremesaItaliana.TIRAMISSU;

            System.out.println("\nPedido:");
            ServicoRestaurante servico = new ServicoRestaurante(new RestauranteItaliano(entrada, prato, bebida, sobremesa));
            servico.servir();
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
        sc.close();
    }
}
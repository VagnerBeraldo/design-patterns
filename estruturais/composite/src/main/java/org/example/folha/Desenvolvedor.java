package org.example.folha;

import org.example.Empregado;

public class Desenvolvedor implements Empregado {
    private String nome;
    private long id;
    private String posicao;
    private double salario;

    public Desenvolvedor(long id, String nome, String posicao, double salario) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
        this.salario = salario;
    }

    @Override
    public void mostrarDetalhes(int nivel) {
        System.out.println("  ".repeat(nivel) + id + " - " + nome + " (" + posicao + ") - R$ " + salario);
    }

    @Override
    public double getSalario() {
        return salario;
    }
}
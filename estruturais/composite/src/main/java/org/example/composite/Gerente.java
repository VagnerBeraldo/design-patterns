package org.example.composite;

import org.example.Empregado;
import java.util.ArrayList;
import java.util.List;

public class Gerente implements Empregado {
    private String nome;
    private long id;
    private String posicao;
    private double salario;
    private List<Empregado> subordinado = new ArrayList<>();


    public Gerente(long id, String nome, String posicao, double salario) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
        this.salario = salario;
    }

    public void addEmpregado(Empregado emp) {
        subordinado.add(emp);
    }

    public void removerEmpregado(Empregado emp) {
        subordinado.remove(emp);
    }

    @Override
    public void mostrarDetalhes(int nivel) {
        System.out.println("  ".repeat(nivel) + id + " - " + nome + " (" + posicao + ") - R$ " + salario);
        for (Empregado e : subordinado) {
            e.mostrarDetalhes(nivel + 1);
        }
    }

    @Override
    public double getSalario() {
        double total = salario;
        for (Empregado e : subordinado) {
            total += e.getSalario();
        }
        return total;
    }

}
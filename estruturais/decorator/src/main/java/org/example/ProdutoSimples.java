package org.example;

public class ProdutoSimples implements Produto {
    private String descricao;
    private double preco;

    public ProdutoSimples(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }
}
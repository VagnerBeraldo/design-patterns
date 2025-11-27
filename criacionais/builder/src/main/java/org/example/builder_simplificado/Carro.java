package org.example.builder_simplificado;

public class Carro {
    private String tipo;
    private String modelo;
    private String marca;
    private int ano;
    private String cor;
    private String combustivel;
    private int numPortas;
    private boolean arCondicionado;


    // Construtor privado para forçar o uso do Builder
    private Carro(Builder builder) {
        this.tipo = builder.tipo;
        this.modelo = builder.modelo;
        this.marca = builder.marca;
        this.ano = builder.ano;
        this.cor = builder.cor;
        this.combustivel = builder.combustivel;
        this.numPortas = builder.numPortas;
        this.arCondicionado = builder.arCondicionado;
    }

    // Getters
    public String getModelo() { return modelo; }
    public String getMarca() { return marca; }
    public int getAno() { return ano; }
    public String getTipo() { return tipo; }
    public String getCor() {return cor; }
    public String getCombustivel() { return combustivel; }
    public int getNumPortas() { return numPortas; }
    public boolean isArCondicionado() { return arCondicionado; }

    // Classe Builder interna
    public static class Builder {
        private String tipo;
        private String modelo;
        private String marca;
        private int ano;
        private String cor;
        private String combustivel;
        private int numPortas;
        private boolean arCondicionado;

        public Builder tipo(String tipo){
            this.tipo = tipo;
            return this;
        }

        public Builder modelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public Builder marca(String marca) {
            this.marca = marca;
            return this;
        }

        public Builder ano(int ano) {
            this.ano = ano;
            return this;
        }

        public Builder cor(String cor){
            this.cor = cor;
            return this;
        }

        public Builder combustivel(String combustivel){
            this.combustivel = combustivel;
            return this;
        }

        public Builder numPortas(int numPortas){
            this.numPortas = numPortas;
            return this;
        }

        public Builder arCondicionado(boolean arCondicionado){
            this.arCondicionado = arCondicionado;
            return this;
        }

        public Carro build() {
            return new Carro(this);
        }
    }

    // Para exibir os dados do carro
    public String descricao() {
        StringBuilder sb = new StringBuilder("Carro: ");

        if (tipo != null) sb.append(tipo).append(" ");
        if (modelo != null) sb.append(modelo).append(" da marca ").append(marca).append(", ");
        if (ano != 0) sb.append("ano: ").append(ano).append(", ");
        if (cor != null) sb.append("cor: ").append(cor).append(", ");
        if (combustivel != null) sb.append("combustível: ").append(combustivel).append(", ");
        if (numPortas != 0) sb.append("portas: ").append(numPortas).append(", ");
        if (arCondicionado) sb.append("e possui ar-condicionado.");

        return sb.toString();
    }
}
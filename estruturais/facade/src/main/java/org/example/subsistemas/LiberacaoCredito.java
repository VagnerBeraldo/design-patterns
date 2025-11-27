package org.example.subsistemas;

public class LiberacaoCredito {
    public void liberar(String cpf, double valor) {
        System.out.printf("Crédito de R$ %.2f liberado para o %s\n", valor, cpf);
    }
}
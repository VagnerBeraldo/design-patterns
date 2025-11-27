package org.example.facade;

import org.example.subsistemas.AnaliseCredito;
import org.example.subsistemas.ConsultaScore;
import org.example.subsistemas.LiberacaoCredito;
import org.example.subsistemas.VerificacaoDocumentos;

public class SolicitacaoCreditoFacade {
    private AnaliseCredito analise;
    private VerificacaoDocumentos documentos;
    private ConsultaScore score;
    private LiberacaoCredito liberacao;

    public SolicitacaoCreditoFacade() {
        this.analise = new AnaliseCredito();
        this.documentos = new VerificacaoDocumentos();
        this.score = new ConsultaScore();
        this.liberacao = new LiberacaoCredito();
    }

    public void solicitarCredito(String cpf, double valor) {
        System.out.println("Iniciando solicitação de crédito...");

        if (!documentos.documentosValidos(cpf)) {
            System.out.println("Documentos inválidos.");
            return;
        }

        if (!analise.aprovarPerfil(cpf)) {
            System.out.println("Perfil não aprovado.");
            return;
        }

        int scoreCliente = score.obterScore(cpf);
        if (scoreCliente < 600) {
            System.out.println("Score insuficiente: " + scoreCliente);
            return;
        }

        liberacao.liberar(cpf, valor);
        System.out.println("Solicitação concluída com sucesso.");
    }
}
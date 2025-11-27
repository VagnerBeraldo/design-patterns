package org.example;

import org.example.facade.SolicitacaoCreditoFacade;

public class Main {
    public static void main(String[] args) {

        SolicitacaoCreditoFacade facade = new SolicitacaoCreditoFacade();
        facade.solicitarCredito("222.333.444-55", 5000.00);
    }

}


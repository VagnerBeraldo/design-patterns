package state.states;

import state.State;

public class EmManutencao implements State {

    @Override
    public void selecionarProduto(String produto) {
        System.out.println("Máquina em manutenção. Seleção indisponível.");
    }

    @Override
    public void pagarCafe() {
        System.out.println("Máquina em manutenção. Pagamento indisponível.");
    }

    @Override
    public void retirarProduto() {
        System.out.println("Máquina em manutenção. Retirada indisponível.");
    }
}
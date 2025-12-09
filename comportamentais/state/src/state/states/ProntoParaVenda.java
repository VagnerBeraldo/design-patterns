package state.states;

import state.State;

public class ProntoParaVenda implements State {

    @Override
    public void selecionarProduto(String produto) {
        System.out.println("Produto selecionado: " + produto);
        System.out.println("Por favor, realize o pagamento.");
    }

    @Override
    public void pagarCafe() {
        System.out.println("Pagamento recebido. Preparando sua bebida...");
       
    }

    @Override
    public void retirarProduto() {
        System.out.println("Nenhuma bebida pronta para retirada.");
    }
}

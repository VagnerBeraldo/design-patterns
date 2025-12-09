package state.states;

import state.State;

public class PreparandoBebida implements State {

    @Override
    public void selecionarProduto(String produto) {
        System.out.println("Aguarde... sua bebida está sendo preparada.");
    }

    @Override
    public void pagarCafe() {
        System.out.println("Pagamento já realizado. Preparando sua bebida.");
    }

    @Override
    public void retirarProduto() {
        System.out.println("Retire seu café. Obrigado!");
        
    }
}

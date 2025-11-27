package state.states;

import state.State;

public class SemIngrediente implements State {

    @Override
    public void selecionarProduto(String produto) {
        System.out.println("Desculpe, estamos sem ingredientes para preparar o café.");
    }

    @Override
    public void pagarCafe() {
        System.out.println("Não é possível realizar o pagamento. Ingredientes insuficientes.");
    }

    @Override
    public void retirarProduto() {
        System.out.println("Nenhum produto disponível para retirada.");
    }
}
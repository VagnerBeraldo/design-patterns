package state;

public class MaquinaCafe {
    private State estadoAtual;

    public MaquinaCafe(State estadoInicial) {
        this.estadoAtual = estadoInicial;
    }

    public void setEstado(State novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public void selecionarProduto(String produto) {
        estadoAtual.selecionarProduto(produto);
    }

    public void pagarCafe() {
        estadoAtual.pagarCafe();
    }

    public void retirarProduto() {
        estadoAtual.retirarProduto();
    }
    public State getEstadoAtual() {
        return estadoAtual;
    }
}
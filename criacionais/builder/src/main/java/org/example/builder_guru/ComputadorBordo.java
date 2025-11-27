package org.example.builder_guru;

public class ComputadorBordo {
    private Carro carro;

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void mostrarNivelCombustivel() {
        System.out.println("Nível do combustível: " + carro.getCombustivel());
    }

    public void mostrarStatus() {
        if (this.carro.getMotor().isIniciado()) {
            System.out.println("O carro é ligado");
        } else {
            System.out.println("O carro não é ligado");
        }
    }
}

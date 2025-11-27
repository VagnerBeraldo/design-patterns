package org.example.builder.classes_de_atributos;

public class Pagamento {
    private double pagamento;

    public Pagamento(double pagamento){
        this.pagamento = pagamento;
    }

    @Override
    public String toString(){
        return "Total R$ " + pagamento;
    }
}

package org.example.builder_guru;

public class GPSNavegador {
    private String rota;

    public GPSNavegador() {
        this.rota = "Rua Churchuls, 221 – Churchul, São Paulo\n\n";
    }

    public GPSNavegador(String manualRota) {
        this.rota = manualRota;
    }

    public String getRota() {
        return rota;
    }
}

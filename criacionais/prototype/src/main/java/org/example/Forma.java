package org.example;

import java.util.Objects;

public abstract class Forma {
    public String cor;

    public Forma() {
    }

    public Forma(Forma forma) {
        if (forma != null) {
            this.cor = forma.cor;
        }
    }

    public abstract Forma clone();

    @Override
    public boolean equals(Object obj2) {
        if (!(obj2 instanceof Forma)) return false;
        Forma forma2 = (Forma) obj2;
        return Objects.equals(forma2.cor, cor);
    }
}
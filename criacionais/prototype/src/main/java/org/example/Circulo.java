package org.example;

public class Circulo extends Forma {
    public int raio;

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public Circulo() {
    }

    public Circulo(Circulo forma) {
        super(forma);
        if (forma != null) {
            this.raio = forma.raio;
        }
    }

    @Override
    public Forma clone() {
        return new Circulo(this);
    }

    @Override
    public boolean equals(Object obj2) {
        if (!(obj2 instanceof Circulo) || !super.equals(obj2)) return false;
        Circulo forma2 = (Circulo) obj2;
        return forma2.raio == raio;
    }

    @Override
    public String toString() {
        return "Circulo: " +
                "raio = " + raio +
                ", cor = '" + cor + '\'';
    }


}

package org.example;

public class Retangulo extends Forma {
    public int largura;
    public int altura;

    public Retangulo() {
    }

    public Retangulo(Retangulo target) {
        super(target);
        if (target != null) {
            this.largura = target.largura;
            this.altura = target.altura;
        }
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public Forma clone() {
        return new Retangulo(this);
    }

    @Override
    public boolean equals(Object obj2) {
        if (!(obj2 instanceof Retangulo) || !super.equals(obj2)) return false;
        Retangulo forma2 = (Retangulo) obj2;
        return forma2.largura == largura && forma2.altura == altura;
    }

    @Override
    public String toString() {
        return "Retangulo: " +
                "largura = " + largura +
                ", altura = " + altura ;
    }
}
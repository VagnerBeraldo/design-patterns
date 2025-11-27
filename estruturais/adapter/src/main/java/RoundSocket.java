import org.example.RoundPlug;

/**
 * Tomadas redondas são compatíveis com plugues redondos.
 */
public class RoundSocket {
    private double diametro;

    public RoundSocket(double diametro) {
        this.diametro = diametro;
    }

    public double getDiametro() {
        return diametro;
    }

    public boolean aceita(RoundPlug plug) {
        return this.getDiametro() >= plug.getDiametro();
    }
}
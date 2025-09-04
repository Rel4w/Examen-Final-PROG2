package Domain;

import java.time.Instant;

public class GradeChange {
    private double valeur;
    private String motif;
    private Instant date;

    public GradeChange(double valeur, String motif, Instant date) {
        this.valeur = valeur;
        this.motif = motif;
        this.date = date;
    }

    public double getValeur() {
        return valeur;
    }

    public String getMotif() {
        return motif;
    }

    public Instant getDate() {
        return date;
    }
}

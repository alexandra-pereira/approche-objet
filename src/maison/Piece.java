package maison;

public abstract class Piece {
    protected double superficie;
    protected int etage;

    public Piece(double superficie, int etage) {
        if (superficie <= 0 || etage < 0) {
            throw new IllegalArgumentException("La superficie et l'étage doivent être positifs");
        }
        this.superficie = superficie;
        this.etage = etage;
    }

    public double getSuperficie() {
        return superficie;
    }

    public int getEtage() {
        return etage;
    }
}
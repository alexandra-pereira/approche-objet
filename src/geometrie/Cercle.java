package geometrie;

public class Cercle implements ObjetGeometrique {

    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public String toString() {
        return "Cercle avec rayon: " + rayon;
    }
}

package entites;

import chaines.ManipulationChaine;

public class Salarie {
    private String nom;
    private String prenom;
    private double salaire;

    // Constructeur
    public Salarie(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Salarie{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}

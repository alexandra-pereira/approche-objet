package listes;

public class Ville implements Comparable<Ville>{

    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    @Override
    public String toString() {
        return nom + " (" + nbHabitants + " hab.)";
    }

    @Override
    public int compareTo(Ville o) {
        return 0;
    }
}

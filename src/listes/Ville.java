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

//    @Override
//    public boolean equals (Object obj){
//        if (!(obj instanceof Ville)){
//            return false;
//        }
//        Ville autre = (Ville) obj;
//    }

    @Override
    public boolean equals(Object obj) {
        // Check if obj is an instance of Ville
        if (!(obj instanceof Ville)) {
            return false;
        }
        // Cast obj to Ville
        Ville autre = (Ville) obj;

        // Compare nom and nbHabitants
        return this.nom.equals(autre.getNom()) && this.nbHabitants == autre.getNbHabitants();
    }
}

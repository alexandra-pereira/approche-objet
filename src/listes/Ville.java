package listes;

public class Ville implements Comparable<Ville> {

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

    // Méthode compareTo pour trier par nom ou par nombre d'habitants
    @Override
    public int compareTo(Ville autreVille) {
        // Par défaut, trier par nom (ordre alphabétique)
        int nomComparison = this.nom.compareTo(autreVille.getNom());

        // Si les noms sont identiques, trier par nombre d'habitants
        if (nomComparison == 0) {
            return Integer.compare(this.nbHabitants, autreVille.getNbHabitants());
        }

        return nomComparison;
    }

    @Override
    public boolean equals(Object obj) {
        // Vérifie si obj est une instance de Ville
        if (!(obj instanceof Ville)) {
            return false;
        }
        // Cast obj en Ville
        Ville autre = (Ville) obj;

        // Compare nom et nbHabitants
        return this.nom.equals(autre.getNom()) && this.nbHabitants == autre.getNbHabitants();
    }

    @Override
    public int hashCode() {
        // Génération d'un hashCode basé sur nom et nbHabitants
        return this.nom.hashCode() + Integer.hashCode(nbHabitants);
    }
}
package maps;

public class Pays {
    private String nom;
    private int nbHabitants;
    private String continent;

    // Constructeur
    public Pays(String nom, int nbHabitants, String continent) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.continent = continent;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public String getContinent() {
        return continent;
    }

    // Méthode toString pour afficher les informations d'un pays
    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                ", continent='" + continent + '\'' +
                '}';
    }
}

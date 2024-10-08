package salaire;

public abstract class Intervenant {

    private String nom;
    private String prenom;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Méthode abstraite pour obtenir le salaire
    public abstract double getSalaire();

    // Méthode pour afficher les données
    public void afficherDonnees() {
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Salaire: " + getSalaire());
        System.out.println("Statut: " + this.getClass().getSimpleName());
    }
}

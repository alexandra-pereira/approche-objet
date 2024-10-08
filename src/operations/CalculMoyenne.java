package operations;

public class CalculMoyenne {

    // Attribut d'instance (tableau de doubles)
    private double[] valeurs;
    private int taille;

    // Constructeur
    public CalculMoyenne() {
        this.valeurs = new double[0]; // Initialisation avec un tableau vide
        this.taille = 0; // Compte des éléments dans le tableau
    }

    // Méthode pour ajouter un double au tableau
    public void ajout(double valeur) {
        // Création d'un nouveau tableau avec une taille augmentée de 1
        double[] nouveauTableau = new double[taille + 1];

        // Copier les anciennes valeurs dans le nouveau tableau
        for (int i = 0; i < taille; i++) {
            nouveauTableau[i] = valeurs[i];
        }

        // Ajouter la nouvelle valeur
        nouveauTableau[taille] = valeur;

        // Remplacer le tableau original par le nouveau
        this.valeurs = nouveauTableau;
        taille++;
    }

    // Méthode pour calculer la moyenne des éléments du tableau
    public double calcul() {
        double somme = 0;

        for (int i = 0; i < taille; i++) {
            somme += valeurs[i];
        }

        return taille > 0 ? somme / taille : 0;
    }
}

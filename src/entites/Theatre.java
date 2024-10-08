package entites;

public class Theatre {

    // Attributs d'instance
    private String nom;
    private int capaciteMax;
    private int totalClientsInscrits;
    private double recetteTotale;

    // Constructeur avec tous les attributs
    public Theatre(String nom, int capaciteMax, int totalClientsInscrits, double recetteTotale) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.totalClientsInscrits = totalClientsInscrits;
        this.recetteTotale = recetteTotale;
    }

    // Méthode pour inscrire des clients
    public void inscrire(int nombreClients, double prixPlace) {
        if (totalClientsInscrits + nombreClients <= capaciteMax) {
            totalClientsInscrits += nombreClients;
            recetteTotale += nombreClients * prixPlace;
            System.out.println(nombreClients + " clients inscrits.");
        } else {
            System.out.println("Erreur : capacité maximale atteinte. Inscription impossible.");
        }
    }

    // Getters pour afficher les informations
    public String getNom() {
        return nom;
    }

    public int getTotalClientsInscrits() {
        return totalClientsInscrits;
    }

    public double getRecetteTotale() {
        return recetteTotale;
    }
}
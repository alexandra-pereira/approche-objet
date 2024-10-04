package entites2;

import entites.AdressePostale;

public class Personne {

    public String nom;
    public String prenom;
    public AdressePostale adressePostale;

//    //constructeur
//    public Personne(String nom, String prenom) {
//        this.nom = nom;
//        this.prenom = prenom;
//    }

    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }
}

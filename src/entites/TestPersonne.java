package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        Personne personne1 = new Personne();
        personne1.nom = "Lopes";
        personne1.prenom = "Maria";
        personne1.adressePostale = new AdressePostale();
        personne1.adressePostale.numeroRue = 67;
        personne1.adressePostale.libelleRue = "Rue Droite";
        personne1.adressePostale.codePostal = "45300";
        personne1.adressePostale.ville = "Jesaispas";

        Personne personne2 = new Personne();
        personne2.nom = "Almeida";
        personne2.prenom = "Joel";
        personne2.adressePostale = new AdressePostale();
        personne2.adressePostale.numeroRue = 89;
        personne2.adressePostale.libelleRue = "Rue inconnue";
        personne2.adressePostale.codePostal = "73546";
        personne2.adressePostale.ville = "Mistere";

        // Printing details of the first person
        System.out.println("Personne 1: " + personne1.prenom + " " + personne1.nom);
        System.out.println("Adresse: " + personne1.adressePostale.numeroRue + ", "
                + personne1.adressePostale.libelleRue + ", "
                + personne1.adressePostale.codePostal + ", "
                + personne1.adressePostale.ville);

        // Printing details of the second person
        System.out.println("\nPersonne 2: " + personne2.prenom + " " + personne2.nom);
        System.out.println("Adresse: " + personne2.adressePostale.numeroRue + ", "
                + personne2.adressePostale.libelleRue + ", "
                + personne2.adressePostale.codePostal + ", "
                + personne2.adressePostale.ville);
    }
}

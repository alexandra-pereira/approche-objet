package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

//        Personne personne1 = new Personne();
//        personne1.nom = "Lopes";
//        personne1.prenom = "Maria";
//        personne1.adressePostale = new AdressePostale();
//        personne1.adressePostale.numeroRue = 67;
//        personne1.adressePostale.libelleRue = "Rue Droite";
//        personne1.adressePostale.codePostal = "45300";
//        personne1.adressePostale.ville = "Jesaispas";

//        Personne personne1 = new Personne("Lopes", "Maria");

        AdressePostale adr1 = new AdressePostale(67, "Rue Droite", "45300", "Jesaispas");
        Personne personne1 = new Personne("Lopes", "Maria", adr1);

//        Personne personne2 = new Personne();
//        personne2.nom = "Almeida";
//        personne2.prenom = "Joel";
//        personne2.adressePostale = new AdressePostale();
//        personne2.adressePostale.numeroRue = 89;
//        personne2.adressePostale.libelleRue = "Rue inconnue";
//        personne2.adressePostale.codePostal = "73546";
//        personne2.adressePostale.ville = "Mistere";

//        Personne personne2 = new Personne("Almeida", "Joel");

        AdressePostale adr2 = new AdressePostale(89, "Rue inconnue", "73546", "Mistere");
        Personne personne2 = new Personne("Almeida", "Joel", adr2);

//        System.out.println("Personne 1: " + personne1.prenom + " " + personne1.nom);
//        System.out.println("Adresse: " + personne1.adressePostale.numeroRue + ", "
//                + personne1.adressePostale.libelleRue + ", "
//                + personne1.adressePostale.codePostal + ", "
//                + personne1.adressePostale.ville);
//
//        System.out.println("\nPersonne 2: " + personne2.prenom + " " + personne2.nom);
//        System.out.println("Adresse: " + personne2.adressePostale.numeroRue + ", "
//                + personne2.adressePostale.libelleRue + ", "
//                + personne2.adressePostale.codePostal + ", "
//                + personne2.adressePostale.ville);

        //System.out.println(personne1.nom + " " + personne1.prenom);

        System.out.println(personne1.nom + " " + personne1.prenom + " " +
                personne1.adressePostale.numeroRue + " " +
                personne1.adressePostale.libelleRue + ", " +
                personne1.adressePostale.codePostal + ", " +
                personne1.adressePostale.ville);

        System.out.println(personne2.nom + " " + personne2.prenom + " " +
                personne2.adressePostale.numeroRue + " " +
                personne2.adressePostale.libelleRue + ", " +
                personne2.adressePostale.codePostal + ", " +
                personne2.adressePostale.ville);
    }
}

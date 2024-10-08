package chaines;

import entites.Salarie;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";

        // 1) Afficher le premier caractère
        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);

        // 2) Afficher la longueur de la chaîne
        int longueur = chaine.length();
        System.out.println("Longueur de la chaîne: " + longueur);

        // 3) Afficher l'index du premier « ; »
        int indexPointVirgule = chaine.indexOf(';');
        System.out.println("Index du premier « ; »: " + indexPointVirgule);

        // 4) Extraire le nom de famille
        String nomDeFamille = chaine.substring(0, indexPointVirgule);
        System.out.println("Nom de famille: " + nomDeFamille);

        // 5) Afficher le nom de famille en majuscules
        System.out.println("Nom de famille en majuscules: " + nomDeFamille.toUpperCase());

        // 6) Afficher le nom de famille en minuscules
        System.out.println("Nom de famille en minuscules: " + nomDeFamille.toLowerCase());

        // 7) Découper la chaîne en morceaux
        String[] morceaux = chaine.split(";");
        System.out.println("Tableau obtenu:");
        for (String morceau : morceaux) {
            System.out.println(morceau);
        }

        // 8) Créer une instance de la classe Salarie
        // (Cette étape sera effectuée dans la classe Salarie)
        String nom = morceaux[0];
        String prenom = morceaux[1];
        String salaireStr = morceaux[2].replace(" ", ""); // Supprimer l'espace
        double salaire = Double.parseDouble(salaireStr); // Convertir en double

        Salarie salarie = new Salarie(nom, prenom, salaire);

        // Afficher les informations du salarié
        System.out.println("Salarie créé: " + salarie);
    }
}
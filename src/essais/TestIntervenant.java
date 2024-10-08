package essais;

import salaire.Pigiste;
import salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        // Création d'une instance de Salarie
        Salarie salarie = new Salarie("Durand", "Marcel", 2500.0);
        System.out.println("Données du salarié :");
        salarie.afficherDonnees();

        // Création d'une instance de Pigiste
        Pigiste pigiste = new Pigiste("Dupont", "Jean", 15, 150.0);
        System.out.println("\nDonnées du pigiste :");
        pigiste.afficherDonnees();
    }
}
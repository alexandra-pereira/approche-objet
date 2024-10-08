package essais;

import entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        // Création d'une instance de Theatre avec tous les attributs
        Theatre theatre = new Theatre("Théâtre National", 100, 0, 0.0);

        // Test d'inscription de clients
        theatre.inscrire(50, 20);
        theatre.inscrire(30, 25);
        theatre.inscrire(25, 30); // Devrait afficher un message d'erreur

        // Affichage du total de clients inscrits et de la recette totale
        System.out.println("Total de clients inscrits : " + theatre.getTotalClientsInscrits());
        System.out.println("Recette totale du théâtre : " + theatre.getRecetteTotale() + " €");
    }
}

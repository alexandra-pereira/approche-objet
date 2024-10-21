package maps;

import listes.Ville;

import java.util.HashMap;
import java.util.Map;

public class MapVilles {
    public static void main(String[] args) {
        // Créer la map pour stocker les informations des villes
        Map<String, Ville> mapVilles = new HashMap<>();

        // Ajouter des villes à la map
        mapVilles.put("Paris", new Ville("Paris", 2200000));
        mapVilles.put("Lyon", new Ville("Lyon", 515695));
        mapVilles.put("Marseille", new Ville("Marseille", 861635));
        mapVilles.put("Bordeaux", new Ville("Bordeaux", 249712));
        mapVilles.put("Nice", new Ville("Nice", 340017));

        // Rechercher la ville avec le moins d'habitants
        String villeMoinsHabitants = null;
        int minHabitants = Integer.MAX_VALUE;

        for (Map.Entry<String, Ville> entry : mapVilles.entrySet()) {
            Ville ville = entry.getValue();
            if (ville.getNbHabitants() < minHabitants) {
                minHabitants = ville.getNbHabitants();
                villeMoinsHabitants = entry.getKey();
            }
        }

        // Supprimer la ville avec le moins d'habitants
        if (villeMoinsHabitants != null) {
            System.out.println("Suppression de la ville avec le moins d'habitants : " + villeMoinsHabitants);
            mapVilles.remove(villeMoinsHabitants);
        }

        // Afficher les villes restantes
        System.out.println("Villes restantes :");
        for (Map.Entry<String, Ville> entry : mapVilles.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}

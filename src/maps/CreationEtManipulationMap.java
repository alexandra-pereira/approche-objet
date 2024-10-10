package maps;

import java.util.HashMap;

public class CreationEtManipulationMap {
    public static void main(String args[]) {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");

        // Ajout des villes supplémentaires
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        // Affichage des clés (numéros de département)
        System.out.println("Clés (numéros de départements) :");
        for (Integer key : mapVilles.keySet()) {
            System.out.println(key);
        }

        // Affichage des valeurs (noms des villes)
        System.out.println("\nValeurs (noms des villes) :");
        for (String value : mapVilles.values()) {
            System.out.println(value);
        }

        // Affichage de la taille de la map
        System.out.println("\nTaille de la map : " + mapVilles.size());

    }
}

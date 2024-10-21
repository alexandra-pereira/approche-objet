package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComptagePaysParContinent {
    public static void main(String[] args) {

        List<Pays> paysList = new ArrayList<>();
        paysList.add(new Pays("France", 65000000, "Europe"));
        paysList.add(new Pays("Allemagne", 80000000, "Europe"));
        paysList.add(new Pays("Belgique", 10000000, "Europe"));
        paysList.add(new Pays("Russie", 150000000, "Asie"));
        paysList.add(new Pays("Chine", 1400000000, "Asie"));
        paysList.add(new Pays("Indonésie", 220000000, "Océanie"));
        paysList.add(new Pays("Australie", 20000000, "Océanie"));

        // Création de la HashMap pour compter le nombre de pays par continent
        Map<String, Integer> comptageParContinent = new HashMap<>();

        // Parcourir la liste des pays et faire le comptage
        for (Pays pays : paysList) {
            String continent = pays.getContinent();
            // Si le continent est déjà dans la map, on incrémente le compteur
            comptageParContinent.put(continent, comptageParContinent.getOrDefault(continent, 0) + 1);
        }

        System.out.println("Comptage des pays par continent :");
        for (Map.Entry<String, Integer> entry : comptageParContinent.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " pays");
        }
    }
}

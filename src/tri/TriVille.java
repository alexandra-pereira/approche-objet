package tri;

import listes.Ville;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TriVille {
    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Paris", 2200000));
        villes.add(new Ville("Lyon", 515695));
        villes.add(new Ville("Marseille", 861635));
        villes.add(new Ville("Bordeaux", 249712));
        villes.add(new Ville("Nice", 340017));

        // Tri des villes par nom (ordre alphabétique)
        Collections.sort(villes);
        System.out.println("Villes triées par nom (ordre alphabétique) :");
        for (Ville ville : villes) {
            System.out.println(ville);
        }

        // Tri des villes par nombre d'habitants
        Collections.sort(villes, (v1, v2) -> Integer.compare(v1.getNbHabitants(), v2.getNbHabitants()));
        System.out.println("\nVilles triées par nombre d'habitants :");
        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}

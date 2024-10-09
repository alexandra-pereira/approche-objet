package listes;

import java.util.ArrayList;

public class TestVilles {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        Ville villePlusPeuplee = villes.stream()
                .max((v1, v2) -> v1.getNbHabitants() - v2.getNbHabitants())
                .orElse(null);
        System.out.println("Ville la plus peuplée : " + villePlusPeuplee);

        Ville villeMoinsPeuplee = villes.stream()
                .min((v1, v2) -> v1.getNbHabitants() - v2.getNbHabitants())
                .orElse(null);
        villes.remove(villeMoinsPeuplee);

        for (Ville ville : villes) {
            if (ville.getNbHabitants() > 100000) {
                ville.setNom(ville.getNom().toUpperCase());
            }
        }

        System.out.println("Liste finale des villes :");
        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}

package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {
    public static void main(String[] args) {

        ArrayList<String> villes = new ArrayList<>();
        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        String villeMaxLettres = villes.stream()
                .max((v1, v2) -> v1.length() - v2.length())
                .orElse("");
        System.out.println("Ville avec le plus de lettres : " + villeMaxLettres);

        for (int i = 0; i < villes.size(); i++) {
            villes.set(i, villes.get(i).toUpperCase());
        }

        Iterator<String> iter = villes.iterator();
        while (iter.hasNext()) {
            if (iter.next().startsWith("N")) {
                iter.remove();
            }
        }

        System.out.println("Liste finale : " + villes);
    }
}

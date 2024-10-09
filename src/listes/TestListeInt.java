package listes;

import java.util.ArrayList;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(-1);
        liste.add(5);
        liste.add(7);
        liste.add(3);
        liste.add(-2);
        liste.add(4);
        liste.add(8);
        liste.add(5);

        System.out.println("Liste initiale : " + liste);
        System.out.println("Taille de la liste : " + liste.size());

        int max = liste.stream().max(Integer::compare).orElse(0);
        System.out.println("Plus grand élément : " + max);

        int min = liste.stream().min(Integer::compare).orElse(0);
        liste.remove(Integer.valueOf(min));
        System.out.println("Liste après suppression du plus petit élément : " + liste);

        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) < 0) {
                liste.set(i, Math.abs(liste.get(i)));
            }
        }
        System.out.println("Liste finale : " + liste);
    }
}

package listes;

public class TestEquals {
    public static void main(String[] args) {
        Ville v1 = new Ville("Nice", 343000);
        Ville v2 = new Ville("Nice", 343000);
        Ville v3 = new Ville("Nantes", 345000);

        // Test de la méthode equals avec deux villes ayant les mêmes attributs
        System.out.println("v1 equals v2: " + v1.equals(v2));  // Devrait retourner true

        // Test de la méthode equals avec des attributs différents
        System.out.println("v1 equals v3: " + v1.equals(v3));  // Devrait retourner false

        // Test de l'opérateur == avec deux villes ayant les mêmes attributs
        System.out.println("v1 == v2: " + (v1 == v2));  // Devrait retourner false

        // Création d'une nouvelle référence vers l'objet v1
        Ville v4 = v1;
        System.out.println("v1 == v4: " + (v1 == v4));  // Devrait retourner true
    }
}



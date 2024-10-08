package essais;

import operations.Operations;

public class TestOperations {

    public static void main(String[] args) {
        // Créer une instance de la classe Operations
        Operations operations = new Operations();

        // Tester les différentes opérations
        System.out.println("Addition: " + operations.calcul(10, 5, '+'));
        System.out.println("Soustraction: " + operations.calcul(10, 5, '-'));
        System.out.println("Multiplication: " + operations.calcul(10, 5, '*'));
        System.out.println("Division: " + operations.calcul(10, 5, '/'));
    }
}


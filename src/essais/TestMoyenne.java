package essais;

import operations.CalculMoyenne;

public class TestMoyenne {

    public static void main(String[] args) {
        // Test 1 : Ajout de plusieurs valeurs et calcul de la moyenne
        CalculMoyenne calcul1 = new CalculMoyenne();
        calcul1.ajout(10);
        calcul1.ajout(20);
        calcul1.ajout(30);
        System.out.println("Moyenne Test 1: " + calcul1.calcul());

        // Test 2 : Ajout de valeurs différentes
        CalculMoyenne calcul2 = new CalculMoyenne();
        calcul2.ajout(5);
        calcul2.ajout(15);
        System.out.println("Moyenne Test 2: " + calcul2.calcul());
    }
}

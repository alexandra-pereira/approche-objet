package operations;

public class Operations {

    public double calcul(double a, double b, char operateur) {
        if (operateur == '+') {
            return a + b;
        } else if (operateur == '-') {
            return a - b;
        } else if (operateur == '*') {
            return a * b;
        } else if (operateur == '/') {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Erreur: Division par zéro.");
                return 0;
            }
        } else {
            System.out.println("Opérateur invalide.");
            return 0;
        }
    }
}
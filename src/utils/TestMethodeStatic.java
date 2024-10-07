package utils;

public class TestMethodeStatic {
    public static void main(String[] args) {

        // Conversion d'une chaîne en entier
        String chaine = "12";

        int nombreConverti = Integer.parseInt(chaine);
        System.out.println("Nombre converti : " + nombreConverti);


        // Calcul du maximum
        int a = 8;
        int b = 15;

        int max = Integer.max(a, b);
        System.out.println("Le maximum entre " + a + " et " + b + " est : " + max);
    }
}

package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        // 1. Date du jour
        Date dateDuJour = new Date();
        SimpleDateFormat formatJourMoisAnnee = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date du jour : " + formatJourMoisAnnee.format(dateDuJour));

        // 2. Date spécifique : 19/05/2016 à 23:59:30
        @SuppressWarnings("deprecation") // Utilisation d'un constructeur déprécié
        Date dateSpecifique = new Date(116, 4, 19, 23, 59, 30); // Mois commence à 0 (avril = 4)
        SimpleDateFormat formatComplet = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Date spécifique : " + formatComplet.format(dateSpecifique));

        // 3. Date/heure système
        Date dateHeureSysteme = new Date();
        System.out.println("Date et heure système : " + formatComplet.format(dateHeureSysteme));
    }
}
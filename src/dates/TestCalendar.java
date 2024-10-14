package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        // 1. Calendar pour la date du 19 mai 2016 à 23h59:30
        Calendar calSpecifique = Calendar.getInstance();
        calSpecifique.set(2016, Calendar.MAY, 19, 23, 59, 30);
        Date dateSpecifique = calSpecifique.getTime();
        SimpleDateFormat formatJourMoisAnnee = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date spécifique (Calendar) : " + formatJourMoisAnnee.format(dateSpecifique));

        // 2. Calendar pour la date du jour
        Calendar calActuel = Calendar.getInstance();
        Date dateActuelle = calActuel.getTime();
        SimpleDateFormat formatComplet = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Date actuelle (Calendar) : " + formatComplet.format(dateActuelle));

        // 3. Affichage en différentes langues
        SimpleDateFormat formatFrancais = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.FRENCH);
        SimpleDateFormat formatRusse = new SimpleDateFormat("EEEE dd MMMM yyyy", new Locale("ru"));
        SimpleDateFormat formatChinois = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.CHINESE);
        SimpleDateFormat formatAllemand = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.GERMAN);

        System.out.println("Date actuelle en français : " + formatFrancais.format(dateActuelle));
        System.out.println("Date actuelle en russe : " + formatRusse.format(dateActuelle));
        System.out.println("Date actuelle en chinois : " + formatChinois.format(dateActuelle));
        System.out.println("Date actuelle en allemand : " + formatAllemand.format(dateActuelle));
    }
}


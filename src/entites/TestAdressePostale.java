package entites;

public class TestAdressePostale {
    public static void main(String[] args) {

        AdressePostale adr1 = new AdressePostale();
        adr1.numeroRue = 22;
        adr1.libelleRue = "Rue Magnole";
        adr1.codePostal = "34000";
        adr1.ville = "Montpellier";

        AdressePostale adr2 = new AdressePostale();
        adr2.numeroRue = 56;
        adr2.libelleRue = "Rue Principal";
        adr2.codePostal = "65000";
        adr2.ville = "Imaginaire";

        System.out.println("Adresse 1: " + adr1.numeroRue + ", " + adr1.libelleRue + ", " + adr1.codePostal + ", " + adr1.ville);
        System.out.println("Adresse 2: " + adr2.numeroRue + ", " + adr2.libelleRue + ", " + adr2.codePostal + ", " + adr2.ville);
    }
}

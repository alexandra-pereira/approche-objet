package salaire;

public class Pigiste extends Intervenant {
    private int joursTravailles;
    private double montantJournalier;

    public Pigiste(String nom, String prenom, int joursTravailles, double montantJournalier) {
        super(nom, prenom);
        this.joursTravailles = joursTravailles;
        this.montantJournalier = montantJournalier;
    }

    @Override
    public double getSalaire() {
        return joursTravailles * montantJournalier;
    }
}
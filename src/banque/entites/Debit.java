package banque.entites;

public class Debit extends Operation {

    public Debit(String date, double montant) {
        super(date, montant);
    }

    @Override
    public String getType() {
        return "DEBIT";
    }
}

package banque;

import banque.entites.Credit;
import banque.entites.Debit;
import banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {

        Operation[] operation = new Operation[4];

        operation[0] = new Credit("2024-07-10", 1000);
        operation[1] = new Debit("2024-07-11", 500);
        operation[2] = new Credit("2024-07-12", 750);
        operation[3] = new Debit("2024-07-13", 300);

//        for (Operation op : operation) {
//            System.out.println("Date: " + op.getDate() +
//                    ", Montant: " + op.getMontant() +
//                    ", Type: " + op.getType());
//        }

        double totalCredit = 0;
        double totalDebit = 0;

        for (Operation op : operation) {
            System.out.println("Date: " + op.getDate() +
                    ", Montant: " + op.getMontant() +
                    ", Type: " + op.getType());

            // Calcul des montants totaux selon le type d'opération
            if (op.getType().equals("CREDIT")) {
                totalCredit += op.getMontant();
            } else if (op.getType().equals("DEBIT")) {
                totalDebit += op.getMontant();
            }
        }

        System.out.println("Montant total des crédits : " + totalCredit);
        System.out.println("Montant total des débits : " + totalDebit);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

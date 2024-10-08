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


    }

    @Override
    public String toString() {
        return super.toString();
    }
}

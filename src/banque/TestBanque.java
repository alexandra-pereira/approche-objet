package banque;

import banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {

        Compte compte = new Compte("FR786487235472354", 2300.45 );
        System.out.println(compte);

    }
}

package banque;

import banque.entites.Compte;
import banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {

//        Compte compte = new Compte("FR786487235472354", 2300.45 );
//        System.out.println(compte);

        Compte[] comptes = new Compte[2];

        comptes[0] = new Compte("FR786487235472354", 2300.45);

        comptes[1] = new CompteTaux("FR2834678452785", 456798.03, 34.23);

        for (int i = 0; i < comptes.length; i++) {
            System.out.println(comptes[i]);
        }
    }
}

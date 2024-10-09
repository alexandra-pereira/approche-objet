package essais;

import maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Maison maison = new Maison();

        maison.ajouterPiece(new Chambre(20, 0));
        maison.ajouterPiece(new Salon(30, 0));
        maison.ajouterPiece(new Cuisine(15, 0));
        maison.ajouterPiece(new SalleDeBain(10, 1));
        maison.ajouterPiece(new Chambre(18, 1));
        maison.ajouterPiece(new WC(5, 1));

        System.out.println("Superficie totale : " + maison.getSuperficieTotale());
        System.out.println("Superficie RDC : " + maison.getSuperficieParEtage(0));
        System.out.println("Superficie 1er étage : " + maison.getSuperficieParEtage(1));
        System.out.println("Superficie des chambres : " + maison.getSuperficieParTypePiece(Chambre.class));
        System.out.println("Nombre de chambres : " + maison.getNbPiecesParTypePiece(Chambre.class));

        // Test avec une pièce null
        maison.ajouterPiece(null);

        // Test avec des valeurs négatives (lèvera une exception)
        // maison.ajouterPiece(new Chambre(-10, -1));
    }
}
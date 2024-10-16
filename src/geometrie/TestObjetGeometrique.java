package geometrie;

public class TestObjetGeometrique {
    public static void main(String[] args) {

        ObjetGeometrique[] objets = new ObjetGeometrique[2];

        objets[0] = new Cercle(5.0); // Rayon du cercle
        objets[1] = new Rectangle(4.0, 6.0); // Longueur et largeur du rectangle

        for (ObjetGeometrique objet : objets) {
            System.out.println(objet); // Calls the toString() method
            System.out.println("Périmètre: " + objet.perimetre());
            System.out.println("Surface: " + objet.surface());
            System.out.println();
        }
    }
}

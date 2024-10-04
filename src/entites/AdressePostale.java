package entites;

public class AdressePostale {

    //elle doit avoir les 4 attributs suivants : numéro de rue, libellé de la rue, code postal et ville.

    int numeroRue;
    String libelleRue;
    String codePostal;
    String ville;

    //constructeur
    AdressePostale(int numeroRue, String libelleRue, String codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public String toString() {
        return numeroRue + libelleRue + codePostal + ville;
    }
}

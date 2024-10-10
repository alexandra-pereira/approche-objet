package fichier;

public class Ville {

    private String nom;
    private String codeDepartement;
    private String nomRegion;
    private int populationTotale;

    public Ville(String nom, String codeDepartement, String nomRegion, int populationTotale) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.populationTotale = populationTotale;
    }
}

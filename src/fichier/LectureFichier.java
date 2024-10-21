package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {

        List<Ville> villeList = new ArrayList<>();

        Path pathFile = Paths.get("/Users/alexandrapereira/Documents/CDA-JAVA/JAVA-projects/recensement.csv");
        List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);

        // Cette ligne supprime l'en-tête pour le traitement
        if (lines.size() > 0) {
            lines.remove(0); // Cela va supprimer la première ligne (en-tête)
        }

        // Lecture du contenu et création des instances de Ville
        for (String line : lines) {
            System.out.println(line); // Vous pouvez choisir de commenter cette ligne si ce n'est pas nécessaire
            String[] tokens = line.split(";");
            if (tokens.length >= 4) {
                String nom = tokens[1].trim();
                String codeDepartement = tokens[2].trim();
                String nomRegion = tokens[3].trim();
                int populationTotale = Integer.parseInt(tokens[9].replaceAll(" ", ""));

                // Création d'une instance de Ville et ajout à la liste
                Ville ville = new Ville(nom, codeDepartement, nomRegion, populationTotale);
                villeList.add(ville);
            }
        }

        // Filtrage des villes avec une population supérieure à 25 000
        List<Ville> filteredVilleList = new ArrayList<>();
        for (Ville ville : villeList) {
            if (ville.getPopulationTotale() >= 25000) {
                filteredVilleList.add(ville);
            }
        }

        // Écriture des villes filtrées dans un nouveau fichier
        Path outputFile = Paths.get("/Users/alexandrapereira/Documents/CDA-JAVA/JAVA-projects/recensement_25000.csv");

        // Préparation des lignes de sortie, y compris l'en-tête
        List<String> outputLines = new ArrayList<>();
        outputLines.add("Nom;Code Departement;Nom Region;Population Totale"); // Ajout de l'en-tête
        for (Ville ville : filteredVilleList) {
            outputLines.add(ville.getNom() + ";" + ville.getCodeDepartement() + ";" + ville.getNomRegion() + ";" + ville.getPopulationTotale());
        }

        // Écriture dans le fichier de sortie
        Files.write(outputFile, outputLines);

        // Décommentez ceci si vous voulez voir la sortie dans la console
        // System.out.println("Les villes filtrées avec une population >= 25 000 ont été écrites dans " + outputFile.toString());
    }
}

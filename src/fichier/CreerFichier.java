package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {

        Path pathFile = Paths.get("/Users/alexandrapereira/Documents/CDA-JAVA/JAVA-projects/recensement.csv");

        List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);

//        Path outputFile = Paths.get("/Users/alexandrapereira/Documents/CDA-JAVA/JAVA-projects/recensement_100.csv");
//
//        Files.write(outputFile, lines.subList(0, Math.min(100, lines.size())));

        List<Ville> villeList = new ArrayList<>();

        // Suppression de l'en-tête si présent
        if (lines.size() > 0) {
            lines.remove(0); // This will remove the first line (header)
        }

        // Remplissage de la liste des villes
        for (String line : lines) {
            String[] tokens = line.split(";");
            if (tokens.length >= 4) {
                String nom = tokens[1].trim();
                String codeDepartement = tokens[2].trim();
                String nomRegion = tokens[3].trim();
                int populationTotale = Integer.parseInt(tokens[9].replaceAll(" ", ""));

                Ville ville = new Ville(nom, codeDepartement, nomRegion, populationTotale);
                villeList.add(ville);
            }
        }

        // Filtrer les villes avec une population supérieure à 25 000
        List<Ville> filteredVilleList = new ArrayList<>();
        for (Ville ville : villeList) {
            if (ville.getPopulationTotale() >= 25000) {
                filteredVilleList.add(ville);
            }
        }

        // Trier les villes filtrées par population en ordre décroissant
        filteredVilleList.sort(Comparator.comparingInt(Ville::getPopulationTotale).reversed());

        // Écrire le résultat dans un fichier
        Path outputFile = Paths.get("/Users/alexandrapereira/Documents/CDA-JAVA/JAVA-projects/recensement_25000.csv");

        List<String> outputLines = new ArrayList<>();
        for (Ville ville : filteredVilleList) {
            outputLines.add(ville.getNom() + ";" + ville.getCodeDepartement() + ";" + ville.getNomRegion() + ";" + ville.getPopulationTotale());
        }

        Files.write(outputFile, outputLines);
    }
}

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

//        for (String line : lines) {
//            System.out.println(line);
//        }

        if (lines.size() > 0) {
            lines.remove(0); // This will remove the first line (header)
        }

        for (String line : lines) {
            System.out.println(line);
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
    }
}

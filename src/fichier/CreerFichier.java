package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {

        Path pathFile = Paths.get("/Users/alexandrapereira/Documents/CDA-JAVA/JAVA-projects/recensement.csv");

        List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);

        Path outputFile = Paths.get("/Users/alexandrapereira/Documents/CDA-JAVA/JAVA-projects/recensement_100.csv");

        Files.write(outputFile, lines.subList(0, Math.min(100, lines.size())));
    }
}

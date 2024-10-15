package Strings;

import static Strings.StringUtils.append;

public class TestStringBuilder {
    public static void main(String[] args) {
        int age = 15;
        String nom = "Lee";

        StringBuilder builder = new StringBuilder();
        builder.append("Bonjour").append(nom).append(". Vous avez ").append(age).append("ans.");
        String resultat = builder.toString();

        String resultat2 = append("Bonjour M.", nom, ". Vous avez ", age, " ans.");
    }
}

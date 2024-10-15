package Strings;

public class StringUtils {

    public static String premiereLettreMaj(String nom){
        return nom.substring(0, 1).toUpperCase()+nom.substring(1);
    }

    public static String append(Object... objects){
        //écrire le code de cette méthode pour que cela retourne une String concaténée
        //pensez à utilizer la classe StringBuilder
        StringBuilder builder = new StringBuilder();
        for (Object o:objects){
            builder.append(o);
        }
        return builder.toString();
    }
}

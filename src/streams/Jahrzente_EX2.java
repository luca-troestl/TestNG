package streams;

import java.io.InputStream;
import java.util.stream.Collectors;

public class Jahrzente_EX2 {
    String input = "MME";
    static String teddy = """
           _     _   \s
          (c).-.(c)  \s
           / o_o \\   \s
         __\\( Y )/__ \s
        (_.-/'-'\\-._)\s
           || %c ||   \s
         _.' `-' '._ \s
        (.-./`-'\\.-.)\s
         `-'     `-' \s""";


    // Aufgabe 1: Methode die alle Jahrzente zwischen Start und Endjahr ausgibt
    public static int[] decades(int start, int end) {
        if(start > end) {
            System.err.println("Das Startjahr muss kleiner sein als das Endjahr!");
            return new int[0];
        } else {
            for(int i = start; i <= end; i +=10) {
                System.out.println(i);
            }
            return new int[0];
        }
    }

    // Aufgabe 2: Pyramide mit / und \ auf der Konsole ausgeben
    public static void printPyramid(int height) {
        java.util.stream.IntStream.range(0, height+1)
            .mapToObj(i -> " ".repeat(height - i) + "/\\".repeat(i))
            .forEach(System.out::println);
    }

    


    }

    public static void main(String[] args) {
        // Beispielaufrufe
        decades(1950, 2000);
        printPyramid(5);

        // Aufgabe 3: Ich will mein Leid beenden und mich in einen Teddy verwandeln
        String input = "MME";
        String teddies = teddy.lines()
            .map(line -> input.codePoints()
                .mapToObj(line::formatted)
                .collect(Collectors.joining()))
            .collect(Collectors.joining("\n"));

    System.out.println(teddies);

    }

}

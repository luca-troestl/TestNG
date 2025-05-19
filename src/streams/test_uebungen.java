package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class test_uebungen {
    
    public static void main(String[] args) {

        // Leichte Aufgaben für das Verständnis von Streams
        // Allgemeine Aufgaben für die Benutzung von einfachen Operationen:

        List<String> namen = Arrays.asList("anna", "bernd", "clara", "alex", "adolf"); // Liste wird angelegt 
        List<String> nameInUpperCase = namen.stream() // Stream wird eröffnet
                .map(String::toUpperCase) // Alle Einträge der Liste werden mit der Methode toUpperCase() bearbeitet
                .toList(); // Die neuen Einträge werden in eine neue Liste übertragen
        System.out.println("All Names in the list in Upper Case: " +nameInUpperCase); //Die neue Liste wird auf der Konsole ausgegeben

        List<String> nameThatStartsWithA = namen.stream()
                .filter(name -> name.startsWith("a")) // Die Methode filter() wird benutzt um gezielte Einträge einer Liste bzw. Arrays herauszufiltern
                .toList(); // Alle herausgefilterten Einträge werden in eine neue Liste geschrieben
        System.out.println("All Names in the list that start with an 'a': " +nameThatStartsWithA); // Die neue Liste mit allen Namen die mit 'a' anfangen wird auf der Konsole ausgegeben

        List<String> nameThatContainsA = namen.stream()
                .filter(name -> name.contains("a")) // Mit der Mehtode contains() können Einträge gefiltert werden die egal wo ein 'a' enthalten
                .toList();
        System.out.println("All Names in the list that contain an 'a': " + nameThatContainsA);

        List<Integer> zahlen = Arrays.asList(1, 2, 3, 4, 5);
        Integer summeAllerZahlen = zahlen.stream()
                .reduce(0, Integer::sum); // Mit der Methode reduce() werden alle Einträge einer Liste summiert
        System.out.println("The sum of all numbers in the list= " + summeAllerZahlen);

        

    }


}

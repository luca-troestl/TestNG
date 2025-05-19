package streams;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringWithNames {

    public static void main(String[] args) {

        // Aufgabe 5:

        List<String> names = java.util.Arrays.asList("Peter", "Paul", "Jhon", "John", "Jane");
        // Liste sollte jeden Namen der Liste anzeigen und wie oft dieser vorkommt z.B.: Jhon: 2
        Map<String, Integer> nameCount = new HashMap<>();
        for (String name : names) {
            if (nameCount.containsKey(name)) {
                nameCount.put(name, nameCount.get(name) + 1);
            } else {
                nameCount.put(name, 1);
            }
        }

        // Ausgabe der Namen und ihrer Häufigkeit
        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

}

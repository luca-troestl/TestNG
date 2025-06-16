package streams;

import java.util.Arrays;
import java.awt.geom.Point2D;

public class StreamsEX3 {

    // Aufgabe 4: NaN erkennen mit Streams
    public boolean containsNan(double[] numbers) {
        return java.util.Arrays.stream(numbers)
                .anyMatch(Double::isNaN);
    }

    // Aufgabe 5: Drei int-Arrays zusammenführen
    static int[] join(int[]... arrays) {
        return java.util.Arrays.stream(arrays)
                .flatMapToInt(java.util.Arrays::stream)
                .toArray();
    }

    // Aufgabe 6: Entfernung zwischen zwei Punkten auf der Erde berechnen
    Point2D.Double[] targets = {
        new Point2D.Double(44.7226698, 1.6716612),
        new Point2D.Double(50.4677807, -1.5833018),
        new Point2D.Double(44.7226698, 1.6716612)
    };
    };
    
    private static int distance(double lat1, double lng1,
                                double lat2, double lng2) {
        double earthRadius = 6371; // Erdradius in Kilometern
        double dLat = Math.toRadians(lat2 - lat1);
        double dLng = Math.toRadians(lng2 - lng1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                     Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                        Math.sin(dLng / 2) * Math.sin(dLng / 2);
            double d = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return (int) (earthRadius * d); // Entfernung in Kilometern
    }





    public static void main(String[] args) {


        // Anwendung der Methode von Aufgabe 4 welche überprüft ob ein Array NaN enthält
        double[] numbers1 = {Math.sqrt(2), Math.sqrt(4)};
        System.out.println("Enthält NaN: " + new StreamsEX3().containsNan(numbers1)); // -> false

        double[] numbers2 = {Math.sqrt(2), Math.sqrt(-4)};
        System.out.println("Enthält NaN: " + new StreamsEX3().containsNan(numbers2)); // -> true

        // Anwendung der Methode von Aufgabe 5 welche drei int-Arrays zusammenführt	
        int[] numbers01 = {1, 2, 3};
        int[] numbers02 = {1, 1, 2};
        int[] numbers03 = {4, 3, 1, 2};
        int[] result = join(numbers01, numbers02, numbers03);
        System.out.println(Arrays.toString(result)); // -> [1, 2, 3, 1, 1, 2, 4, 3, 1, 2]
    }
}

package streams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class FileExists {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Schule 4ha\\SWP\\Random");
		if(file.exists()) {
			System.out.println("Der Ordner existiert");
		} else {
			System.out.println("Der Ordner existiert nicht, er wurde erstellt");
			file.mkdir();
		}

		int ergebnis = 0;
	    File file2 = new File("C:\\Schule 4ha\\SWP\\Random\\");
	    for (int i = 1; i < 11; i++) {
	        File file3 = new File(file2, "test" + i + ".txt");
	        if (file3.createNewFile()) {
	            System.out.println("Datei erfolgreich erstellt: " + file3.getName());
	        } else {
	            System.out.println("Datei nicht erstellt: " + file3.getName());
	        }
	        try (FileWriter writer = new FileWriter(file3)) {
	            int summe = 0;
	            for (int j = 1; j <= i; j++) {
	                writer.write(j + "\n");
	                summe = summe + j;
	            }
	            ergebnis = ergebnis + summe;
	        } 
	    }
	    System.out.println("Ergebnis: " + ergebnis);
		
		
		
	}
	
}

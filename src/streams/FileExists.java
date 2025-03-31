package streams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExists {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Schule 4ha\\SWP\\Random");
		if(file.exists()) {
			System.out.println("Die Datei existiert");
		} else {
			System.out.println("Die Datei existiert nicht");
			file.mkdir();
		}
		
		String ka = "";
		File file2 = new File("C:\\Schule 4ha\\SWP\\Random\\");
		for (int i=1; i<11;i++) {
			File file3 = new File(file2,"test" + i + ".txt");
			if(file3.createNewFile()) {
				System.out.println("Datei erfolgreich erstellt");
			} else {
				System.out.println("Datei nicht erstellt");
			}
			ka = ka + String.valueOf(i);
			try (FileWriter writer = new FileWriter(file3)) {
				writer.write(ka);
			}
		}
		
		
	}
	
}

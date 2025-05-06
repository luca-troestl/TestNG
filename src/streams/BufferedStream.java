package streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStream {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("C:\\Users\\yaTerra\\git\\4haSWP\\src\\streams\\datei.txt");
		file1.createNewFile();
		
		BufferedReader reader = new BufferedReader(new FileReader("datei.txt"));
		String line;
		while((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		reader.close();
	}
	
}

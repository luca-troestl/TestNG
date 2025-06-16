package streams;

<<<<<<< HEAD
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

		File file2 = new File("C:\\Users\\yaTerra\\git\\4haSWP\\src\\streams\\test_uebung.txt");
		file2.createNewFile();

		try(BufferedReader br = new BufferedReader( new FileReader("test_uebung.txt"))) {
			int tmp = 0; int sum = 0;
			while(br.readLine() != null) {
				tmp = Integer.parseInt(br.readLine());
				sum += tmp;
			}System.out.println(sum);
		}
		catch(IOException e) {
			System.out.print("Datei nicht gefunden");
		}
		}
	}
=======
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class BufferedStream {

	public static void main(String[] args) throws IOException {
		File file = new File ("C:\\Schule 4ha\\SWP\\Random\\");
		File file2 = new File (file,"datei.txt");
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
			file2.createNewFile();
			writer.write("1\n" + "2\n" + "3");
		}
	}

}
>>>>>>> branch 'master' of https://github.com/StringManu/4haSWP.git

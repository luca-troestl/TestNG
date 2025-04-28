package streams;

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

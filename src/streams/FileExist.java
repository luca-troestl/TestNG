package streams;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FileExist {

	public static void main(String[] args) throws IOException {

//		File file = new File("File.txt");
//		if(file.exists()) {
//			System.out.println("Die Datei existiert (Patrick Scheiber stinkt brutal).");
//		} else {
//			System.out.println("Die Datei existiert nicht.");
//		}
//		
//		File file1 = new File("C:\\Users\\yaTerra\\OneDrive - BHAK BHAS HLW Reutte\\Desktop\\RaRaRandom.txt");
//		if(file.exists()) {
//			System.out.println("Die Datei existiert (Deniz Cabuk stinkt brutal).");
//			file1.delete();
//		} else {
//			System.out.println("Die Datei existiert nicht.");
//		}
		
		//FileWriter fw = new FileWriter("C:\\Users\\yaTerra\\git\\4haSWP\\src\\streams\\RaRaRandomFolder");
		
		File folder = new File("C:\\Users\\yaTerra\\git\\4haSWP\\src\\streams\\RaRaRandomFolder\\");
		
			if(folder.exists()) {
			for(int i = 0; i <= 10; i++) {
				File subfile = new File(folder, "RaRaRandomFile"+i+".txt");
				subfile.createNewFile();
				subfile.setWritable(true);
				FileWriter writer = new FileWriter(subfile);
				for(int j = 0; j <= i; j++) {
					writer.write(j+"\n");
				}
				//fw.write("Nummer: " + i);
				System.out.println("Die File " + i + " wurde angelegt!");
				writer.close();
			}
		} else {
			folder.mkdir();
			System.out.println(" Der Ordner existierte noch nicht, er wurde nun angelegt! ");
		}
			
		
					
	}
}

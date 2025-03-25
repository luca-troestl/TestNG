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
//		FileWriter fw = new FileWriter("C:\\Users\\yaTerra\\OneDrive - BHAK BHAS HLW Reutte\\Desktop\\RaRaRandom");
//		
		File folder = new File("C:\\Users\\yaTerra\\OneDrive - BHAK BHAS HLW Reutte\\Desktop\\RaRaRandom");
//			if(folder.exists()) {
//				System.out.println(" Der Ordner existiert bereits du inteligenzkanone! ");
//				
//				for(int i = 0; i <= 10; i++) {
//					File subfile = new File(folder, "RaRaRandomFile"+i+".txt");
//					subfile.createNewFile();
//					subfile.setWritable(true);
//					fw.write("Nummer: " + i);
//					
//				}
//				System.out.println("Die Files wurden angelegt!");
//				
//			} else {
//				System.out.println(" Der Ordner existierte noch nicht, er wurde nun angelegt! ");
//				folder.mkdir();
//				
//				
//			
//		}
		
		if(folder.exists()) {
			System.out.println(" Ordner existiert und wird nun gelöscht! ");
			folder.delete();
		} else {
			System.out.println(" Ordner existiert nicht! ");
		}
		
		}
			
		
			

}

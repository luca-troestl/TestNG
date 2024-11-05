package exceptionsTesting;

public class Aufgabe4 {
	
	public void readFile(String filePath) throws FileNotFoundException{
		if(!filePath.startsWith("C:\\")) {
			throw new FileNotFoundException("Falscher Dateipfad!");
		}
	}
	
}

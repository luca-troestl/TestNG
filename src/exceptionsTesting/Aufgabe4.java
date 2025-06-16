package exceptionsTesting;

public class Aufgabe4 {
	
<<<<<<< HEAD
	public void readFile(String filePath) {
		
=======
	public void readFile(String filePath) throws FileNotFoundException{
		if(!filePath.startsWith("C:\\")) {
			throw new FileNotFoundException("Falscher Dateipfad!");
		}
>>>>>>> branch 'master' of https://github.com/StringManu/4haSWP.git
	}
	
}

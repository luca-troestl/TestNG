package exceptionsTesting;

public class Aufgabe3 {

<<<<<<< HEAD
	public int parseInt(String input) throws InvalidNumberException {
		try {
			return Integer.parseInt(input);
		} catch (NumberFormatException e){
			throw new InvalidNumberException("Needs to be a number!");
		}
	}
	
=======
    public int parseInt(String input) throws InvalidNumberException {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) { 
            throw new InvalidNumberException("Keine Zahl eingegeben!");
        }
    }
>>>>>>> branch 'master' of https://github.com/StringManu/4haSWP.git
}

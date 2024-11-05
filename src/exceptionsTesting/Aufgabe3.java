package exceptionsTesting;

public class Aufgabe3 {

	public int parseInt(String input) throws InvalidNumberException {
		try {
			return Integer.parseInt(input);
		} catch (NumberFormatException e){
			throw new InvalidNumberException("Needs to be a number!");
		}
	}
	
}

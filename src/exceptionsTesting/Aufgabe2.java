package exceptionsTesting;

public class Aufgabe2 {

	public String reverse(String input) {
		if(input == null || input == "") {
			throw new IllegalArgumentException("Input can not be nothing!");
		} else {
			StringBuilder reversed  = new StringBuilder(input);
			return reversed.reverse().toString();
		}
	}
	
}

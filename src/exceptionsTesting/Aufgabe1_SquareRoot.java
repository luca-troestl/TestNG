package exceptionsTesting;

public class Aufgabe1_SquareRoot {

	public double sqrt(double value) throws IllegalArgumentException{
		if(value<0) {
			throw new IllegalArgumentException("Die Zahl von der die Wurzel gezogen werden soll darf nicht negativ sein");
		}
		return Math.sqrt(value);
	}
	
	
	
}

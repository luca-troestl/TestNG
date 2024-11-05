package exceptionsTesting;

public class Aufgabe1 {


	public double sqrt(double value) {
		if(value<0) {
			throw new IllegalArgumentException("The value has to be positive!");
		} else {
			value = Math.sqrt(value);
		}
		return value;
	}
	
}

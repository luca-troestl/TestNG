package aufgabe1;

import java.util.Observable;

public class Anzeigeger�teJava extends Observable{

	private double temperature;
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
		setChanged();
		notifyObservers(temperature);
	}
	
}

package anzeigeGeräte;

import java.util.Observable;

public class AnzeigegeräteJava extends Observable{

	private double temperature;
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
		setChanged();
		notifyObservers(temperature);
	}
	
}

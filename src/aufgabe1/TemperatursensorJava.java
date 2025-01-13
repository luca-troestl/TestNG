package aufgabe1;

import java.util.Observable;
import java.util.Observer;

public class TemperatursensorJava implements Observer{

	private double temperatur;

	public double getTemperatur() {
		return temperatur;
	}
	public void setTemperatur(double temperatur) {
		this.temperatur = temperatur;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.temperatur = (double) arg;
	}
	
}
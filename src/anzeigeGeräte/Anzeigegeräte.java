package anzeigeGer�te;

import java.util.ArrayList;
import java.util.List;

public class Anzeigeger�te {

	private double temperature;	
	
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public void showTemperature() {
		System.out.println("Die Temperatur betr�gt: " + this.temperature + "�");
	}
	
}

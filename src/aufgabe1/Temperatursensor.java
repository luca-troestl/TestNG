package aufgabe1;

public class Temperatursensor implements Sensor{

	private double temperature;

	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	@Override
	public void update(double temperature) {
		this.setTemperature(temperature);
	}
}

package wetterStation;

public class WeatherTemperature implements Weather {

	private double temperature;
	
	@Override
	public void update(double temperature) {
		this.setTemperature(temperature);
	}

	@Override
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	@Override
	public double getTemperature() {
		return temperature;
	}

	
}

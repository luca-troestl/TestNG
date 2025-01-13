package weatherStation;

	import java.util.Observable;
	import java.util.Observer;

	public class WeatherStation implements Observer{

		private double temperature;
		
		public double getCourse() {
			return temperature;
		}
		public void setTemperature(double temperature) {
			this.temperature = temperature;
		}

		@Override
		public void update(Observable o, Object arg) {
			this.temperature = (double) arg;
		}
}

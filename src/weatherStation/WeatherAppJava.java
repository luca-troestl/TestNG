package weatherStation;

import java.util.Observable;

public class WeatherAppJava extends Observable {

private double course;
	
	public void setCourse(double course) {
		this.course = course;
		setChanged();
		notifyObservers(course);
	}
	
}

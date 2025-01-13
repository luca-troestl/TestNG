package aktie;

import java.util.Observable;

public class BrokerJava extends Observable{

	private double course;
	
	public void setCourse(double course) {
		this.course = course;
		setChanged();
		notifyObservers(course);
	}
	
}

package aufgabe2;

import java.util.Observable;
import java.util.Observer;

public class StockCourseJava implements Observer{

	private double course;
	
	public double getCourse() {
		return course;
	}
	public void setCourse(double course) {
		this.course = course;
	}

	@Override
	public void update(Observable o, Object arg) {
		this.course = (double) arg;
	}
	
}

package aktie;

public class StockCourse implements Stock{
	
	private double course;

	public double getCourse() {
		return course;
	}
	public void setCourse(double course) {
		this.course = course;
	}
	
	@Override
	public void update(double course) {
		this.setCourse(course);
	}
	
}

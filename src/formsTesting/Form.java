package formsTesting;

public abstract class Form {
	
	private double x;
	private double y;
	
	public Form(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * Method calculates the area.
	 * 
	 * @return the area
	 */
	public abstract double calculateArea();
	
	/**
	 * Method calculates the circumference.
	 * 
	 * @return the circumference
	 */
	public abstract double calculateCircumference();
	
}

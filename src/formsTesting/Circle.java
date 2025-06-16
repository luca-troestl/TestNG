package formsTesting;

public class Circle extends Form {

	private double radius;

	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
<<<<<<< HEAD
	/**
	 * Calculates the area of the circle
	 */
	public double calculateArea() throws LengthZeroException {
		if(this.radius <= 0) {
			throw new LengthZeroException("Der Radius darf nicht kleiner als 0 sein!! IDIOT");
			} else {
			return Math.pow(this.radius, 2)*Math.PI;
			}
		}
=======
	public double calculateArea() throws RadiusZeroException{
		if(this.radius<=0) {
			throw new RadiusZeroException("Der Radius darf nicht null oder kleiner sein!");
		}
		return Math.pow(this.radius, 2)*Math.PI;
	}
>>>>>>> branch 'master' of https://github.com/StringManu/4haSWP.git
	
<<<<<<< HEAD
	
	/**
	 * Calculates the circumference of the circle
	 */
	public double calculateCircumference() throws LengthZeroException {
		if(this.radius <= 0) {
			throw new LengthZeroException("Der Radius darf nicht kleiner als 0 sein!! IDIOT");
			} else {
=======
	public double calculateCircumference() throws RadiusZeroException{
		if(this.radius<=0) {
			throw new RadiusZeroException("Der Radius darf nicht null oder kleiner sein!");
		}
>>>>>>> branch 'master' of https://github.com/StringManu/4haSWP.git
		return 2*this.radius*Math.PI;
			}
	}
	
	
	public String toString() {
		return "Circle (" + this.getX() + "|" + this.getY() + ") with radius = " + this.getRadius(); 
	}
}

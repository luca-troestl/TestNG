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
	
	public double calculateArea() {
		return Math.pow(this.radius, 2)*Math.PI;
	}
	
	public double calculateCircumference() {
		return 2*this.radius*Math.PI;
	}
	
	
	public String toString() {
		return "Circle (" + this.getX() + "|" + this.getY() + ") with radius = " + this.getRadius(); 
	}
}

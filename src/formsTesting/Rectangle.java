package formsTesting;

public class Rectangle extends Form {

	private double width;
	private double length;
	
	public Rectangle(double x, double y, double width, double length) {
		super(x, y);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double calculateArea() throws LengthZeroException {
		if(this.width <= 0 || this.length <= 0) {
			throw new LengthZeroException("Die Länge oder Breite darf nicht 0 sein wenn die Fläche berechnet wird!");
		} else {
			return this.width*2;
		}
	}

	public double calculateCircumference() throws LengthZeroException {
		if(this.width <= 0 || this.length <= 0) {
			throw new LengthZeroException("Die Länge oder Breite darf nicht 0 sein wenn der Umfang berechnet wird!");
		} else {
			return (this.width+this.length);
		}
	}
	
	public String toString() {
		return "Rectangle (" + this.getX() + "|" + this.getY() + ") with width = " 
					+ this.getWidth() + " and length = " + this.getLength(); 
	}
	
}

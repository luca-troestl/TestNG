package formsTesting;
 
public class Square extends Form {
	
	private double width;
	
	public Square(double x, double y, double width) {
		super(x, y);
		this.width = width;
	}
 
	public double getWidth() {
		return width;
	}
 
	public void setWidth(double width) {
		this.width = width;
	}
 
	public double calculateArea() throws LengthZeroException{
		if(this.width <= 0) {
			throw new LengthZeroException("Die Länge oder Breite darf nicht 0 sein wenn die Fläche berechnet wird!");
		} else {
		return this.width*this.width;
		}
	}
 
	public double calculateCircumference() throws LengthZeroException{
		if(this.width <= 0) {
			throw new LengthZeroException("Die Länge oder Breite darf nicht 0 sein wenn der Umfang berechnet wird!");
		} else {
		return this.width*4;
		}
	}
	
	public String toString() {
		return "Square (" + this.getX() + "|" + this.getY() + ") with width = "
				+ this.getWidth();
	}
	
 
}
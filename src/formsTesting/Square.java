package formsTesting;
 
public class Square extends Form {
	
	private double width;
	
	public Square(double x, double y, double width) {
		super(x, y);
		this.width = width;
	}
<<<<<<< HEAD

=======
 
>>>>>>> branch 'master' of https://github.com/StringManu/4haSWP.git
	public double getWidth() {
		return width;
	}
<<<<<<< HEAD

=======
 
>>>>>>> branch 'master' of https://github.com/StringManu/4haSWP.git
	public void setWidth(double width) {
		this.width = width;
	}
<<<<<<< HEAD

	/**
	 * Calculates the area of the square
	 */
=======
 
>>>>>>> branch 'master' of https://github.com/StringManu/4haSWP.git
	public double calculateArea() throws LengthZeroException{
		if(this.width <= 0) {
			throw new LengthZeroException("Die L�nge oder Breite darf nicht 0 sein wenn die Fl�che berechnet wird!");
		} else {
		return this.width*this.width;
		}
	}
<<<<<<< HEAD

	/**
	 * Calculates the circumference of the square
	 */
=======
 
>>>>>>> branch 'master' of https://github.com/StringManu/4haSWP.git
	public double calculateCircumference() throws LengthZeroException{
		if(this.width <= 0) {
			throw new LengthZeroException("Die L�nge oder Breite darf nicht 0 sein wenn der Umfang berechnet wird!");
		} else {
		return this.width*4;
		}
	}
	
	public String toString() {
<<<<<<< HEAD
		return "Square (" + this.getX() + "|" + this.getY() + ") with width = " 
				+ this.getWidth(); 
=======
		return "Square (" + this.getX() + "|" + this.getY() + ") with width = "
				+ this.getWidth();
>>>>>>> branch 'master' of https://github.com/StringManu/4haSWP.git
	}
	
 
}
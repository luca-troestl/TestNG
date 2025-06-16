package formsTesting;

<<<<<<< HEAD

import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleTesting {
	
  @Test
  /**
   * Method to test the method "testCalculateArea"
   * The circle in this example has the radius of 5 --> works fine
   */
  public void testCalculateArea1() throws LengthZeroException{
	 Circle c = new Circle(2, 3, 5 ); // 2 and 3 are the coordinates where the circle is placed
	 double result = c.calculateArea();
	 Assert.assertEquals(result, c.getRadius()*c.getRadius()*Math.PI); // 78.53 is the correct awnser
  }
  
  @Test
  /**
   * Method to test the method "testCalculateArea"
   * The circle in this example has the radius of 0 --> works fine
   */
  public void testCalculateArea2() throws LengthZeroException {
	 Circle c = new Circle(2, 3, 0 ); // 2 and 3 are the coordinates where the circle is placed
	 double result = c.calculateArea();
	 Assert.assertEquals(result, c.getRadius()*c.getRadius()*Math.PI); 
  }
  
  @Test
  /**
   * Method to test the method "CalculateCircumference"
   * The circle in this example has the radius of 4 --> works fine
   */
  public void testCalculateCircumference1() throws LengthZeroException {
	  Circle c = new Circle(1, 2, 4);
	  double result = c.calculateCircumference();
	  Assert.assertEquals(result, 2*c.getRadius()*Math.PI);
  }
  
  @Test
  /**
   * Method to test the method "CalculateCircumference"
   * The circle in this example has the radius of 0 --> should throw an Exception
   */
  public void testCalculateCircumference2() throws LengthZeroException{
	  Circle c = new Circle(1, 2, 0);
	  double result = c.calculateCircumference();
	  Assert.assertEquals(result, 2*c.getRadius()*Math.PI);
  }
  
  
  
=======
import org.testng.Assert;
import org.testng.annotations.Test;

 
public class CircleTesting {

     /**
     * Tests the calculation of the circle's area when radius is positive.
     */
    @Test
    public void testingCalculateArea() {
        try {
            Circle c = new Circle(1, 1, 5); // 1,1 are the Coordinates of the middle point
            double result = c.calculateArea();
            Assert.assertEquals(result, c.getRadius() * c.getRadius() * Math.PI);
        } catch (RadiusZeroException e) {
            System.out.println(e.getMessage());
        }
    }

     /**
     * Tests area calculation when the radius is zero, expecting a RadiusZeroException.
     */
    @Test
    public void testingCalculateArea2() {
        try {
            Circle c = new Circle(3, 5, 0);
            double result = c.calculateArea();
            Assert.assertEquals(result, c.getRadius() * c.getRadius() * Math.PI);
        } catch (RadiusZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Tests the calculation of the circle's circumference for a positive radius.
     */
    @Test
    public void testingCalculateCircumference() {
        try {
            Circle c = new Circle(1, 1, 5); // 1,1 are the Coordinates of the middle point
            double result = c.calculateCircumference();
            Assert.assertEquals(result, c.getRadius() * 2 * Math.PI);
        } catch (RadiusZeroException e) {
            System.out.println(e.getMessage());
        }
    }

     /**
     * Tests circumference calculation when the radius is zero, expecting a RadiusZeroException.
     */
    @Test
    public void testingCalculateCircumference2() {
        try {
            Circle c = new Circle(3, 5, 0);
            double result = c.calculateCircumference();
            Assert.assertEquals(result, c.getRadius() * 2 * Math.PI);
        } catch (RadiusZeroException e) {
            System.out.println(e.getMessage());
        }
    }

     /**
     * Tests the Circle's toString method for a circle with positive radius.
     */
    @Test
    public void testingToString() {
        Circle c = new Circle(1, 1, 5); // 1,1 are the Coordinates of the middle point
        String result = c.toString();
        Assert.assertEquals(result, "Circle (1.0|1.0) with radius = 5.0");
    }

     /**
     * Tests the Circle's toString method for a circle with zero radius.
     */
    @Test
    public void testingToString2() {
        Circle c = new Circle(3, 5, 0);
        String result = c.toString();
        Assert.assertEquals(result, "Circle (3.0|5.0) with radius = 0.0");
    }
>>>>>>> branch 'master' of https://github.com/StringManu/4haSWP.git
}

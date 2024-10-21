package formsTesting;


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
  
  
  
}

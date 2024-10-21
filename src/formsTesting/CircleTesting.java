package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleTesting {
  
	@Test
  public void testingCalculateArea() {
	  try {
	  Circle c = new Circle(1,1,5); // 1,1 are the Coordinates of the middle point
	  double result = c.calculateArea();
	  Assert.assertEquals(result,c.getRadius()*c.getRadius()*Math.PI);
	  } catch (RadiusZeroException e){
		  System.out.println(e.getMessage());
	  }
  }
	@Test
  public void testingCalculateArea2() {
	  try {
	  Circle c = new Circle(3,5,0); 
	  double result = c.calculateArea();
	  Assert.assertEquals(result,c.getRadius()*c.getRadius()*Math.PI);
	  } catch(RadiusZeroException e) {
		  System.out.println(e.getMessage());
	  }
  }

	
	@Test
  public void testingCalculateCircumference() {
	  Circle c = new Circle(1,1,5); // 1,1 are the Coordinates of the middle point
	  double result = c.calculateCircumference();
	  Assert.assertEquals(result,c.getRadius()*2*Math.PI);
  }
	@Test
  public void testingCalculateCircumference2() {
	  Circle c = new Circle(3,5,0); 
	  double result = c.calculateCircumference();
	  Assert.assertEquals(result,c.getRadius()*2*Math.PI);
  }
	
	
	@Test
  public void testingToString() {
	  Circle c = new Circle(1,1,5); // 1,1 are the Coordinates of the middle point
	  String result = c.toString();
	  Assert.assertEquals(result,"Circle (1.0|1.0) with radius = 5.0");
  }
	@Test
  public void testingToString2() {
	  Circle c = new Circle(3,5,0); 
	  String result = c.toString();
	  Assert.assertEquals(result,"Circle (3.0|5.0) with radius = 0.0");
  }
}

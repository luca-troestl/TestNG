package formsTesting;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleTesting {
	
  @Test
  public void testCalculateArea() {
	 Circle c = new Circle(2, 3, 5 ); // 2 and 3 are the coordinates where the circle is placed
	 double result = c.calculateArea();
	 Assert.assertEquals(result, c.getRadius()*c.getRadius()*Math.PI); // 78.53 is the correct awnser
  }
  
}

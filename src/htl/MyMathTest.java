package htl;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyMathTest {
  @Test
  public void testAddition() {
	  MyMath mm = new MyMath();
	  int result = mm.add(3, 5);
	  Assert.assertEquals(result, 8);
  }
 @Test
  public void testSubtraction() {
	  MyMath mm = new MyMath();
	  int result = mm.subtract(10, 5);
	  Assert.assertEquals(result, 5);
  }
  
 @Test
 public void testMultiplikation() {
	  MyMath mm = new MyMath();
	  int result = mm.multiply(3, 5);
	  Assert.assertEquals(result, 15);
 }
 
@Test
 public void testDivision() {
	  MyMath mm = new MyMath();
	  double result = mm.divide(9, 5);
	  Assert.assertEquals(result, 1);
 }
}
 
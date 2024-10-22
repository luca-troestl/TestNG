package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTesting {
	
  @Test
  public void testCalculateCircumferenceSquare1() throws LengthZeroException {
	  Square s = new Square(1, 2, 4);
	  double result = s.calculateCircumference();
	  Assert.assertEquals(result, s.getWidth()*4); // Result should be 16 --> works fine
  }
  
  @Test
  public void testCalculateCircumferenceSquare2() throws LengthZeroException {
	  Square s = new Square(1, 2, 0);
	  double result = s.calculateCircumference();
	  Assert.assertEquals(result, s.getWidth()*4); // Should throw an exception because one length is zero
  }
  
  @Test
  public void testCalculateAreaSquare1() throws LengthZeroException {
	  Square s = new Square(1, 2, 2);
	  double result = s.calculateArea();
	  Assert.assertEquals(result, s.getWidth()*s.getWidth()); // Result should be 4 --> works fine
  }
  
  @Test
  public void testCalculateAreaSquare2() throws LengthZeroException {
	  Square s = new Square(1, 2, 0);
	  double result = s.calculateArea();
	  Assert.assertEquals(result, s.getWidth()*s.getWidth()); // Should throw an exception because one length is zero
  }
  
}

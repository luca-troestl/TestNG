package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTesting {
  
	@Test
	public void testCalculateCircumferenceRectangle1() throws LengthZeroException {
		  Rectangle r = new Rectangle(1, 2, 4, 5);
		  double result = r.calculateCircumference();
		  Assert.assertEquals(result, (r.getLength()*2)+(r.getWidth()*2)); // Result should be 18 --> works fine
	  }
	
	@Test
	public void testCalculateCircumferenceRectangle2() throws LengthZeroException {
		  Rectangle r = new Rectangle(1, 2, 4, 0);
		  double result = r.calculateCircumference();
		  Assert.assertEquals(result, (r.getLength()*2)+(r.getWidth()*2)); // Should throw an exception because one length is zero
	  }
	
	@Test
	public void testCalculateAreaRectangle1() throws LengthZeroException {
		  Rectangle r = new Rectangle(1, 2, 4, 2);
		  double result = r.calculateArea();
		  Assert.assertEquals(result, r.getLength()*r.getWidth());// Result should be 8 --> works fine
	}
	
	@Test
	public void testCalculateAreaRectangle2() throws LengthZeroException {
		  Rectangle r = new Rectangle(1, 2, 4, 0);
		  double result = r.calculateArea();
		  Assert.assertEquals(result, r.getLength()*r.getWidth());// Should throw an exception because one length is zero
	}
	
}

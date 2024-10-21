package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTesting {
	
	@Test
	  public void testingCalculateArea() {
		  try {
		  Rectangle r = new Rectangle(1,1,5,8); 
		  double result = r.calculateArea();
		  Assert.assertEquals(result,r.getLength()*r.getWidth());
		  } catch (WidthZeroException|LengthZeroException e){
			  System.out.println(e.getMessage());
		  }
	  }
		@Test
	  public void testingCalculateArea2() {
		  try {
		  Rectangle r = new Rectangle(1,1,3,0); 
		  double result = r.calculateArea();
		  Assert.assertEquals(result,r.getLength()*r.getWidth());
		  } catch(WidthZeroException|LengthZeroException e) {
			  System.out.println(e.getMessage());
		  }
	  }

		
	@Test
	  public void testingCalculateCircumference() {
		  try {
		  Rectangle r = new Rectangle(1,1,3,9); 
		  double result = r.calculateCircumference();
		  Assert.assertEquals(result,r.getLength()*2+r.getWidth()*2);
		  } catch(WidthZeroException|LengthZeroException e) {
		  	  System.out.println(e.getMessage());
		  }
	  }
			@Test
	  public void testingCalculateCircumference2() {
		  try {
		  Rectangle r = new Rectangle(1,1,3,0);  
		  double result = r.calculateCircumference();
		  Assert.assertEquals(result,r.getLength()*2+r.getWidth()*2);
		  } catch(WidthZeroException|LengthZeroException e) {
			  System.out.println(e.getMessage());
		  }
	  }
		
		
		@Test
	  public void testingToString() {
		  
	  }
		@Test
	  public void testingToString2() {
		  
	  }
}

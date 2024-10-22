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
			Rectangle r = new Rectangle(1,1,4,5);
			String result = r.toString();
			Assert.assertEquals(result,"Rectangle (1|1) with width = 4 and length = 5");
	  }
		@Test
	  public void testingToString2() {
			Rectangle r = new Rectangle(4,7,2,1);
			String result = r.toString();
			Assert.assertEquals(result,"Rectangle (4|7) with width = 2 and length = 1");
	  }
}

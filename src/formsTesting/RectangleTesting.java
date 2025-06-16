package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

<<<<<<< HEAD
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
	
=======
 
public class RectangleTesting {

     /**
     * Tests area calculation for a rectangle with valid width and length.
     */
    @Test
    public void testingCalculateArea() {
        try {
            Rectangle r = new Rectangle(1, 1, 5, 8);
            double result = r.calculateArea();
            Assert.assertEquals(result, r.getLength() * r.getWidth());
        } catch (WidthZeroException | LengthZeroException e) {
            System.out.println(e.getMessage());
        }
    }

     /**
     * Tests area calculation for a rectangle with width 0, expecting an exception.
     */
    @Test
    public void testingCalculateArea2() {
        try {
            Rectangle r = new Rectangle(1, 1, 3, 0);
            double result = r.calculateArea();
            Assert.assertEquals(result, r.getLength() * r.getWidth());
        } catch (WidthZeroException | LengthZeroException e) {
            System.out.println(e.getMessage());
        }
    }

     /**
     * Tests circumference calculation for a rectangle with valid width and length.
     */
    @Test
    public void testingCalculateCircumference() {
        try {
            Rectangle r = new Rectangle(1, 1, 3, 9);
            double result = r.calculateCircumference();
            Assert.assertEquals(result, r.getLength() * 2 + r.getWidth() * 2);
        } catch (WidthZeroException | LengthZeroException e) {
            System.out.println(e.getMessage());
        }
    }

     /**
     * Tests circumference calculation with width 0, expecting an exception.
     */
    @Test
    public void testingCalculateCircumference2() {
        try {
            Rectangle r = new Rectangle(1, 1, 3, 0);
            double result = r.calculateCircumference();
            Assert.assertEquals(result, r.getLength() * 2 + r.getWidth() * 2);
        } catch (WidthZeroException | LengthZeroException e) {
            System.out.println(e.getMessage());
        }
    }

     /**
     * Tests the toString method for a rectangle with valid coordinates, width, and length.
     */
    @Test
    public void testingToString() {
        Rectangle r = new Rectangle(1, 1, 4, 5);
        String result = r.toString();
        Assert.assertEquals(result, "Rectangle (1|1) with width = 4 and length = 5");
    }

     /**
     * Tests the toString method for a rectangle with different valid coordinates.
     */
    @Test
    public void testingToString2() {
        Rectangle r = new Rectangle(4, 7, 2, 1);
        String result = r.toString();
        Assert.assertEquals(result, "Rectangle (4|7) with width = 2 and length = 1");
    }
>>>>>>> branch 'master' of https://github.com/StringManu/4haSWP.git
}

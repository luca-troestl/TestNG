package formsTesting;
<<<<<<< HEAD
 
import org.testng.Assert;
import org.testng.annotations.Test;
 
 
public class GroupTesting {
 
     /**
     * Tests adding a square form to the group and checking if it was added correctly.
     */
    @Test
    public void testAddForm() throws LengthZeroException {
        Form f = new Square(1, 1, 1);
        Group g = new Group();
        g.addForm(f);
        Assert.assertEquals(f, g.getForms().get(0));
    }
 
     /**
     * Tests adding a rectangle form to the group and checking if it was added correctly.
     */
    @Test
    public void testAddForm2() throws LengthZeroException {
        Form f = new Rectangle(2, 9, 4, 8);
        Group g = new Group();
        g.addForm(f);
        Assert.assertEquals(f, g.getForms().get(0));
    }
 
     /**
     * Tests the area calculation of multiple forms added to the group.
     */
    @Test
    public void testCalculateArea() throws LengthZeroException {
        Form f = new Rectangle(2, 9, 4, 8);
        Form f2 = new Circle(2, 9, 8);
        Form f3 = new Circle(2, 9, 1);
        Group g = new Group();
        g.addForm(f);
        g.addForm(f2);
        g.addForm(f3);
        double result = g.calculateArea();
        Assert.assertEquals(result, f.calculateArea() + f2.calculateArea() + f3.calculateArea());
    }
 
     /**
     * Tests area calculation for a group of forms including rectangle, square, and circle.
     */
    @Test
    public void testCalculateArea2() throws LengthZeroException {
        Form f = new Rectangle(2, 9, 4, 45);
        Form f2 = new Square(2, 11, 2);
        Form f3 = new Circle(2, 9, 33);
        Group g = new Group();
        g.addForm(f);
        g.addForm(f2);
        g.addForm(f3);
        double result = g.calculateArea();
        Assert.assertEquals(result, f.calculateArea() + f2.calculateArea() + f3.calculateArea());
    }
 
     /**
     * Tests the circumference calculation of multiple forms added to the group.
     */
    @Test
    public void testCalculateCurcumference() throws LengthZeroException {
        Form f = new Rectangle(2, 9, 4, 8);
        Form f2 = new Circle(2, 9, 8);
        Form f3 = new Circle(2, 9, 1);
        Group g = new Group();
        g.addForm(f);
        g.addForm(f2);
        g.addForm(f3);
        double result = g.calculateCircumference();
        Assert.assertEquals(result, f.calculateCircumference() + f2.calculateCircumference() + f3.calculateCircumference());
    }
 
     /**
     * Tests circumference calculation for a group with rectangle, square, and circle.
     */
    @Test
    public void testCalculateCircumference2() throws LengthZeroException {
        Form f = new Rectangle(2, 9, 4, 45);
        Form f2 = new Square(2, 11, 2);
        Form f3 = new Circle(2, 9, 33);
        Group g = new Group();
        g.addForm(f);
        g.addForm(f2);
        g.addForm(f3);
        double result = g.calculateCircumference();
        Assert.assertEquals(result, f.calculateCircumference() + f2.calculateCircumference() + f3.calculateCircumference());
    }
 
     /**
     * The method is searching for the biggest form
     */
    @Test
    public void testFindBiggestForm() throws LengthZeroException {
        Form f = new Rectangle(2, 9, 4, 45);
        Form f2 = new Square(2, 11, 2);
        Form f3 = new Circle(2, 9, 3);
        Group g = new Group();
        g.addForm(f);
        g.addForm(f2);
        g.addForm(f3);
        Assert.assertEquals(g.findBiggestForm(), f);
    }
 
     /**
     * Tests finding the biggest form in the group when a square has the largest area.
     */
    @Test
    public void testFindBiggestForm2() throws LengthZeroException {
        Form f = new Rectangle(2, 9, 4, 4);
        Form f2 = new Square(2, 11, 34);
        Form f3 = new Circle(2, 9, 3);
        Group g = new Group();
        g.addForm(f);
        g.addForm(f2);
        g.addForm(f3);
        Assert.assertEquals(g.findBiggestForm(), f2);
    }
}
=======

import org.testng.Assert;
import org.testng.annotations.Test;


public class GroupTesting {

     /**
     * Tests adding a square form to the group and checking if it was added correctly.
     */
    @Test
    public void testAddForm() throws RadiusZeroException, WidthZeroException, LengthZeroException {
        Form f = new Square(1, 1, 1);
        Group g = new Group();
        g.addForm(f);
        Assert.assertEquals(f, g.getForms().get(0));
    }

     /**
     * Tests adding a rectangle form to the group and checking if it was added correctly.
     */
    @Test
    public void testAddForm2() throws RadiusZeroException, WidthZeroException, LengthZeroException {
        Form f = new Rectangle(2, 9, 4, 8);
        Group g = new Group();
        g.addForm(f);
        Assert.assertEquals(f, g.getForms().get(0));
    }

     /**
     * Tests the area calculation of multiple forms added to the group.
     */
    @Test
    public void testCalculateArea() throws RadiusZeroException, WidthZeroException, LengthZeroException {
        Form f = new Rectangle(2, 9, 4, 8);
        Form f2 = new Circle(2, 9, 8);
        Form f3 = new Circle(2, 9, 1);
        Group g = new Group();
        g.addForm(f);
        g.addForm(f2);
        g.addForm(f3);
        double result = g.calculateArea();
        Assert.assertEquals(result, f.calculateArea() + f2.calculateArea() + f3.calculateArea());
    }

     /**
     * Tests area calculation for a group of forms including rectangle, square, and circle.
     */
    @Test
    public void testCalculateArea2() throws RadiusZeroException, WidthZeroException, LengthZeroException {
        Form f = new Rectangle(2, 9, 4, 45);
        Form f2 = new Square(2, 11, 2);
        Form f3 = new Circle(2, 9, 33);
        Group g = new Group();
        g.addForm(f);
        g.addForm(f2);
        g.addForm(f3);
        double result = g.calculateArea();
        Assert.assertEquals(result, f.calculateArea() + f2.calculateArea() + f3.calculateArea());
    }

     /**
     * Tests the circumference calculation of multiple forms added to the group.
     */
    @Test
    public void testCalculateCurcumference() throws RadiusZeroException, WidthZeroException, LengthZeroException {
        Form f = new Rectangle(2, 9, 4, 8);
        Form f2 = new Circle(2, 9, 8);
        Form f3 = new Circle(2, 9, 1);
        Group g = new Group();
        g.addForm(f);
        g.addForm(f2);
        g.addForm(f3);
        double result = g.calculateCircumference();
        Assert.assertEquals(result, f.calculateCircumference() + f2.calculateCircumference() + f3.calculateCircumference());
    }

     /**
     * Tests circumference calculation for a group with rectangle, square, and circle.
     */
    @Test
    public void testCalculateCircumference2() throws RadiusZeroException, WidthZeroException, LengthZeroException {
        Form f = new Rectangle(2, 9, 4, 45);
        Form f2 = new Square(2, 11, 2);
        Form f3 = new Circle(2, 9, 33);
        Group g = new Group();
        g.addForm(f);
        g.addForm(f2);
        g.addForm(f3);
        double result = g.calculateCircumference();
        Assert.assertEquals(result, f.calculateCircumference() + f2.calculateCircumference() + f3.calculateCircumference());
    }

     /**
     * Tests finding the biggest form in the group based on area.
     */
    @Test
    public void testFindBiggestForm() throws RadiusZeroException, WidthZeroException, LengthZeroException {
        Form f = new Rectangle(2, 9, 4, 45);
        Form f2 = new Square(2, 11, 2);
        Form f3 = new Circle(2, 9, 3);
        Group g = new Group();
        g.addForm(f);
        g.addForm(f2);
        g.addForm(f3);
        Assert.assertEquals(g.findBiggestForm(), f);
    }

     /**
     * Tests finding the biggest form in the group when a square has the largest area.
     */
    @Test
    public void testFindBiggestForm2() throws RadiusZeroException, WidthZeroException, LengthZeroException {
        Form f = new Rectangle(2, 9, 4, 4);
        Form f2 = new Square(2, 11, 34);
        Form f3 = new Circle(2, 9, 3);
        Group g = new Group();
        g.addForm(f);
        g.addForm(f2);
        g.addForm(f3);
        Assert.assertEquals(g.findBiggestForm(), f2);
    }
}
>>>>>>> branch 'master' of https://github.com/StringManu/4haSWP.git

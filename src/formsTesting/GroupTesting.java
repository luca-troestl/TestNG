package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTesting {
	
  @Test
  public void testAddForm() {
	  Form f = new Square(1,1,1);
	  Group g = new Group();
	  g.addForm(f);
	  Assert.assertEquals(f,g.getForms().get(0));
  }
  
  @Test
  public void testAddForm2() {
	  Form f = new Rectangle(2,9,4,8);
	  Group g = new Group();
	  g.addForm(f);
	  Assert.assertEquals(f,g.getForms().get(0));
  }
  
  
  
  
}

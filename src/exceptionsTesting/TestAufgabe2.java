package exceptionsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAufgabe2 {
	
  @Test
  public void testStringReverse1() throws IllegalArgumentException {
	  Aufgabe2 a = new Aufgabe2();
	  String result = a.reverse("Haidi");
	  Assert.assertEquals(result, "idiaH");
  }
  
  @Test
  public void testStringReverse2() throws IllegalArgumentException {
	  Aufgabe2 a = new Aufgabe2();
	  String result = a.reverse("");
	  Assert.assertEquals(result, "");
  }
  
}

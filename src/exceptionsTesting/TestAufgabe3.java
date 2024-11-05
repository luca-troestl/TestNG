package exceptionsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAufgabe3 {
	
  @Test
  public void testAufgabe3_1() throws InvalidNumberException {
	  Aufgabe3 a = new Aufgabe3();
	  int result = a.parseInt("123");
	  Assert.assertEquals(result, 123);
  }
  
  @Test
  public void testAufgabe3_2() throws InvalidNumberException {
	  Aufgabe3 a = new Aufgabe3();
	  int result = a.parseInt("1l3");
	  Assert.assertEquals(result, 123);
  }
  
}

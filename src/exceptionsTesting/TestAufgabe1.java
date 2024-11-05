package exceptionsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAufgabe1 {
	
  @Test
  public void testSqrt1() throws IllegalArgumentException {
	  Aufgabe1 a = new Aufgabe1();
	  double result = a.sqrt(9);
	  Assert.assertEquals(result, 3);
  }
  
  @Test
  public void testSqrt2() throws IllegalArgumentException {
	  Aufgabe1 a = new Aufgabe1();
	  double result = a.sqrt(-9);
	  Assert.assertEquals(result, -3);
  }
  
}

package exceptionsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Aufgabe1 {
	
  @Test 
  public void testSqrt() throws IllegalArgumentException{
		  Aufgabe1_SquareRoot a = new Aufgabe1_SquareRoot();
		  double result = a.sqrt(-9);
		  Assert.assertEquals(result,-3);
  }
  
  @Test 
  public void testSqrt2() throws IllegalArgumentException{
		  Aufgabe1_SquareRoot a = new Aufgabe1_SquareRoot();
		  double result = a.sqrt(1);
		  Assert.assertEquals(result,1);
  }
  
}


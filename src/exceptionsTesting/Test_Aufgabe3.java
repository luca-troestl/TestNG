package exceptionsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Aufgabe3 {
  @Test
  public void testParseint() throws InvalidNumberException{
	  Aufgabe3 a = new Aufgabe3();
	  int result = a.parseInt("123");
	  Assert.assertEquals(result, 123);  
  }
  
  @Test
  public void testParseint2() throws InvalidNumberException{
	  Aufgabe3 a = new Aufgabe3();
	  int result = a.parseInt("abc");
	  Assert.assertEquals(result, 123);  
  }
  
}

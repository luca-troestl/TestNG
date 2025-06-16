package exceptionsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_StringProcessor {
  @Test
  public void testReverse() throws NullPointerException{
	  StringProcessor a = new StringProcessor();
	  String result = a.reverse(null);
	  Assert.assertEquals(result, null);
  }
  
  @Test
  public void testReverse2() throws NullPointerException{
	  StringProcessor a = new StringProcessor();
	  String result = a.reverse("Hallo");
	  Assert.assertEquals(result,"ollaH");
  }
  
}

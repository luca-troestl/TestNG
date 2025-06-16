package exceptionsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Aufgabe4 {
  @Test
  public void testReadFile() throws FileNotFoundException{
	 Aufgabe4 a = new Aufgabe4();
	 a.readFile("LALA");
  }
  
  @Test
  public void testReadFile2() throws FileNotFoundException{
	 Aufgabe4 a = new Aufgabe4();
	 a.readFile("C:\\hallo.txt");
  }
  
}

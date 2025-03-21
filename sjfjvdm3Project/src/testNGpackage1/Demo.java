package testNGpackage1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  
	@Test (priority =-1)
    public void method1()
  {
	  Reporter.log("This is testNG method1", true);
  }
  
  @Test (priority =-1)
  public void method2() 
  {
	  Reporter.log("This is testNG method2", true);
  }
}

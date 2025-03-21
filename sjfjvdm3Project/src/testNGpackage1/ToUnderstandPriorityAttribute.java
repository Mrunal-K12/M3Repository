package testNGpackage1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUnderstandPriorityAttribute {
	 // we can use +ve or -ve signs(-ve high & +ve low)
  @Test (priority = -2)
  public void login() {
	  Reporter.log("This is login method", true);
  }
  
  @Test  (priority =-3)
  public void register()
  {
	  Reporter.log("This is register method", true);
  }
  
  @Test  (priority = -1)
  public void checkAccountBalance() {
	  Reporter.log("This is Check Account Balance method", true);
  }
  
  @Test (priority = 1)
  public void moneyTransfer() {
	  Reporter.log("This is Money Transfer method", true);
  } 
  
  @Test (priority = 2)
  public void logout() {
	  Reporter.log("This is Logout method", true);
  }
  
}

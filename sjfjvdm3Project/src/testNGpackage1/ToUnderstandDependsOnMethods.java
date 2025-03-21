package testNGpackage1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUnderstandDependsOnMethods {
  @Test (dependsOnMethods = "register")
  public void login() {
	  Reporter.log("This is Login Method", true);
  }
  
  @Test(dependsOnMethods = "login")
  public void checkAccountBalance() {
	  Reporter.log("This is Check Account Balance Method", true);
  }

  @Test
  public void register() {
	  Reporter.log("This is Register Method", true);
  }
  
  @Test(dependsOnMethods = {"login","moneyTransfer"})
  public void logout() {
	  Reporter.log("This is Logout Method", true);
  }
  
  @Test(dependsOnMethods = {"register","login"})
  public void moneyTransfer() {
	  Reporter.log("This is Money Transfer Method", true);
  }

}

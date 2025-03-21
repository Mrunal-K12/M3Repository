package testNGpackage1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodIfFails {
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
		  int a=1;
		  int b=0;
		  System.out.println(a/b); // ArithmeticException divide by zero
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

package TestNgAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToUnderstandAnnotations {
  @BeforeTest
  public void beforeTestMethod() {
	  Reporter.log("This is BeforeTest Method", true);
  }
  
 @AfterMethod
  public void afterMethod() {
	  Reporter.log("This is After Method", true);
  }
  
  @BeforeSuite
  public void beforeSuiteMethod() {
	  Reporter.log("This is BeforeSuite Method", true);
  }
  
  @AfterClass
  public void afterClassMethod() {
	  Reporter.log("This is AfterClass Method", true);
  }
  
  @AfterSuite
  public void afterSuiteMethod() {
	  Reporter.log("This is AfterSuite Method", true);
  }
  
  @Test
  public void test() {
	  Reporter.log("This is Test Method", true);
  }
  
  @AfterTest
  public void AfterTestMethod() {
	  Reporter.log("This is AfterTest Method", true);
  }
  
  @BeforeClass
  public void beforeClassMethod() {
	  Reporter.log("This is BeforeClass Method", true);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("This is BeforeMethod", true);
  }
  
}

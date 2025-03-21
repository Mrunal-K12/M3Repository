package testNGAssertion;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ToUnderstandHardAssertion {
  @Test
  public void LoginTc() throws InterruptedException {
	WebDriver  driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	String expectedWelcomePage = "Demo Web Shop ";
	String expectedLoginPage = "Demo Web Shop. Login";
	Assert.assertEquals(driver.getTitle(), expectedWelcomePage, "Welcome page not Found!!!!");
	
	driver.findElement(By.linkText("Log in")).click();
	//Assert.assertEquals(driver.getTitle(), expectedLoginPage, "Login Page is not Found!!");
	Assert.assertTrue(driver.getTitle().equals( expectedLoginPage),"Login Page is not Found!!");
	
	driver.findElement(By.id("Email")).sendKeys("mrunalkapadane@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("DWS4me@");
	
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Thread.sleep(1000);
  }
}

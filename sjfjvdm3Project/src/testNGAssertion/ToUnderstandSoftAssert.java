package testNGAssertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToUnderstandSoftAssert {
  @Test
  public void ValidLoginTc() throws InterruptedException {
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		String expectedWelcomePage = "Demo Web Shop ";
		String expectedLoginPage = "Demo Web Shop. Login";
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), expectedWelcomePage, "Welcome Page Not Found!!!");
		
		driver.findElement(By.linkText("Log in")).click();
		
		sa.assertEquals(driver.getTitle(), expectedLoginPage,"Login Page Is Not Found!!!");
		
		
		driver.findElement(By.id("Email")).sendKeys("mrunalkapadane@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("DWS4me@");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		
		sa.assertAll();
 
  }
}

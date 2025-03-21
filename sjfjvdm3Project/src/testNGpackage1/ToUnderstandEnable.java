package testNGpackage1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToUnderstandEnable {
	//true means it will execute
	@Test(enabled = true) 
	  public void launchSelenium() throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://www.selenium.dev/");
		 
		  Thread.sleep(2000);
		  driver.close();
	  }
	  
	  //false means will not execute
	   @Test(enabled = false)
		  public void launchJavaTPoint() throws InterruptedException {
			  WebDriver driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			  driver.get("https://www.tpointtech.com/");
			  
			  Thread.sleep(2000);
			  driver.close();
		  }
}

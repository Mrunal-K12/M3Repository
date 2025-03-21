package testNGpackage1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToUnderstandThreadpoolSize {
	//this method will be invoked 5 times in total in 3 different browsers
	 @Test(invocationCount=5, threadPoolSize = 3)  
		  public void launchSelenium() throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://www.selenium.dev/");
		 
		  Thread.sleep(2000);
		  driver.close();
	  }
	 
	//this method will be invoked 3 times in total in 3 different browsers
		// @Test(invocationCount=3, threadPoolSize = 3)  
//			  public void launchSelenium() throws InterruptedException {
//			  WebDriver driver = new ChromeDriver();
//			  driver.manage().window().maximize();
//			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//			  driver.get("https://www.selenium.dev/");
//			 
//			  Thread.sleep(2000);
//			  driver.close();
//		  }
}

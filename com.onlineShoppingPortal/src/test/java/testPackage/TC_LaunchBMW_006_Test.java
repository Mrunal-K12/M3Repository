package testPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_LaunchBMW_006_Test {
  @Test
  public void launchBMW() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://www.bmw.com/");
		 
		 Thread.sleep(1000);
		 driver.quit();
  }
}

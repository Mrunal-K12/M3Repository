package testPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_LaunchJawa_002_Test {
  @Test
  public void launchJawa() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://jawayezdistore.com/");
		 
		 Thread.sleep(1000);
		 driver.quit();
		 
  }
}


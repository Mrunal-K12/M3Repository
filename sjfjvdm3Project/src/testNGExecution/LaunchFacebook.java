package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchFacebook {
  @Test (groups = "Functional") //group is created for group execution
  public void launcgFacebbok() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://www.facebook.com/");
	  
	  Thread.sleep(3000);
	  driver.close();
  }
}

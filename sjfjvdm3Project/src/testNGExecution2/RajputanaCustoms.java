package testNGExecution2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RajputanaCustoms {
  @Test (groups = "Regression") //group is created for group execution
  public void launchRajputanaCustoms() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://rajputanacustoms.com/");
	  
	  Thread.sleep(3000);
	  driver.close();
  }
}

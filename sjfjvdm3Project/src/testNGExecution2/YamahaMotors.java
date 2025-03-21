package testNGExecution2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YamahaMotors {
  @Test (groups = "Unit") //group is created for group execution
  public void launchYamahaMotors() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://www.yamaha-motor-india.com/");
	  
	  Thread.sleep(3000);
	  driver.close();
  }
}

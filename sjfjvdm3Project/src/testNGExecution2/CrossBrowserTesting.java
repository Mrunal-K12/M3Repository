package testNGExecution2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	@Parameters("bname")
	 @Test
	  public void crossBrowser(@Optional("chrome") String browserValue) throws InterruptedException {
		  WebDriver driver = null;
		  if(browserValue.equalsIgnoreCase("chrome")) 
		  {
			  driver = new ChromeDriver();
		  }
		  
		  else  if(browserValue.equalsIgnoreCase("edge")) 
		  {
			  driver = new EdgeDriver();
		  }
		  
		  else  if(browserValue.equalsIgnoreCase("firefox")) 
		  {
			  driver = new EdgeDriver();
		  }
		  else {
			  System.out.println("Invalid Browser name");
		  }
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://demowebshop.tricentis.com/");
		  
		  Thread.sleep(3000);
		  driver.close();
	  }
}

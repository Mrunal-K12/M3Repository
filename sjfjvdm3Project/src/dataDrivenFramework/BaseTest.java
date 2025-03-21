package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {
	static WebDriver driver;
	public void browserSetUp() throws IOException {
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH, "chrome");
		String url = flib.readPropertyData(PROP_PATH, URL);
		
		if(browserValue.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		
		else if(browserValue.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		else if(browserValue.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Enter valid Browser Name");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
	
	public void browserTearDown()
	{
		driver.quit();
	}

}

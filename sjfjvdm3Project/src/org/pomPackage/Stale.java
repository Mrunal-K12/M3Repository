package org.pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement email = driver.findElement(By.id("Email"));
		
		driver.navigate().refresh(); //To refresh the webpage
		Thread.sleep(2000);
		
		//email.sendKeys("mrunalkapadane@gmail.com");  // gives StaleElementReferenceException
		
		driver.findElement(By.id("Email")).sendKeys("mrunalkapadane@gmail.com"); //To find Email again and perform operation
		Thread.sleep(1000);
		
		WebElement pass = driver.findElement(By.id("Password"));
		pass.sendKeys("DWS4me@");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginButton.click();
		
	}

}

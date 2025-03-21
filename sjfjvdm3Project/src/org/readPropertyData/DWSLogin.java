package org.readPropertyData;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSLogin implements IAutoConstant {
	public static void main(String[] args) throws IOException {
		//first create Non Static parameterized method in Flib (fileLibrary) class to read data from property file
		//create IAutoConstant interface to store PROP_PATH instead hard coding it.
		// create object to call NS Method
			
		Flib flib = new Flib();
		String url = flib.readDataFromPropertyFile(PROP_PATH, "url");
		String email = flib.readDataFromPropertyFile(PROP_PATH, "email");
		String pass = flib.readDataFromPropertyFile(PROP_PATH, "password");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pass);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}

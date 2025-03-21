package org.readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSLoginUsingProperties {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		//To specify the path of property file
		FileInputStream fis = new FileInputStream("./testData/config.properties");
		
		//To load the keys and make the file ready to read
		Properties prop = new Properties();
		prop.load(fis);
		
		//To Read the data from property file
		String email = prop.getProperty("email");
		String pass = prop.getProperty("password");
		
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pass);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}

}

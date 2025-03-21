package testNGDataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderUsingExcel {
	
	@DataProvider(name = "invalidlogincreds")
	public String [] [] dataProviderMethod() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("invalidlogincreds");
		int rowCount = sheet.getPhysicalNumberOfRows()-1; //reduce row count by 1 to avoid heading row
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		String [] [] arr = new String [rowCount] [cellCount] ;
		
		for(int i=1; i<=rowCount; i++) 
		{
			for(int j=0; j<cellCount; j++)
			{
				arr [i-1] [j] = sheet.getRow(i).getCell(j).toString(); // store the data in arr 
				//{"admin123@gmail.com"(0,0),"admin123@"(0,1)}
				//to get {0,0} value of first login details used i-1 = 1-1=0 and j=0
			}
		}
				return arr;
		}
	
	@Test (dataProvider = "invalidlogincreds", dataProviderClass = testNGDataProvider.DataProviderUsingExcel.class)
	public void invalidLoginTC(String email, String password) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
	}
		
		}

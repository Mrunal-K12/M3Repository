package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

public class InvalidLoginUsingBaseTest_WithLastRowCount extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		Flib flib = new Flib(); // To create the Object of Flib Class
		BaseTest bt = new BaseTest(); // To create the Object of BaseTest Class
		bt.browserSetUp(); //To Perform the pre requisites
		
		driver.findElement(By.linkText("Log in")).click();
		
		//To get Last row count using getLastRowNum()
		
        FileInputStream fis = new FileInputStream("./testData/TestData.xlsx"); //To Specify the path of excel file
		Workbook wb = WorkbookFactory.create(fis); //To make the file ready to read
		Sheet sheet = wb.getSheet("ipl"); //To get into the desired sheet
		int rc = sheet.getLastRowNum(); //To count the no.of rows
		
		//To test Login feature with Invalid Inputs
		
		for(int i=1; i<=rc; i++){
			String email = flib.readExcelData(EXCEL_PATH, INVALIDLOGINCREDS, i, 0);
			String password = flib.readExcelData(EXCEL_PATH, INVALIDLOGINCREDS, i, 1);
			
			driver.findElement(By.id("Email")).sendKeys(email);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.xpath("//input[@value = 'Log in']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("Email")).clear();
			driver.findElement(By.id("Password")).clear();
			
		}
		 
		Thread.sleep(2000);
		bt.browserTearDown(); //To close the browser

	}

}

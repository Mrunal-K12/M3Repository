package dataDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLogIn_CallingLastRowCountMethod extends BaseTest implements IAutoConstant {
public static void main(String[] args) throws InterruptedException, IOException {
	Flib flib = new Flib(); // To create the Object of Flib Class
	BaseTest bt = new BaseTest(); // To create the Object of BaseTest Class
	bt.browserSetUp(); //To Perform the pre requisites
	
	driver.findElement(By.linkText("Log in")).click();
	
	//To get Last row count using getLastRowNum()
	
    int rc = flib.lastRowCount(EXCEL_PATH, INVALIDLOGINCREDS); //To get the number of rows from the sheet
	
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


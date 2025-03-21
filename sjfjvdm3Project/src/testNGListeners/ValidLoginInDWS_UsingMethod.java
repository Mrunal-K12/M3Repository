package testNGListeners;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//Call @Listeners to to take screenshot method after failure.
//If in same package then use classname.class and if in another package then Use packagename.classname.class 

@Listeners(testNGListeners.MyListener.class)
public class ValidLoginInDWS_UsingMethod extends BaseTest{
	
	@Test
	public  void validLoginTC() throws EncryptedDocumentException, IOException {
//		BaseTest bt = new BaseTest(); // To create the object of BaseTest class
//		bt.browserSetUp(); //To perform the pre- requisites
		
		WelcomePage wp = new WelcomePage(driver); // to create the Object of the Welcomepage class
		wp.getLoginLink().click(); //To Click on Login Link
		
		Flib flib = new Flib(); //Create Object of Flib Class to read excel sheet data
		//Enter wrong data to take screenshot
		String email = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 3); // To read email from excelsheet
		String password = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 4); //To read password from excelsheet
		
		LoginPage lp = new LoginPage(driver); // Create the Object of LoginPage class
		
		lp.validLogin(email, password);
	}

}

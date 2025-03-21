package org.pomPackage;

import java.io.IOException;

public class ValidLogin extends BaseTest  //To access driver variable, create relation 
{
	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest(); // To create the object of BaseTest class
		bt.browserSetUp(); //To perform the pre- requisites
		
		WelcomePage wp = new WelcomePage(driver); // to create the Object of the Welcomepage class
		wp.getLoginLink().click(); //To Click on Login Link
		
		Flib flib = new Flib(); //Create Object of Flib Class to read excel sheet data
		String email = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 0); // To read email from excelsheet
		String password = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 1); //To read password from excelsheet
		
		LoginPage lp = new LoginPage(driver); // Create the Object of LoginPage class
		
		//To perform Login
		lp.getEmailTB().sendKeys(email);
		lp.getPasswordTB().sendKeys(password);
		lp.getLoginButton().click();
	}

}

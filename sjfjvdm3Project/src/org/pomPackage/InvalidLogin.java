package org.pomPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InvalidLogin extends BaseTest{
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	BaseTest bt = new BaseTest(); // To create the object of BaseTest class
	bt.browserSetUp(); //To perform the pre- requisites
	
	WelcomePage wp = new WelcomePage(driver); // to create the Object of the Welcomepage class
	wp.getLoginLink().click(); //To Click on Login Link
	
	Flib flib = new Flib(); //Create Object of Flib Class to read excel sheet data
	
	int rc = flib.lastRowCount(EXCEL_PATH, INVALIDLOGINCREDS); //To read last row count
	
	LoginPage lp = new LoginPage(driver); // Create the Object of LoginPage class
	
	for(int i=1; i<rc; i++)
	{
		String email = flib.readExcelData(EXCEL_PATH, INVALIDLOGINCREDS, i, 0); // To read email from excelsheet
		String password = flib.readExcelData(EXCEL_PATH, INVALIDLOGINCREDS, i, 1); //To read password from excelsheet
		
		lp.invalidLogin(email, password);
	}
}
}

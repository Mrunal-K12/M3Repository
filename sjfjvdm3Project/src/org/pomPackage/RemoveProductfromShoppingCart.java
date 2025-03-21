package org.pomPackage;

import java.io.IOException;

import org.openqa.selenium.Keys;

public class RemoveProductfromShoppingCart  extends BaseTest{
	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest(); //to launch browser
		bt.browserSetUp();
		
		WelcomePage wp = new WelcomePage(driver); // To click on Login link on Welcome page
		wp.getLoginLink().click();
		
		Flib flib = new Flib(); //To read valid login credentials 
		String email = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 0);
		String password = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 1);
		
		LoginPage lp = new LoginPage(driver); // To Login in DWS and call from Login page
		lp.validLogin(email, password);
		
		wp.getElectronicsLink().click(); //To Click on Electronics link on Welcome page
		
		ElectronicsPage ep = new ElectronicsPage(driver); // To select smart phone from Electronics page
		ep.getCellPhonelink().click();
		ep.getSmatphoneAddtoCartButton().click();
		
		wp.getShoppingCartLink().click(); //To click on Shopping Cart link on Welcome page
		
		ShoppingCartPage sp = new ShoppingCartPage(driver); //To check product is added to Shopping Cart page
		boolean result = sp.getSmartphoneCartProduct().isDisplayed();
		System.out.println(result);
		
		RemoveProductPage rp = new RemoveProductPage(driver);
		rp.getSelectProduct().click();
		rp.getSelectProduct().sendKeys(Keys.ENTER);
		
		//rp.getRemovebutton().click();
	}

}

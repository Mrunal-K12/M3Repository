package org.pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends BaseTest {
	
	//declaration
	//@FindBy(xpath = "//h1[text()='Shopping cart']/../..//img") private WebElement smartphoneCartProduct;
	@FindBy(xpath = "//h1[text()='Shopping cart']/../..//img[@title='Show details for Smartphone']") private WebElement smartphoneCartProduct;
	
	//initialization
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getSmartphoneCartProduct() {
		return smartphoneCartProduct;
	}

	
	

	

}

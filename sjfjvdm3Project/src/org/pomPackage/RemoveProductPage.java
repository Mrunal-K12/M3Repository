package org.pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveProductPage extends BaseTest{
	//initialization
	@FindBy(xpath = "(//h1[text()='Shopping cart']/../..//input[@type='checkbox'])[2]") private WebElement selectProduct;
	@FindBy(xpath ="//input[@value='Update shopping cart']") private WebElement removebutton;
	
	public RemoveProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getSelectProduct() {
		return selectProduct;
	}

	public WebElement getRemovebutton() {
		return removebutton;
	}

	
	

}

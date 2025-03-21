package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.BaseTest;

public class ElectronicsPage extends BaseTest{
	
	//declaration
	@FindBy(partialLinkText = "Cell phones") private WebElement cellPhonelink;
	@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@value='Add to cart']") private WebElement smatphoneAddtoCartButton;
	
	//initialization{
	
	 public ElectronicsPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 
	 //Utilization

	public WebElement getCellPhonelink() {
		return cellPhonelink;
	}

	public WebElement getSmatphoneAddtoCartButton() {
		return smatphoneAddtoCartButton;
	}

	 
}

package progressive.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// This class contains PageFactory inside Parameterized Constructor and WebElement with @FindBy annotation

public class ProductsPage {
	
	public ProductsPage(WebDriver driver) {			// Parameterize constructor
		PageFactory.initElements(driver, this);		// Page factory helps to locate WebElement @FindBy annotation and initialize
		
	}
	
	@FindBy (xpath = "//*[@id=\"main\"]/div[1]/div/div/div[2]/div[1]/ul/li[1]/a/p") // xpath = "(//a[contains(.,'Auto')])[1]"
	public WebElement autoClick;
	
	@FindBy (xpath = "//*[@id=\"QuoteStartForm_overlay\"]/div[1]/label")	// xpath = "//label[@for='zipCode_overlay' and text()='Enter ZIP Code']"
	public WebElement zipCodElement;

}

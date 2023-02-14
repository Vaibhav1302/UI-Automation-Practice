package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchModulePage extends BasePage{
	
	
	@FindBy(xpath = "//input[@placeholder='Search for Vegetables and Fruits']")
	private WebElement SearchBox;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement SearchBoxClick;
	
	@FindBy(className = "product-name")
	private WebElement ProductName;
	
	@FindBy(xpath = "//h2[normalize-space()='Sorry, no products matched your search!']")
	private WebElement ErrorMessage;
	
	public SearchModulePage(WebDriver driver) {
		super(driver);
		
	}
	
	public void searchBox() {
		
		wait.until(ExpectedConditions.visibilityOf(SearchBox)).sendKeys("Brocolli");
	}
	
	public void searchBoxClick() {
		
		wait.until(ExpectedConditions.visibilityOf(SearchBoxClick)).click();
	}
	
	public String productName() {
		
		return wait.until(ExpectedConditions.visibilityOf(ProductName)).getText();	
	}
	
	public String errorMessage() {
		
		return wait.until(ExpectedConditions.visibilityOf(ErrorMessage)).getText();
	}
	
	public void invalidSearchText() {
		wait.until(ExpectedConditions.visibilityOf(SearchBox)).sendKeys("testtest");
		
	}

}

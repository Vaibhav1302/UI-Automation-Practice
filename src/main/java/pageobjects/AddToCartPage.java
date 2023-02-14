package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddToCartPage extends BasePage {
	
	
	@FindBy(xpath = "//button[normalize-space()='ADD TO CART']")
	private WebElement AddToCartButton;
	
	@FindBy(xpath = "//img[@alt='Cart']")
	private WebElement CartBagIcon;
	
	@FindBy(xpath= "//a[normalize-space()='+']")
	private WebElement IncreaseQuantityButton;
	
	@FindBy(className = "quantity")
	private WebElement QuantityValue;
	
	@FindBy(xpath = "//a[contains(text(),'–')]")
	private WebElement DecreaseQuantityButton;
	
	@FindBy(className =  "product-remove")
	private WebElement ProductRemoveButton;
	
	@FindBy(xpath = "//div[@class='cart-preview active']//div//div//h2[contains(text(),'You cart is empty!')]")
	private WebElement ProductRemoveErrorMessage;

	public AddToCartPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void addToCartButton() {
		
		wait.until(ExpectedConditions.visibilityOf(AddToCartButton)).click();
	}
	
	public void cartBagIcon() {
		
		wait.until(ExpectedConditions.visibilityOf(CartBagIcon)).click();
	}
	
    public void increaseQuantityButton() {
    	
    	wait.until(ExpectedConditions.visibilityOf(IncreaseQuantityButton)).click();
    }
    
    public String quantityValue() {
    	
    	return wait.until(ExpectedConditions.visibilityOf(QuantityValue)).getAttribute("value");
    }
    
    public void decreaseQuantityButton() {
    	
    	wait.until(ExpectedConditions.visibilityOf(DecreaseQuantityButton)).click();
    }
    
    public void productRemoveButton() {
    	
    	wait.until(ExpectedConditions.visibilityOf(ProductRemoveButton)).click();
    }
    
    public String productRemoveErrorMessage() {
    	
    	return wait.until(ExpectedConditions.visibilityOf(ProductRemoveErrorMessage)).getText();
    }
	

}

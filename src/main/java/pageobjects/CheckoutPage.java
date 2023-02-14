package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage{
	
	
	@FindBy(xpath = "//button[normalize-space()='PROCEED TO CHECKOUT']")
	private WebElement ProceedToCheckoutButton;
	
	@FindBy(xpath = "//button[normalize-space()='Place Order']")
	private WebElement PlaceOrderButton;
	
	@FindBy(xpath = "//input[@placeholder='Enter promo code']")
	private WebElement PromoCode;
	
	@FindBy(xpath = "//button[normalize-space()='Apply']")
	private WebElement ApplyButton;
	
	@FindBy(className = "promoInfo")
	private WebElement InvalidPromoErrorMessage;
	
	@FindBy(xpath = "//label[normalize-space()='Choose Country']")
	private WebElement SelectCountryPage;
	
	@FindBy(xpath = "//div[@class='wrapperTwo']//div//select")
	private WebElement SelectDropdown;
	
	@FindBy(className = "chkAgree")
	private WebElement TermsAndConditionsCheckbox;
	
	@FindBy(xpath = "//button[normalize-space()='Proceed']")
	private WebElement ProceedButton;
	
	@FindBy(css  = "body div[id='root'] div[class='container'] div[class='products-wrapper'] div[class='products'] div[class='wrapperTwo'] span:nth-child(1)")
	private WebElement OrderSuccessMessage;
	
	
	public CheckoutPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public void proceedToCheckoutButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(ProceedToCheckoutButton)).click();
	}
	
	public String placeOrderButtonText() {
		
		return wait.until(ExpectedConditions.visibilityOf(PlaceOrderButton)).getText();
	}
	
	public void placeOrderButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(PlaceOrderButton)).click();
	}
	
	public void promoCode() {
		
		wait.until(ExpectedConditions.visibilityOf(PromoCode)).sendKeys("InvalidPromoCode");
	}
	
	public void applyButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(ApplyButton)).click();
	}
	
	public String invalidPromoErrorMessage() {
		
		return wait.until(ExpectedConditions.visibilityOf(InvalidPromoErrorMessage)).getText();
	}
	
	public String selectCountryPage() {
		
		return wait.until(ExpectedConditions.visibilityOf(SelectCountryPage)).getText();
	}
	
	public void selectDropdown() {
		
		Select dropdown = new Select(wait.until(ExpectedConditions.visibilityOf(SelectDropdown)));
		dropdown.selectByValue("India");
	}
	
	public void termsAndConditionsCheckbox() {
		
		wait.until(ExpectedConditions.elementToBeClickable(TermsAndConditionsCheckbox)).click();
	}
	
    public void proceedButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(ProceedButton)).click();
	}
	
	public String orderSuccessMessage() {
		
		return wait.until(ExpectedConditions.visibilityOf(OrderSuccessMessage)).getText();
	}

}

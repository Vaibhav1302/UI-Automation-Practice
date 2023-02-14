package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.CheckoutPage;


public class Checkout extends BaseClass{
	
	CheckoutPage checkout = new CheckoutPage(driver);
	
	@And("clicks on Proceed to Checkout button")
	public void clicks_on_proceed_to_checkout_button() throws InterruptedException {
	    
		checkout.proceedToCheckoutButton();
		
	}
	
	@Then("user should navigate to checkout page")
	public void user_should_navigate_to_checkout_page() {
	   
	   Assert.assertEquals("Place Order", checkout.placeOrderButtonText());
	}
	
	@And("enters the invalid Promo code")
	public void enters_the_invalid_code() {
	    
		checkout.promoCode();
		checkout.applyButton();
	}
	
	@Then("user should get error message")
	public void user_should_get_error_message() {
		
	    Assert.assertEquals("Invalid code ..!", checkout.invalidPromoErrorMessage());
	}
	
	@And("clicks on Place order button")
	public void clicks_on_place_order_button() {
		
	    checkout.placeOrderButton();
	}
	
	@Then("user should navigate to country selection page")
	public void user_should_navigate_to_country_selection_page() {
	    
	    Assert.assertEquals("Choose Country", checkout.selectCountryPage());
	}
	
	@And("user selects the country from the dropdown")
	public void user_selects_the_country_from_the_dropdown() {
	   
		checkout.selectDropdown();
	}
	
	@And("accept Term and Conditions")
	public void accept_term_and_conditions() {
	    
		checkout.termsAndConditionsCheckbox();
	}
	
	@And("clicks on Proceed button")
	public void clicks_on_proceed_button() {
	    
		checkout.proceedButton();
	}
	
	@Then("order should get placed and user should get a success messsage")
	public void order_should_get_placed_and_user_should_get_a_success_messsage() {
		
		System.out.println(checkout.orderSuccessMessage());
	    
		Assert.assertEquals("Thank you, your order has been placed successfully\n"
				+ "You'll be redirected to Home page shortly!!", checkout.orderSuccessMessage());
	}
	
	
	
	
	
	

}

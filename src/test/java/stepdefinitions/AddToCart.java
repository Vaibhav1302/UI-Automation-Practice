package stepdefinitions;

import static org.testng.Assert.assertNotEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.AddToCartPage;
import pageobjects.SearchModulePage;

public class AddToCart extends BaseClass{
	
	SearchModulePage search = new SearchModulePage(driver);
	AddToCartPage addtocart = new AddToCartPage(driver);
	
	@And("searches for item in the search bar")
	public void searches_for_item_in_the_search_bar() {
		
	    search.searchBox();
	}

	@When("user clicks on ADD TO CART button")
	public void user_clicks_on_add_to_cart_button() {
		
	   addtocart.addToCartButton();
	}

	@And("clicks on Cart bag icon")
	public void clicks_on_cart_bag_icon() {
		
	    addtocart.cartBagIcon();
	}

	@Then("user should see item in the cart")
	public void user_should_see_item_in_the_cart() {
		
		String productName = search.productName();
		System.out.println(productName);
		Assert.assertEquals(productName, "Brocolli - 1 Kg");
	    
	}
	
	@When("user clicks on + icon button")
	public void user_clicks_on_plus_icon_button1() {
		addtocart.increaseQuantityButton();
	    
	}

	@Then("item quantity should increase")
	public void item_quantity_should_increase() {
	   
	   String Value1 = addtocart.quantityValue();
	   addtocart.increaseQuantityButton();
	   String Value2 = addtocart.quantityValue();
	   Assert.assertNotSame(Value1, Value2);
	   
	   
	   
	   
	}

	@When("user clicks on - icon button")
	public void user_clicks_on_minus_icon_button() {
	
		   addtocart.decreaseQuantityButton();
		  
	    
	}

	@Then("item Quantity should be decreases")
	public void item_quantity_should_be_decreases() {
		
		   String Value3 = addtocart.quantityValue();
		   addtocart.decreaseQuantityButton();
		   String Value4 = addtocart.quantityValue();
		   Assert.assertNotSame(Value3, Value4);
	    
	}

	@When("user adds item to the cart")
	public void user_adds_item_to_the_cart() {
		addtocart.addToCartButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		addtocart.cartBagIcon();
	   
	}

	@And("clicks on X icon button icon infront of item")
	public void clicks_on_x_icon_button_icon_infront_of_item() {
	
		addtocart.productRemoveButton();
	}

	@Then("item should be removed from the cart")
	public void item_should_be_removed_from_the_cart() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String cartRemovemessage = addtocart.productRemoveErrorMessage();
	   System.out.println(cartRemovemessage);
	   Assert.assertEquals(cartRemovemessage, "You cart is empty!");
	}


}

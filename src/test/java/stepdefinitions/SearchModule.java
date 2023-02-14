package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.SearchModulePage;

public class SearchModule extends BaseClass {
	
	
	SearchModulePage search = new SearchModulePage(driver);
	


	@Given("user is on Greenkart home page")
	public void user_is_on_greenkart_home_page() {
		
		
		Assert.assertEquals(driver.getTitle(), "GreenKart - veg and fruits kart");
		
	}


	@When("user enters the valid Searchtext")
	public void enters_the_valid_Searchtext() throws InterruptedException {
		
		search.searchBox();
		
		
		
	}

	@Then("user should get the desired correct search result")
	public void user_should_get_the_desired_correct_search_result() {
       String productName =  search.productName();   
       
	    Assert.assertEquals(productName, "Brocolli - 1 Kg");
	    	    
	}
	
	@When("user enters invalid search keyword")
	public void user_enters_invalid_search_keyword() {
		
		search.invalidSearchText();
	    
	}

	@Then("user should get the error message")
	public void user_should_get_the_error_message() {
		String searchErrorMessage = search.errorMessage();
		Assert.assertEquals(searchErrorMessage, "Sorry, no products matched your search!");
	    
	}

}

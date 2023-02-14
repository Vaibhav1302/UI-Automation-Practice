Feature: Checkout

Background: 

Given user is on Greenkart home page
And searches for item in the search bar
When user clicks on ADD TO CART button
And clicks on Cart bag icon
And clicks on Proceed to Checkout button


Scenario: To verify if user navigates to checkout page after clicking on Proceed To Checkout button

Then user should navigate to checkout page



Scenario: To verify error message when user enters the invalid promo code

And enters the invalid Promo code
Then user should get error message



Scenario: To verify if user gets country selection after clicking on Place Order button

And clicks on Place order button
Then user should navigate to country selection page



Scenario: To verify if user can place order after selecting the country and accepting Terms & Conditions

And clicks on Place order button
And user selects the country from the dropdown
And accept Term and Conditions
And clicks on Proceed button
Then order should get placed and user should get a success messsage





Feature: Add to cart

Background: 
Given user is on Greenkart home page
And searches for item in the search bar


Scenario: To verify if user is able to add item to the cart

When user clicks on ADD TO CART button
And clicks on Cart bag icon
Then user should see item in the cart

Scenario: To verif if user can increase/decrease item quantity

When user clicks on + icon button
Then item quantity should increase
When user clicks on - icon button
Then item Quantity should be decreases



Scenario: To verify if user is able to remove the the item from the cart
When user adds item to the cart
And clicks on X icon button icon infront of item
Then item should be removed from the cart
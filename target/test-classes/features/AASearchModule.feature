Feature: Search Module

Background: 

Given user is on Greenkart home page



Scenario: To verify if user is able to search the valid product

When user enters the valid Searchtext 
Then user should get the desired correct search result


Scenario: To verify the message when user searches for the invalid product
When user enters invalid search keyword
Then user should get the error message



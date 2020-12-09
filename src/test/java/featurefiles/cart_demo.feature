Feature: shopping cart Action

Background: User should be logged in with valid credentials

@adding
Scenario: Adding product to the cart
Given user should be on the home page of the website
Then user should select a product and add it to the cart
And products should reflect in the cart

@updating
Scenario: Removing products from the cart
Given user should have some products in the cart
When user clicks on Shopping cart button
Then user should select the products that are to be removed 
And click on update shopping cart button


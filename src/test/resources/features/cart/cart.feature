@Cart
Feature: Add product to cart

  As a user
  I want to add a product to my shopping cart
  So that I can proceed with the purchase

  Scenario: Successfully add first product from homepage to cart
    Given that Juan is on the home page
    When he adds the first product to the cart
    Then he should see a confirmation message containing "Product successfully added to your shopping cart"


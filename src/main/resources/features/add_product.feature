Feature: Add Product to Cart
  Scenario: User cannot add out-of-stock product to the cart
    Given the user is logged in
    When the user tries to add an out-of-stock product to the cart
    Then the user should see an error message

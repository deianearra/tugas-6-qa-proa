Feature: User Login
  Scenario: User can log in with valid credentials
    Given the user is on the login page
    When the user enters username "standard_user" and password "secret_sauce"
    And the user clicks the login button
    Then the user should be on the products page

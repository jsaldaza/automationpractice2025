Feature: Create a new user account
  As a new customer
  I want to register in the Automation Practice store
  So that I can access my personal account area

  Scenario: Successful account creation with valid data
    Given that Juan creates a new account
    Then he should see the My Account dashboard

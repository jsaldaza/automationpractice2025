Feature: Create a new user account
  As a new customer
  I want to register in the Automation Practice store
  So that I can access my personal account area

  Scenario: Successful account creation with valid data
    Given that Juan wants to create a new user account
    When he submits the registration form with valid personal information
    Then he should see the My Account dashboard

Feature: Account creation with different user profiles

  As a potential user
  I want to register on the Automation Practice page
  Using different types of user data
  So that I can validate registration behavior

  Scenario Outline: Successful or failed registration based on user profile
    Given that Juan wants to create a new account using "<profileKey>"
    Then he should see the My Account dashboard

    Examples:
      | profileKey |
      ##| validUser  |
      | randomUser |

Feature: Login to Automation Practice

  Scenario: Successful login with valid credentials
    Given that Juan opens the login page
    When he enters valid credentials
    Then he should see his account dashboard

  Scenario: Failed login with invalid credentials
    Given that Juan opens the login page
    When he enters invalid credentials
    Then he should see an error message indicating login failure

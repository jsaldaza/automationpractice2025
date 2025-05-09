Feature: Login to Automation Practice

  Scenario: Successful login with valid credentials
    Given that Juan wants to access the Automation Practice page
    When he logs in with valid credentials
    Then he should see his account dashboard

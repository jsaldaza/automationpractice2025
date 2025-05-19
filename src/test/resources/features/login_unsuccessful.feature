Feature: Failed login to Automation Practice

  As a user
  I want to receive an error message when login credentials are invalid
  So that I can be aware of authentication issues

  Scenario: Failed login with nonexistent credentials
    Given that Juan wants to access the Automation Practice page
    When he logs in with invalid credentials
    Then he should see an authentication error

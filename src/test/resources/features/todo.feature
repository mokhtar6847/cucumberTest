Feature: User Feature
  Scenario: User should be able to login
    Given user is at login page
    When user fills the email and password and login
    Then Welcome message should be displayed
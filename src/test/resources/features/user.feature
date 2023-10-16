Feature: todo feature
  Scenario: User should be able to add todo feature
    Given user is at the todos page
    When add a new to do
    Then todo should be added correctly

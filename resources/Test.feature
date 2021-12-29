Feature: User Login

  Scenario: Testing login with valid credentials
    Given I am on login page
    When I enter username as "Deepith" and password as "Pass@1234"
    And I submit login page
    Then I redirect to user home page

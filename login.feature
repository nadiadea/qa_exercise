Feature: Login to www.saucedemo.com

  Scenario: Valid login
    Given I open the Saucedemo website
    When I enter valid username and password
    And I click the Login button
    Then I should be logged in

  Scenario: Invalid login
    Given I open the Saucedemo website
    When I enter invalid username and password
    And I click the Login button
    Then I should see an error message

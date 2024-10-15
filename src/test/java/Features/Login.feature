@regression @login
Feature: User Login
  As a user
  I want to log in by selecting my name from a dropdown
  So that I can access my account

  Scenario Outline: User logs in by selecting their name
    Given I am on the home page
    When I click on the customer login button
    And I select "<name>" from the dropdown
    And I click the login button
    #Then I should be redirected to my account dashboard

    Examples:
      | name               |
      | Hermoine Granger   |
      #| Harry Potter       |
      #| Ron Weasly         |
      #| Albus Dumbledore   |
      #| Neville Longbottom |





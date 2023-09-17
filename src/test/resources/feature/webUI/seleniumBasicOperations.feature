@BasicSeleniumOperations
Feature: Selenium Interaction With Browser

  @ClickOperation
  Scenario: Performing Clicking Action using Selenium
    Given I open the Add Delete Elements
    When I try to add Delete Box
    Then Delete Box Should Be Added
    When I try to remove Delete Box
    Then Delete Box Should Be Removed


  @SendTextOperation
  Scenario: Sending Text Using Selenium
    Given I open the login page
    When I tries with valid username and password
    Then I can login in secure area
    When I logout from secure area
    Then I will be on login page
@BasicSeleniumOperations
Feature: Selenium Interaction With Browser

  @ClickOperation
  Scenario: Performing Clicking Action using Selenium
    Given I open the Add Delete Elements
    When I try to add Delete Box
    Then Delete Box Should Be Added
    When I try to remove Delete Box
    Then Delete Box Should Be Removed
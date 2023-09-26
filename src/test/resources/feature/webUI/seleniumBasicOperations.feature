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

  @CheckBoxOperation
  Scenario: Working With Checkbox using Selenium
    Given I open the checkbox Page
    When I select the checkbox
    Then Checkbox should be selected
    When I unselect the checkbox
    Then checkbox should be unselected

  @HandleMultipleWindow
  Scenario: Working With Multiple Window using Selenium
    Given I open the multiple window
    When I open new window
    Then new window should be opened
    When I tried to go back to original window
    Then I can open original window

  @HandleMultipleIFrame
  Scenario: Working with Multiple Iframe using Selenium
    Given user open the multiple Iframe page
    When user wants to visit "bottom"
    Then user should be able to see "bottom"
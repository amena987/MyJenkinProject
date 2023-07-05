Feature: Employee Login Functionality
  Description:
  As a Employee
  I want to Login as Employee
  So that I can see Employee Home page

  @smoke
  Scenario: Verify Employee Login Functionality
    Given I am in Landing Page
    Then I click on Login Menu
    And I click on Employee Login Menu
    And I Enter User Id
    And I enter Password
    When I click on Login button
    Then Verify I am in Employee Home Page
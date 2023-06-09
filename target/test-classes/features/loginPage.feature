
Feature: Test Login Functionality

  @smoke
  Scenario: Check login is succesful in valid credentials.
    Given Chrome Browser is open
    And user is in the login Page
    When user enter <username> and <password>
    And user click on LoginButton
    Then user is on the homepage

	Examples: 
	|username|password|
	|trainee|trainee|
	|admin|manager|

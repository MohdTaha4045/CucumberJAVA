Feature: feature to test login functionality

	Background: user is on Homepage
	
	  Given user is on login page
    When user enters username and password
    And click on login button
    Then user is navigated to the homepage

  Scenario: check login is successful with valid credentials
  
    When user click on save changes
    Then save changes successful
    
   Scenario: check login is successful with valid credentials
  
    When user Click on Logout
    Then user is navigated to the Login Page
 


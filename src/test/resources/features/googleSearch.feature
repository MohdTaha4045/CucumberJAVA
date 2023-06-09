Feature: Feature to test google search functionality

  Scenario: Validate google search is working
    Given browser is open
    And user is on google page
    When user enters a text in search text field
    And hit enter
    Then user is navigated to search results

Feature: Wikipedia search functionality
  Agile story: As a user, when I am on the Wikipedia home page
  I should be able to search anything and see relevant results

  Scenario: Search page default title verification
    When user is on Wikipedia home page
    Then user should see title is Wikipedia

    # MAC --> command + option + L
    # WINDOWS --> control + option + L

  #TC: Wikipedia Search Functionality Title Verification

  Scenario: Search result title verification
    Given user is on Wikipedia home page
    When  user types Steve Jobs in the wiki search box
    And  user clicks wiki search button
    Then  user sees Steve Jobs is in the wiki title

  #TC: Wikipedia Search Functionality Header Verification
  Scenario:
    Given user is on Wikipedia home page
    When  user types Steve Jobs in the wiki search box
    And   user clicks wiki search button
    Then  user sees Steve Jobs is in the main header

    #TC: Wikipedia Search Functionality Image Header Verification
  Scenario:
    Given user is on Wikipedia home page
    When user types Steve Jobs in the wiki search box
    And user clicks wiki search button
    Then user sees Steve Jobs is in the image header


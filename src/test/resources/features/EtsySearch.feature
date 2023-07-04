Feature: Etsy search functionality

  Agile Story: User should be able to type any keyword and see relevant information


  Scenario: Etsy Title Verification

    Given user is on the Etsy homepage
    Then  user sees title is as expected.
    #expectedTitle: "Etsy Deutschland – Kaufe Handgefertigtes, Vintage-Sachen, Spezialanfertigungen und einzigartige Geschenke für alle ein."

Scenario: Etsy Search Functionality Title Verification (without parametrization)
  Given user is on the Etsy homepage
  When user types Wooden Spoon in the search box
  And user click on to Etsy search button
  Then user sees Wooden Spoon is in the title

  Scenario: Etsy Search Functionality Title Verification (with parametrization)
    Given user is on the Etsy homepage
    When user types "Wooden Spoon" in the search box
    And user click on to Etsy search button
    Then user sees "Wooden spoon - Etsy DE" is in the title

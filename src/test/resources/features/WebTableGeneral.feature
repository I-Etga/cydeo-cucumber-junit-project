@today
Feature: Some of the general functionality verifications

  Scenario: Dropdown options verifications
    Given user is already logged in to The Web table app
    When  user is on the Order page
    Then  user sees below options under “product” dropdown
      | MoneyCog   |
      | Familybea  |
      | Screenable |

  Scenario: Payment options verifications
    Given user is already logged in to The Web table app
    When user is on the Order page
    Then user sees VISA as enabled payment option
    Then user sees MasterCard as enabled payment option
    Then user sees American Express as enabled payment option

  Scenario: Order placement scenario
    Given user is already logged in to The Web table app
    When user is on the Order page
    And  user enters quantity "2"
    Then user clicks to the calculate button
    And  user enters customer name "Jane Doe"
    And  user enters street "7th Street"
    And  user enters city "New York"
    And  user enters state "New York"
    And  user enters zip "99999"
    And  user selects payment option "American Express"
    And  user enters credit card number "1234567891011213"
    And  user enters expiration date "12/15"
    And  user clicks to process order button
    Then user should see "Jane Doe" in the first row of the web table

  Scenario Outline: Order placement scenario
    Given user is already logged in to The Web table app
    When user is on the Order page
    And  user enters quantity "<quantity>"
    Then user clicks to the calculate button
    And  user enters customer name "<customerName>"
    And  user enters street "<street>"
    And  user enters city "<city>"
    And  user enters state "<state>"
    And  user enters zip "<zip>"
    And  user selects payment option "<paymentType>"
    And  user enters credit card number "<cardNumber>"
    And  user enters expiration date "<expDate>"
    And  user clicks to process order button
    Then user should see "<expectedName>" in the first row of the web table

    Examples:
      | quantity | customerName | street     | city     | state    | zip  | paymentType | cardNumber      | expDate | expectedName |
      | 3        | Jane Doe     | 7th Street | New York | New York | 9999 | Visa        | 123456789101112 | 12/24   | Jane Doe     |
      | 3        | John Doe     | 7th Street | New York | New York | 9999 | Visa        | 123456789101112 | 12/24   | John Doe     |
      | 3        | Jack Doe     | 7th Street | New York | New York | 9999 | Visa        | 123456789101112 | 12/24   | Jack Doe     |
      | 3        | Jen Doe      | 7th Street | New York | New York | 9999 | Visa        | 123456789101112 | 12/24   | Jen Doe      |
      | 3        | Mary Doe     | 7th Street | New York | New York | 9999 | Visa        | 123456789101112 | 12/24   | Mary Doe     |
      | 3        | Mike Doe     | 7th Street | New York | New York | 9999 | Visa        | 123456789101112 | 12/24   | Mike Doe     |

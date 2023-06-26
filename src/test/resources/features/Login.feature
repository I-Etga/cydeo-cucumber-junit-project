Feature: Library login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin

  #This is how we comment in a feature file

  @librarian
  Scenario: Login as Librarian
    Given user in on the page of the library application
    When user enter librarian username
    And user enters librarian password
    Then user  should see the dashboard

  @student @smoke
  Scenario: Login as student
    Given user in on the page of the library application
    When user enter student username
    And user enters student password
    Then user  should see the dashboard

  @admin
  Scenario: Login as admin
    Given user in on the page of the library application
    When user enter admin username
    And user enters admin password
    Then user  should see the dashboard
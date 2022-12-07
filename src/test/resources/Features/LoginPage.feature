Feature: To validate Login Page Feature

  Scenario: Login Page Title
    Given user is on the login page of EWL
    When user gets title of the page
    Then page title should be "EWL Connect Login"

@LoginPageScenarios
  Scenario: Login as a valid user
    Given user is on the login page of EWL
    Then user enters username "kavita.khandelwal@edgewl.com"
    And user enters password "1_b?!?hG"
    And clicks on Sign in button
    When user gets title of the page
    Then page title should be "EWL Connect Dashboard"

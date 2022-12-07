Feature: Add new boking page functionality validation

  Background: 
    Given User has already logged in to application
      | Username                     | Password |
      | kavita.khandelwal@edgewl.com | 1_b?!?hG |
@AddNewBooking
  Scenario: Create a new booking
    Given user is on booking list page
    When user gets title of the page
    Then page title should be "EWL Connect Booking List"
    Then add new booking button is vissible on screen
    Then user clicks on add new booking button
    When user gets title of the page
    Then page title should be "EWL Connect New Booking"
    Then enter customer name "ard" and customer name "aj"
    And click on confirm button
    When user gets title of the page
    Then page title should be "EWL Connect Edit Booking"

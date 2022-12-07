Feature: Validate booking Details features

  Background: 
    Given User has already logged in to application
      | Username                     | Password |
      | kavita.khandelwal@edgewl.com | 1_b?!?hG |

  @Bookingflow
  Scenario: Validate Booking flow
    Given user is on booking list page
    When user gets title of the page
    Then page title should be "EWL Connect Booking List"
    Then add new booking button is vissible on screen
    Then user clicks on add new booking button
    When user gets title of the page
    Then page title should be "EWL Connect New Booking"
    Then enter customer name "ard" and customer name "aj"
    And click on confirm button
    Then enter Agent "a"
    Then enter POL "a"
    Then enter POD "a"
    Then enter incoterm
    And click on save
    When get the status of the booking
    Then booking status should be "Initial"
    Then fill Order details
    Then fill Sailing details
      | vessel | Voyage          | Carrier | ETD       | ETA        |
      | a      | Test@automation | a       | 1/11/2022 | 30/11/2022 |
    Then click on Sailing save button
    Then Fill Equipment details
    And click on save
     When get the status of the booking
    Then booking status should be "AwaitingApproval"
    Then Click on Send to SA button
    Then Approve SA
     When get the status of the booking
    Then booking status should be "Approved"
    Then Go to Search bar and search booking
    Then validate booking
    Then fill service contract
    Then Select Sent to Agent
    Then select Confirm booking
    Then Convert the booking to Job

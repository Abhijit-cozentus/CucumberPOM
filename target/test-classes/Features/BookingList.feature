Feature: Validate booking list features

Background: 
Given User has already logged in to application
|Username|Password|
|kavita.khandelwal@edgewl.com|1_b?!?hG|


Scenario: Validate Booking list
Given user is on booking list page
When user gets title of the page
Then page title should be "EWL Connect Booking List"
Then +1 button is vissible on screen
Then user clicks on +1 button
Then user navigates to New booking page
When user gets title of the page
Then page title should be "EWL Connect New Booking"

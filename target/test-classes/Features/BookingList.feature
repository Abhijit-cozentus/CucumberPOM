Feature: Validate booking list features

  Background: 
    Given User has already logged in to application
      | Username                     | Password |
      | kavita.khandelwal@edgewl.com | 1_b?!?hG |


@Searchbar
    Scenario: Validate Search Bar on Booking list page with valid data
    Given user is on booking list page
    Then user enters "PRE000608" booking id on search bar
    Then validate Booking id "PRE000"
Feature: Hotel Booking using Adactin Application

Scenario: Login Functionality
Given user launches the appplication
When user enters the valid username
And user enters the valid password
Then user click the login button and user navigates to the search hotel page

Scenario: Search Hotel Functionality
When user selects the location
And user selects the hotel from dropdown
And user selects the room type from dropdown
And user selects the number of rooms from dropdown
And user selects the checkIn date
And user selects the checkout date
And user selects the adultsperroom from dropdown
And user selects the childrenperroom from dropdown
Then user clicks the search button and navigates to the select hotel page

Scenario: Select Hotel
When user clicks the radio button
Then user clicks the continue button and navigates to the book hotel page

Scenario: Book Hotel
When user enters the first name
And user enters the last name
And user enters the Billing Address
And user enters the credit card number
And user select the credit card type from the dropdown
And user select the credit card expiry month from the dropdown
And user select the credit card expiry year from the dropdown
And user enter the CCV number
Then click the book now button and user navigates to the booking confirmation page

Scenario: Booking Confirmation
When user clicks the My Itinerary
Then user navigates to the Booked Itinerary

Scenario: LogOut
When user click the logout
Then user successfully logged out from the page.


Feature: Login Page

  Scenario: Accessing the Login Page
    Given the user is on the app's main screen
    When the user taps on the "Customer Login" button
    Then the user should be redirected to the Customer Login screen, which displays the "Your Name" drop-down, "Login" button, and "XYZ Bank" heading
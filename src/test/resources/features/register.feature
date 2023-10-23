Feature: Login to SauceDemo


  Scenario: Login with valid credentials
    Given that the 'user' is on the login page
    When the user enters valid credentials
      | username      | password     |
      | standard_user | secret_sauce |
    Then the user should see 'Swag Labs'

  Scenario: Login with empty fields
    Given that the 'user' is on the login page
    When the user leaves the username and password fields empty
      | username | password |
      |          |          |
    Then the user should see an error message 'Epic sadface: Username is required'


  Scenario Outline: login with password incorrect
    Given that the 'user' is on the login page
    When the user enters credentials
      | username | password |
      | <Usr>    | <pwd>    |
    Then the user should see an error message indicating 'Epic sadface: Username and password do not match any user in this service'
    Examples:
      | Usr              | pwd          |
      | standard_user    | hjsus        |
      | jahsuna          | secret_sauce |
      | jshsjs           | jsuosks      |
      | standard_user%&4 | secret_sauce |









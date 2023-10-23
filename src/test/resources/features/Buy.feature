Feature: Purchase of Products on Saucedemo

  Scenario: Order products and complete the purchase
    Given the 'user' is logged in with their credential
      | username      | password     |
      | standard_user | secret_sauce |
    When the order,add cart,remove and complete the purchase
      | firstname | lastname | postalcode |
      | Carlos    | Lopez    | 12345      |
    Then the see a success message 'Thank you for your order!'


  Scenario: Entering Shiping Information without postal code
    Given the 'user' is logged in with their credential
      | username      | password     |
      | standard_user | secret_sauce |
    When the enter incomplete shipping information during checkout
      | firstname | lastname | postalcode |
      | Fernando  | Navas    |            |
    Then the see error message 'Error: Postal Code is required'

  Scenario: Entering Shiping Information without firstname
    Given the 'user' is logged in with their credential
      | username      | password     |
      | standard_user | secret_sauce |
    When the enter incomplete shipping information during checkout
      | firstname | lastname | postalcode |
      |           | Navas    | 123        |
    Then the see error with messages 'Error: First Name is required'

  Scenario: Entering Shiping Information whithout lastname
    Given the 'user' is logged in with their credential
      | username      | password     |
      | standard_user | secret_sauce |
    When the enter incomplete shipping information during checkout
      | firstname | lastname | postalcode |
      | Fernando  |          | 234        |
    Then the see error messages 'Error: Last Name is required'








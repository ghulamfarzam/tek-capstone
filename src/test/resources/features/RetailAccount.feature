Feature: Retail Account

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Dragonsandlions@gmail.com' and password 'Tekschool@123'
    And User click on login button
    Then User should be logged into Account
    When User click on Account option

  @updateProfile
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Jan Ali' and Phone '212-555-8888'
    And User click on Update button
    Then user profile information should be updated
  
  @paymentmethod
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 5112304008669333 | Miragha   |              02 |           2028 |       555 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added sucessfully'

@editCard
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 4455338899221100 | Shiragha | 05   | 2030   | 999  |
    And user click on Update Your Card button
   Then a message should be displayed 'Payment Method updated Successfully’

  @removeCard
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  @addAddress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress  | apt | city     | state    | zipCode |
      | United States | BibiGul  |  6468587144 | 630 1st Avenue | 20B | New York | New York |   10017 |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  @editAddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
      | country        | fullName | phoneNumber  | streetAddress    | apt | city     | state    | zipCode |
      | United Kingdom | Joshua   | 212-545-9988 | 4602 70th Street | 9G  | Jersey City | New Jersery |   11377 |
    And User click update Your Address button 'Address Updated Successfully'

  @removeAddress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed

Feature: Retail SignIn

  #this is comment
  @signIn
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Dragonsnypd@gmail.com' and password 'TekSchool@123'
    And User click on login button
    Then User should be logged into Account

@createaccount
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name    | email                   | password  | confirmPassword |
      | Student | Dragonsandlions@gmail.com | Tekschool@123 | Tekschool@123 |
    And User click on SignUp button
    Then User should be logged into account page

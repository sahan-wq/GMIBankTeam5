@US10Negative
Feature: Address of customer can be created

  Background: : TC_01 Address as street and number should be provided and cannot be left blank
    Given User is on GMIBank Login page
    And user provide valid username "Team5Employee"
    And user provide valid password "employeeTeam5"
    And user click sign in button
    And user clicks on My Operations
    And user clicks on Manage Customer
    And user clicks on Create a new Customer
    And user fills in the SSN textbox
    And user clicks on the Search button
    And user fills in the Middle Initial textbox with valid credential
    And user fills in the Phone Number textbox with valid credential
    And user fills in the Zip Code text box with valid credential


    Scenario:
      Given user clears in the Address textbox
      And user fills in the City textbox with valid credential "Dakota City"
      And user selects a country from Country dropdown
      And user fills in the State textbox with valid credential "North Dakota"
      And user selects a account from Account menu "SavingT5"
      And user clicks on the save button
      Then user sees redbox and error message















Feature: Adding the employee in HRMS Application

  @regression
  Scenario: Adding one employee from feature file
    Given user is navigated to HRMS application
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    When user click on PIM option
    And user clicks on add employee option
    And user enters firstname middlename and lastname
    And user clicks on save button
    Then employee added successfully





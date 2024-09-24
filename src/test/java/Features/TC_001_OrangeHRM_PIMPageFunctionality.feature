Feature: Test End to End PIM Page Functionality

  Scenario: Validate login functionaliy
    Given user open a login page url in "incognito" browser
    When user enter valid username and valid password
    Then user click on login button

  Scenario: validate home page Functionality
    When user is on home page and validate home page title
    And user validate home page url
    And user validate home page logo

  Scenario: Validate PIM Page Functionality
    When user is on pim page and validate url
    And user click on add employee
    And user enter firstname and last name
    And user click on save button

Feature: Test End to End Admin Page Functionality

  Scenario: Validate login functionaliy
    Given user open a login page url in "edge" browser
    When user enter valid username and valid password
    Then user click on login button

  Scenario: validate home page Functionality
    When user is on home page and validate home page title
    And user validate home page url
    And user validate home page logo

  Scenario: validate Admin page Functionality
    When user is on admin page validate url
    And user click on add button in admin page
    And user select user role and enter employee name and user select the status
    And user enter username and password and confirm password
    And user click on save button admin page

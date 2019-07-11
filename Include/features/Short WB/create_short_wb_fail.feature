@tag
Feature: The test case verifies that a user can't create short wb is success

  Scenario Outline: Create short wb fail
    Given I am login to procom success
    When I go to short wb page
    And I click button create short wb and type <project_name> in land
    Then I get toast <message> error

    Examples: 
      | project_name | message |
      | I am hungry | GRUNDSTÜCK SCHON VORHANDEN |
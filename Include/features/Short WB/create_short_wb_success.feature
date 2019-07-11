@tag
Feature: The test case verifies that a user can create short wb is success

  Scenario Outline: Create short wb success
    Given I am login to procom success
    When I go to short wb page
    And I click button create short wb and type <project_name> in land
    Then I get toast <message> success and see <project_name> on list

    Examples: 
      | project_name | message |
      | I am hungry | SPEICHERN ERFOLG |
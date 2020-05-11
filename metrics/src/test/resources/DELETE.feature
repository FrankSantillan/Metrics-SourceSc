@del @regression
Feature: DELETE Method metric collection api test

	Background: 
	Given I have a metric to Delete

  @DelP
  Scenario: I will delete a metric by ID
    Given I have an metric ID
    And I prepare the resource to Delete an metric
    When I send the DELETE Request
    Then the status code should be 204
    And I verify in the data base if the resource was Deleted

  @DelN1
  Scenario: I will delete a metric by ID as wrong UUID format
    Given I have an metric ID with wrong format
    And I prepare the resource to Delete an metric
    When I send the DELETE Request
    Then the status code should be 400
    And I verify in the data base if the resource was Deleted
    
  @DelN2
  Scenario: i will delete a metric as null ID
    Given I have an null ID
    And I prepare the resource to Delete an metric
    When I send the DELETE Request
    Then the status code should be 400
    And I verify in the data base if the resource was Deleted
    
  @DelN3
  Scenario: i will delete a metric by ID overlenght
    Given I have an overlenght metric ID
    And I prepare the resource to Delete an metric
    When I send the DELETE Request
    Then the status code should be 400
    And I verify in the data base if the resource was Deleted
    
  @DelN4
  Scenario: I will delete a metric by ID underlenght
    Given I have an underlenght metric ID
    And I prepare the resource to Delete an metric
    When I send the DELETE Request
    Then the status code should be 400
    And I verify in the data base if the resource was Deleted

  @DelN5
  Scenario: I will delete a metric by ID as no existing data
    Given I have an unexistent metric ID
    And I prepare the resource to Delete an metric
    When I send the DELETE Request
    Then the status code should be 404
    And I verify in the data base if the resource was Deleted
    
  @DelN6
  Scenario: I will delete a metric by ID as special characters
    Given I have an metric ID as special characters
    And I prepare the resource to Delete an metric
    When I send the DELETE Request
    Then the status code should be 400
    And I verify in the data base if the resource was Deleted
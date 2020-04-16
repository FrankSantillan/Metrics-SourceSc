
@post
Feature: Post Method

  @postP1 @pos
  Scenario: Create a new metric as correct all format
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
  @postP2 @pos
  Scenario: Create a new metric with type as alphanumeric
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type as Alphanumeric
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
  @postP3 @pos
  Scenario: Create a new metric with type as letters
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type as Letters
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
  @postP5 @pos
  Scenario: Create a new metric with attendance as true
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance as True
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
  @postP6 @pos
  Scenario: Create a new metric with attendance as false
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance as False
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
  @postP7 @pos
  Scenario: Create a new metric with blocked as true
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked as True
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
  @postP8 @pos
  Scenario: Create a new metric with blocked as flase
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked as False
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
  @postP9 @pos
  Scenario: Create a new metric with looked_for_help as true
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help as True
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
  @postP10 @pos
  Scenario: Create a new metric with looked_for_help as false
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help as False
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
  @postP11 @pos
  Scenario: Create a new metric with provided_help as true
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help as True
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
  @postP12 @pos
  Scenario: Create a new metric with provided_help as false
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help as False
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
  @postP13 @pos
  Scenario: Create a new metric with worked_ahead as true
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead as True
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist

  @postP14 @pos
  Scenario: Create a new metric with worked_ahead as false
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead as False
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
  @postP15 @pos
  Scenario: Create a new metric with shared_resources as true
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources as True
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
  @postP16 @pos
  Scenario: Create a new metric with shared_resources as false
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources as False
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
  @postP17 @pos
  Scenario: Create a new metric with carried_over as true
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over as True
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
  @postP18 @pos
  Scenario: Create a new metric with carried_over as false
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over as False
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
  @postP19 @pos
  Scenario: Create a new metric with delayed_looking_help as true
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help as True
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
  @postP20 @pos
  Scenario: Create a new metric with delayed_looking_help as false
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help as False
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
  @postN1 @pos
  Scenario: Create a new metric with type as numeric
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type as Numeric
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
  @postN2
  Scenario: Create a new metric with type as over lenght
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type as overlenght
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
  @postN3
  Scenario: Create a new metric with type as special characters
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type as Special characters
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
  @postN4
  Scenario: Create a new metric with type as case sensitive
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type as case Sensitive
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
  @postN5 @sprint5
  Scenario: Create a new metric with type as null
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type as null
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
  @postN6 @sprint5
  Scenario: Create a new metric with type as empty field
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type as empty field
    And I have a date 
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
  @postN7 @sprint5
  Scenario: Create a new metric with date as incorrect format
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date as incorrect format
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
  @postN8
  Scenario: Create a new metric with date as past date
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date as past date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
  @postN9
  Scenario: Create a new metric with date as future date
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date as future date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
  @postN10 @sprint5
  Scenario: Create a new metric with date as null
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date as null
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
  @postN11 @pos
  Scenario: Create a new metric with blockers: commets as numeric
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments as numeric
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
  @postN12
  Scenario: Create a new metric with blockers: commets as overlenght
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments as overlenght
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
  @postN13
  Scenario: Create a new metric with blockers: commets as special characters
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments as special characters
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
  @postN14 @sprint5
  Scenario: Create a new metric with blockers: commets as null
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
  @postN15 @pos
  Scenario: Create a new metric with blockers: commets as alphanumeric
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments as alphanumeric
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
  @postN16
  Scenario: Create a new metric with retroactive: comments as alphanumeric
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments as alphanumeric
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
  @postN17
  Scenario: Create a new metric with retroactive: commets as numeric
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments as numeric
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
  @postN18
  Scenario: Create a new metric with retroactive: commets as overlenght
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments as overlenght
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
  @postN19
  Scenario: Create a new metric with retroactive: commets as special characters
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments as special characters
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
	@postN20 @sprint5 @pos
  Scenario: Create a new metric with retroactive: commets as null
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments as null
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The API should indicate that the resource was Created
	  And I verify in the database if the Metric exist
	  
 @postN21 @sprint5
  Scenario: Create a new metric as metric as null
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
		And I have an metric as null
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
	@postN22 @sprint5
  Scenario: Create a new metric without evalueted_id
    Given I have an Evaluator ID
    And I have an Evaluated ID as null
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
	@postN23
  Scenario: Create a new metric without evaluator_id
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
	@postN24 @sprint5
  Scenario: Create a new metric without sprint_id
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID as null
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
	@postN25
  Scenario: Create a new metric with sprint_id with a existent metric 
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID with an existent metric
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should return a CONFLICT
	  And I verify in the database if the Metric exist
	  
	@postN26
  Scenario: Create a new metric with unexistent evalueted_id
    Given I have an Evaluator ID
    And I have an with unexistent Evaluated ID 
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
	@postN27
  Scenario: Create a new metric with sprint_id as incorrect format
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID as incorrect format
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
	@postN28
  Scenario: Create a new metric with evaluated_id as incorrect format
    Given I have an Evaluator ID
    And I have an Evaluated ID as incorrect format
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
	@postN29
  Scenario: Create a new metric with evaluator_id as incorrect format
    Given I have an Evaluator ID as incorrect format
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
	@postN30 @sprint5
  Scenario: Create a new metric with blockers as null
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
		And I have the Blockers as null
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
	@postN31 @sprint5
  Scenario: Create a new metric with proactive as null
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have a proactive as null
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
	@postN32 @sprint5
  Scenario: Create a new metric with retroactive as null
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
		And I have an retroactive as null
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
@postN33
  Scenario: Create a new metric with blocked as alphanumeric 
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type 
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked as alphanumeric
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
@postN34
  Scenario: Create a new metric with blocked as cappital letter
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type 
    And I have a date
    And I have an Sprint ID
    And I have an the attendance 
    And I have an blocked as Cappital letter
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
@postN35 @sprint5
  Scenario: Create a new metric with attendance as null
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type 
    And I have a date
    And I have an Sprint ID
    And I have an the attendance as null
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
@postN36
  Scenario: Create a new metric with blocked as cappital letter
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type 
    And I have a date
    And I have an Sprint ID
    And I have an the attendance as cappital letter
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
@postN37 @sprint5
  Scenario: Create a new metric with blocked as null
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type 
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked as null
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
@postN38
  Scenario: Create a new netric with looked_for_help as cappital letter
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type 
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help as cappital letter
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
@postN39 @sprint5
  Scenario: Create a new netric with looked_for_help as null
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help as null
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
@postN40
  Scenario: Create a new metric with provided_help as cappital letter
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help as cappital letter
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
@postN41 @sprint5
  Scenario: Create a new metric with provided_help as null
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help as null
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
@postN42
  Scenario: Create a new metric with worked_ahead as cappital letter
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead as cappital letter
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
@postN43 @sprint5
  Scenario: Create a new metric with worked_ahead as null
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead as null
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
@postN44
  Scenario: Create a new metric with shared_resources as upper case
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources as upper case
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
@postN45 @sprint5 @test
  Scenario: Create a new metric with shared_resources as null
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources as null
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
@postN46
  Scenario: Create a new metric with carried_over as upper case
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over as upper case
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
@postN47 @sprint5
  Scenario: Create a new metric with carried_over as null
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over as null
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
@postN48
  Scenario: Create a new metric with delayed_looking_help as upper case
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help as upper case
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
@postN49 @sprint5
  Scenario: Create a new metric with delayed_looking_help as null
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help as null
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
@postN50
  Scenario: Create a new metric with unexistent sprint_id
    Given I have an Evaluator ID
    And I have an Evaluated ID
    And I have an type
    And I have a date
    And I have an Sprint ID 
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist
	  
	@postN51 @sprint5
  Scenario: Create a new metric with Evaluator_id and Evaluated_id as same ID.
    Given I have an Evaluator ID
    And I have an Evaluated ID as same as evaluator
    And I have an type
    And I have a date
    And I have an Sprint ID 
    And I have an the attendance
    And I have an blocked
    And I have an blockers comments
    And I have an looked for help
    And I have an provided help
    And I have an worked ahead
    And I have an shared resources
    And I have an carried over
    And I have an delayed looking help
    And I have an retroactive comments
    And I prepare the resource
	  When I create a new Metric with Post method
	  Then The status error should be Bad Request
	  And I verify in the database if the Metric exist

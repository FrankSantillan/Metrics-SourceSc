@PUTVALIDATIONS
Feature: In order to contine testing MetricsCollection API
	I going to update metrics collection using  the method PUT for this API
	in this case I going to run scenarios where devs implements more validations like
	update filds as null or empty and date format

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 1 Update where I send evaluator_id as null
  Given I have an existing metric ID
	And I have an "evaluator_id" as null
	And I have an existing evaluated
	And I have type as string
	And I have a date as current date
	And I have an existing sprint
	And I have a Boolean fields as false
	And I have a comment fields
	When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "evaluator_id is required"
  And I validate update with mongoDB

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 2 Update where I send evaluated_id as null
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an "evaluated_id" as null
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "evaluated_id is required"
  And I validate update with mongoDB

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 3 Update where I send type as null
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as null
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "type that is required"
  And I validate update with mongoDB

  @pvnulls
  Scenario: 4 Update where I send date as null
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as null to update
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 5 Update where I send sprint_id as null
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an "sprint_id" as null
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message " sprint_id is required"
  And I validate update with mongoDB
	
	# bools and comments
  
  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 6 Update where I send metrics: attendance as null
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "metrics" "attendance" as null
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "attendance is required"
  And I validate update with mongoDB

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 7 Update where I send metrics: blockers: blocked asnull
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "blockers" "blocked" as null
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "blocked is required"
  And I validate update with mongoDB

  @pvnulls
  Scenario: 8 Update where I send metrics: blockers: comments as null
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  But "blockers" "comments" as null
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 9 Update where I send metrics: proactive: looked_for_help as null
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "looked_for_help" as null
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "looked_for_help is required"
  And I validate update with mongoDB

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 10 Update where I send metrics: proactive: provided_help as null
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "provided_help" as null
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "provided_help is required"
  And I validate update with mongoDB

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 11  Update where I send metrics: proactive: worked_ahead as null
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "worked_ahead" as null
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "worked_ahead is required"
  And I validate update with mongoDB

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 12 Update where I send metrics: proactive: shared_resources as null
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "shared_resources" as null
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "shared_resources is required"
  And I validate update with mongoDB

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 13 Update where I send metrics: carried_over as null
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "metrics" "carried_over" as null
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "carried_over is required"
  And I validate update with mongoDB

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 14 Update where I send retroactive: delayed_looking_help as null
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "retroactive" "delayed_looking_help" as null
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "delayed_looking_help is required"
  And I validate update with mongoDB

	@pvnulls
	Scenario: 15 Update where I send retroactive: comments as null
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  But "retroactive" "comments" as null
  When I update metric using PUT operatation
	Then I should retrieve an OK
	And I validate update with mongoDB

  #-------------------------------------------------------------------------------------------

	#NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 16 Update where I send evaluator_id as empty
  Given I have an existing metric ID
	And I have an "evaluator_id" as empty
	And I have an existing evaluated
	And I have type as string
	And I have a date as current date
	And I have an existing sprint
	And I have a Boolean fields as false
	And I have a comment fields
	When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "evaluator_id is required"
  And I validate update with mongoDB

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 17 Update where I send evaluated_id as empty
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an "evaluated_id" as empty
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "evaluated_id is required"
  And I validate update with mongoDB

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 18 Update where I send type as empty
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as empty
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "type is required"
  And I validate update with mongoDB

  @pvempty
  Scenario: 19 Update where I send date as empty
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as empty
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 20 Update where I send sprint_id as empty
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an "sprint_id" as empty
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "sprint_id is required"
  And I validate update with mongoDB
	
	# bools and comments
	
  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 21 Update where I send metrics: attendance as empty
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "metrics" "attendance" as empty
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "attendance only admits 'true' or 'false'"
  And I validate update with mongoDB

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 22 Update where I send metrics: blockers: blocked asempty
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "blockers" "blocked" as empty
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "blocked only admits 'true' or 'false'"
  And I validate update with mongoDB

  @pvempty
  Scenario: 23 Update where I send metrics: blockers: comments as empty
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  But "blockers" "comments" as empty
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 24 Update where I send metrics: proactive: looked_for_help as empty
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "looked_for_help" as empty
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "looked_for_help only admits 'true' or 'false'"
  And I validate update with mongoDB

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 25 Update where I send metrics: proactive: provided_help as empty
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "provided_help" as empty
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "provided_help only admits 'true' or 'false'"
  And I validate update with mongoDB

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 26  Update where I send metrics: proactive: worked_ahead as empty
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "worked_ahead" as empty
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "worked_ahead only admits 'true' or 'false'"
  And I validate update with mongoDB

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 27 Update where I send metrics: proactive: shared_resources as empty
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "shared_resources" as empty
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "shared_resources only admits 'true' or 'false'"
  And I validate update with mongoDB

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 28 Update where I send metrics: carried_over as empty
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "metrics" "carried_over" as empty
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "carried_over only admits 'true' or 'false'"
  And I validate update with mongoDB

  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 29 Update where I send retroactive: delayed_looking_help as empty
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "retroactive" "delayed_looking_help" as empty
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "delayed_looking_help only admits 'true' or 'false'"
  And I validate update with mongoDB


	Scenario: 30 Update where I send retroactive: comments as empty
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  But "retroactive" "comments" as empty
  When I update metric using PUT operatation
	Then I should retrieve an OK
	And I validate update with mongoDB


  #-------------------------------------------------------------------------------------------
  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 31 Update where I send evaluator and evalauted as equals
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an evaluated equals evaluator
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a conflict
  And I validate error structure message "evaluated_id and evaluator_id that have given must not be equals"
  And I validate update with mongoDB
    
  #NEGATIVEPUTVAL
  @NEGATIVEPUTVAL
  Scenario: 32 Update where I send date as differente format
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as different format
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "date has incorrect format"
  And I validate update with mongoDB

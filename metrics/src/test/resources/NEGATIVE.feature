@NEGATIVEAS
Feature: In order to test MetricsCollection API
	I goint to run negative scenarios to verify standarized error message

  
 
  # E V A L U A T O R 
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.2 Create a new metrics using a non exist evaluator
  Given I have a non exist "evaluator_id"
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a conflict
  And I validate error structure message "evaluator_id does not exist"
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.3 Create a new metrics using a evaluator as letters
  Given I have an "evaluator_id" as letters
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "ERRORMESSAGE"
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.4 Create a new metrics using a evaluator as numeric
  Given I have an "evaluator_id" as numeric
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "ERRORMESSAGE"
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.5 Create a new metrics using a evaluator as over length
  Given I have an "evaluator_id" as over length
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "ERRORMESSAGE"
  
  # E V A L U A T E D-----------------------------------------------------------------------
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.6 Create a new metrics using a non exist evaluated
  Given I have an existing evaluator
  And I have a non exist "evaluated_id"
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a conflict
  And I validate error structure message "evaluates_id does not exist"
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.7 Create a new metrics using a evaluated as letters
  Given I have an existing evaluator
  And I have an "evaluated_id" as letters
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "ERRORMESSAGE"
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.8 Create a new metrics using a evaluated as numeric
  Given I have an existing evaluator
  And I have an "evaluated_id" as numeric
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "ERRORMESSAGE"
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.9 Create a new metrics using a evaluated as over length
  Given I have an existing evaluator
  And I have an "evaluated_id" as over length
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "ERRORMESSAGE"
  
  # S P R I N
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.10 Create a new metrics using a non exist sprint
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have a non exist "sprint_id"
  And I have a Boolean fields as false
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a conflict
  And I validate error structure message "sprint_id does not exist"
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.11 Create a new metrics using a sprint as letters
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an "sprint_id" as numeric
  And I have a Boolean fields as false
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "ERRORMESSAGE"
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.12 Create a new metrics using a sprint as numeric
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an "sprint_id" as letters
  And I have a Boolean fields as false
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "ERRORMESSAGE"
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.13 Create a new metrics using a sprint as over length
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an "sprint_id" as over length
  And I have a Boolean fields as false
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "ERRORMESSAGE"
  
  
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.14 Create a new metrics using metrics attendance as uppercase
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "metrics" "attendance" as uppercase
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "attendance only admits 'true' or 'false'"
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.15 Create a new metrics using metrics carried_over as uppercase
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "metrics" "carried_over" as uppercase
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "carried_over only admits 'true' or 'false'"
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.16 Create a new metrics using blockers blocked as uppercase
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "blockers" "blocked" as uppercase
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "blocked only admits 'true' or 'false'"
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.17 Create a new metrics using proactive looked_for_help as uppercase
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "looked_for_help" as uppercase
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "looked_for_help only admits 'true' or 'false'"
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.18 Create a new metrics using proactive provided_help as uppercase
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "provided_help" as uppercase
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "provided_help only admits 'true' or 'false'"
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.19 Create a new metrics using proactive worked_ahead as uppercase
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "worked_ahead" as uppercase
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "worked_ahead only admits 'true' or 'false'"
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.20 Create a new metrics using proactive shared_resources as uppercase
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "shared_resources" as uppercase
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "shared_resources only admits 'true' or 'false'"
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.21 Create a new metrics using retroactive delayed_looking_help as uppercase
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "retroactive" "delayed_looking_help" as uppercase
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "delayed_looking_help only admits 'true' or 'false'"
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.22 Create a new where I send evaluator_id as null
  Given I have an "evaluator_id" as null
	And I have an existing evaluated
	And I have type as string
	And I have a date as current date
	And I have an existing sprint
	And I have a Boolean fields as false
	And I have a comment fields
	When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "evaluator_id is required"
  And I validate create a new with mongoDB

  #NEGATIVE
  @NEGATIVE
  Scenario: 1.23 Create a new where I send evaluated_id as null
  Given I have an existing evaluator
  And I have an "evaluated_id" as null
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "evaluated_id is required"
  And I validate create a new with mongoDB

  #NEGATIVE
  @NEGATIVE
  Scenario: 1.24 Create a new where I send type as null
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as null
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "type is required"
  And I validate create a new with mongoDB



  #NEGATIVE
  @NEGATIVE
  Scenario: 1.25 Create a new where I send sprint_id as null
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an "sprint_id" as null
  And I have a Boolean fields as false
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "sprint_id is required"
  And I validate create a new with mongoDB
	
	# bools and comments
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.26 Create a new where I send metrics: attendance as null
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "metrics" "attendance" as null
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "attendance is required"
  And I validate create a new with mongoDB

  #NEGATIVE
  @NEGATIVE
  Scenario: 1.27 Create a new where I send metrics: blockers: blocked asnull
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "blockers" "blocked" as null
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "blocked is required"
  And I validate create a new with mongoDB


  #NEGATIVE
  @NEGATIVE
  Scenario: 1.28 Create a new where I send metrics: proactive: looked_for_help as null
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "looked_for_help" as null
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "looked_for_help is required"
  And I validate create a new with mongoDB

  #NEGATIVE
  @NEGATIVE
  Scenario: 1.29 Create a new where I send metrics: proactive: provided_help as null
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "provided_help" as null
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "provided_help is required"
  And I validate create a new with mongoDB

  #NEGATIVE
  @NEGATIVE
  Scenario: 1.30  Create a new where I send metrics: proactive: worked_ahead as null
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "worked_ahead" as null
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "worked_ahead is required"
  And I validate create a new with mongoDB

  #NEGATIVE
  @NEGATIVE
  Scenario: 1.31 Create a new where I send metrics: proactive: shared_resources as null
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "shared_resources" as null
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "shared_resources is required"
  And I validate create a new with mongoDB

  #NEGATIVE
  @NEGATIVE
  Scenario: 1.32 Create a new where I send metrics: carried_over as null
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "metrics" "carried_over" as null
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "carried_over is required"
  And I validate create a new with mongoDB

  #NEGATIVE
  @NEGATIVE
  Scenario: 1.33 Create a new where I send retroactive: delayed_looking_help as null
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "retroactive" "delayed_looking_help" as null
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "delayed_looking_help is required"
  And I validate create a new with mongoDB


  #-------------------------------------------------------------------------------------------

	#NEGATIVE
  @NEGATIVE
  Scenario: 1.34 Create a new where I send evaluator_id as empty
  Given I have an "evaluator_id" as empty
	And I have an existing evaluated
	And I have type as string
	And I have a date as current date
	And I have an existing sprint
	And I have a Boolean fields as false
	And I have a comment fields
	When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "evaluator_id is required"
  And I validate create a new with mongoDB

  #NEGATIVE
  @NEGATIVE
  Scenario: 1.35 Create a new where I send evaluated_id as empty
  Given I have an existing evaluator
  And I have an "evaluated_id" as empty
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "evaluated_id is required"
  And I validate create a new with mongoDB

  #NEGATIVE
  @NEGATIVE
  Scenario: 1.36 Create a new where I send type as empty
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as empty
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "type is required"
  And I validate create a new with mongoDB


  #NEGATIVE
  @NEGATIVE
  Scenario: 1.37 Create a new where I send sprint_id as empty
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an "sprint_id" as empty
  And I have a Boolean fields as false
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "sprint_id is required"
  And I validate create a new with mongoDB
	
	# bools and comments
	
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.38 Create a new where I send metrics: attendance as empty
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "metrics" "attendance" as empty
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "attendance only admits 'true' or 'false'"
  And I validate create a new with mongoDB

  #NEGATIVE
  @NEGATIVE
  Scenario: 1.39 Create a new where I send metrics: blockers: blocked asempty
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "blockers" "blocked" as empty
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "blocked only admits 'true' or 'false'"
  And I validate create a new with mongoDB



  #NEGATIVE
  @NEGATIVE
  Scenario: 1.40 Create a new where I send metrics: proactive: looked_for_help as empty
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "looked_for_help" as empty
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "looked_for_help only admits 'true' or 'false'"
  And I validate create a new with mongoDB

  #NEGATIVE
  @NEGATIVE
  Scenario: 1.41 Create a new where I send metrics: proactive: provided_help as empty
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "provided_help" as empty
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "provided_help only admits 'true' or 'false'"
  And I validate create a new with mongoDB

  #NEGATIVE
  @NEGATIVE
  Scenario: 1.42  Create a new where I send metrics: proactive: worked_ahead as empty
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "worked_ahead" as empty
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "worked_ahead only admits 'true' or 'false'"
  And I validate create a new with mongoDB

  #NEGATIVE
  @NEGATIVE
  Scenario: 1.43 Create a new where I send metrics: proactive: shared_resources as empty
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "shared_resources" as empty
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "shared_resources only admits 'true' or 'false'"
  And I validate create a new with mongoDB

  #NEGATIVE
  @NEGATIVE
  Scenario: 1.44 Create a new where I send metrics: carried_over as empty
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "metrics" "carried_over" as empty
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "carried_over only admits 'true' or 'false'"
  And I validate create a new with mongoDB

  #NEGATIVE
  @NEGATIVE
  Scenario: 1.45 Create a new where I send retroactive: delayed_looking_help as empty
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "retroactive" "delayed_looking_help" as empty
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "delayed_looking_help only admits 'true' or 'false'"
  And I validate create a new with mongoDB

  #-------------------------------------------------------------------------------------------
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.46 Create a new where I send evaluator and evalauted as equals
  Given I have an existing evaluator
  And I have an evaluated equals evaluator
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a conflict
  And I validate error structure message "ERRORMESSAGE"
  And I validate create a new with mongoDB
    
  #NEGATIVE
  @NEGATIVE
  Scenario: 1.47 Create a new where I send date as differente format
  Given I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as different format
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I create a new metric using POST operatation
  Then I should retrieve a bad request
  And I validate error structure message "date has incorrect format"
  And I validate create a new with mongoDB
  
  #-------------------------------------------------------------------------------------------------
  #-----------------------D E L E T E --------------------------------------------------------------
  #-------------------------------------------------------------------------------------------------
  
  #NEGATIVE
  @NEGATIVEDEL
  Scenario: 3 Delete Sprint by non-exist ID
  Given I have a non exist ID
  When I delete metric using DELETE operarion
  Then I should retrieve a not found
  And I validate error structure message "ERRORMESSAGE"
  
  #NEGATIVE
  @NEGATIVEDEL
  Scenario: 4 Delete Sprint by ID as letters
  Given I have a metric ID as letters
  When I delete metric using DELETE operarion
  Then I should retrieve a bad request
  And I validate error structure message "ERRORMESSAGE"
  
  #NEGATIVE
  @NEGATIVEDEL
  Scenario: 5 Delete Sprint by ID as numeric
  Given I have a metric ID as numeric
  When I delete metric using DELETE operarion
  Then I should retrieve a bad request
  And I validate error structure message "ERRORMESSAGE"
  
  #NEGATIVE
  @NEGATIVEDEL
  Scenario: 6 Delete Sprint by ID as over length
  Given I have a metric ID as over length
  When I delete metric using DELETE operarion
  Then I should retrieve a bad request
  And I validate error structure message "ERRORMESSAGE"
  
  
  
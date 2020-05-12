@PUTMETHOD @regression
Feature: In order to test MetricsCollection API
	I going to update metrics collection using  the PUT method for this API
	
	
	@PUT
  Scenario: 1 Update metrics using an existing ID
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 2 Update metrics using a non exist ID
  Given I have a non exist ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a not found
  And I validate error structure message "Metric Id not found"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 3 Update metrics using an ID as letters
  Given I have a metric ID as letters
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "Metric Id has incorrect format"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 4 Update metrics using an ID as numeric 
  Given I have a metric ID as numeric
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "Metric Id has incorrect format"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 5 Update metrics using an ID as over length 
  Given I have a metric ID as over length
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "Metric Id has incorrect format"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 6 Update metrics using an ID as null 
  Given I have a metric ID as null
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "Metric Id has incorrect format"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 7 Update metrics using an ID as empty 
  Given I have a metric ID as empty
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a method not allowed
	  And I validate error structure message "Request method 'PUT' not supported"
  
  # E V A L U A T O R ------------------------------------------------------
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 8 Update metrics using a non exist evaluator
  Given I have an existing metric ID
  And I have a non exist "evaluator_id"
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a conflict
  And I validate error structure message "Evaluator id not exist"
  
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 9 Update metrics using a evaluator as letters
  Given I have an existing metric ID
  And I have an "evaluator_id" as letters
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "Evaluator id not exist"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 10 Update metrics using a evaluator as numeric
  Given I have an existing metric ID
  And I have an "evaluator_id" as numeric
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "Evaluator id not exist"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 11 Update metrics using a evaluator as over length
  Given I have an existing metric ID
  And I have an "evaluator_id" as over length
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "Evaluator id not exist"
  
  # E V A L U A T E D-----------------------------------------------------------------------
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 12 Update metrics using a non exist evaluated
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have a non exist "evaluated_id"
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a conflict
  And I validate error structure message "evaluated_id doest not exist"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 13 Update metrics using a evaluated as letters
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an "evaluated_id" as letters
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "evaluated_id doest not exist"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 14 Update metrics using a evaluated as numeric
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an "evaluated_id" as numeric
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "evaluated_id doest not exist"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 15 Update metrics using a evaluated as over length
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an "evaluated_id" as over length
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "evaluated_id doest not exist"
  
  # S P R I N ---------------------------------------------------------
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 16 Update metrics using a non exist sprint
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have a non exist "sprint_id"
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a conflict
  And I validate error structure message "Sprint id not found"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 17 Update metrics using a sprint as letters
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an "sprint_id" as numeric
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "Sprint id not found"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 18 Update metrics using a sprint as numeric
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an "sprint_id" as letters
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "Sprint id not found"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 19 Update metrics using a sprint as over length
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an "sprint_id" as over length
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "Sprint id not found"
  
  # T Y P E---------------------------------------------
  
  @putype
  Scenario: 20 Update metrics using type as numeric
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as numeric
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB
  
  @putype
  Scenario: 21 Update metrics using type as alphanumeric
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as alphanumeric
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB
  
  @putype
  Scenario: 22 Update metrics using type as over length
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as over length
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB
  
  @putype
  Scenario: 23 Update metrics using type as special chars
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as special chars
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB
  
  @putype
  Scenario: 24 Update metrics using type as capital letters
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as capital letters
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB
  
  # D A T E 
  
  @putdate
  Scenario: 25 Update metrics using a past date
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as past date to update
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB
  
  @putdate
  Scenario: 26 Update metrics using a future date
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as future date to uptade
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB
  
  # B L O C K E R S - C O M M E N T S
  
  @putcom
  Scenario: 27 Update metrics using blockers comments as numeric
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  But I have a blockers comments as numeric
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB
  
  
  @putcom
  Scenario: 28 Update metrics using blockers comments as alphanumeric
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  But I have a blockers comments as alphanumeric
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB
  
  @putcom
  Scenario: 29 Update metrics using blockers comments as over length
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  But I have a blockers comments as over length
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB
  
  @putcom
  Scenario: 30 Update metrics using blockers comments as special chars
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  But I have a blockers comments as special chars
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB
  
  @putcom
  Scenario: 31 Update metrics using blockers comments as capital letters
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  But I have a blockers comments as capital letters
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB
  
  # R E T R O A C T I V E - C O M M E N T S
  
  @putcom
  Scenario: 32 Update metrics using blockers comments as numeric
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  But I have a retroactive comments as numeric
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB
  
  
  @putcom
  Scenario: 33 Update metrics using blockers comments as alphanumeric
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  But I have a retroactive comments as alphanumeric
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB
  
  @putcom
  Scenario: 34 Update metrics using blockers comments as over length
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  But I have a retroactive comments as over length
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB
  
  @putcom
  Scenario: 35 Update metrics using blockers comments as special chars
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  But I have a retroactive comments as special chars
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB
  
  @putcom
  Scenario: 36 Update metrics using blockers comments as capital letters
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  But I have a retroactive comments as capital letters
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB
  
  # B O O L E A N - F I E L D S
  
  @putbool
  Scenario: 37 Update metrics using boolean fields as true
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve an OK
  And I validate update with mongoDB
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 38 Update metrics using metrics attendance as uppercase
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "metrics" "attendance" as uppercase
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "Attendance only admits 'true' or 'false'"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 39 Update metrics using metrics carried_over as uppercase
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "metrics" "carried_over" as uppercase
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "Carried_over only admits 'true' or 'false'"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 40 Update metrics using blockers blocked as uppercase
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "blockers" "blocked" as uppercase
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "Blocked only admits 'true' or 'false'"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 41 Update metrics using proactive looked_for_help as uppercase
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "looked_for_help" as uppercase
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "Looked_for_help only admits 'true' or 'false'"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 42 Update metrics using proactive provided_help as uppercase
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "provided_help" as uppercase
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "Provided_help only admits 'true' or 'false'"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 43 Update metrics using proactive worked_ahead as uppercase
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "worked_ahead" as uppercase
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "worked_ahead only admits 'true' or 'false'"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 44 Update metrics using proactive shared_resources as uppercase
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "proactive" "shared_resources" as uppercase
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "Shared_resources only admits 'true' or 'false'"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
  Scenario: 45 Update metrics using retroactive delayed_looking_help as uppercase
  Given I have an existing metric ID
  And I have an existing evaluator
  And I have an existing evaluated
  And I have type as string
  And I have a date as current date
  And I have an existing sprint
  And I have a Boolean fields as false
  But "retroactive" "delayed_looking_help" as uppercase
  And I have a comment fields
  When I update metric using PUT operatation
  Then I should retrieve a bad request
  And I validate error structure message "Delayed_looking_help only admits 'true' or 'false'"
  
  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Evaluator_id is required"
  And I validate update with mongoDB

  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Evaluated_id is required"
  And I validate update with mongoDB

  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Type that is required"
  And I validate update with mongoDB

  @pvnulls4
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

  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Sprint_id is required"
  And I validate update with mongoDB
	
	# bools and comments
  
  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Attendance is required"
  And I validate update with mongoDB

  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Blocked is required"
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

  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Looked_for_help is required"
  And I validate update with mongoDB

  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Provided_help is required"
  And I validate update with mongoDB

  #NEGATIVEPUT
  @NEGATIVEPUT
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

  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Shared_resources is required"
  And I validate update with mongoDB

  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Carried_over is required"
  And I validate update with mongoDB

  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Delayed_looking_help is required"
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

	#NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Evaluator_id is required"
  And I validate update with mongoDB

  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Evaluated_id is required"
  And I validate update with mongoDB

  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Type is required"
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

  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Sprint_id is required"
  And I validate update with mongoDB
	
	# bools and comments
	
  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Attendance only admits 'true' or 'false'"
  And I validate update with mongoDB

  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Blocked only admits 'true' or 'false'"
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

  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Looked_for_help only admits 'true' or 'false'"
  And I validate update with mongoDB

  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Provided_help only admits 'true' or 'false'"
  And I validate update with mongoDB

  #NEGATIVEPUT
  @NEGATIVEPUT
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

  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Shared_resources only admits 'true' or 'false'"
  And I validate update with mongoDB

  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Carried_over only admits 'true' or 'false'"
  And I validate update with mongoDB

  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Delayed_looking_help only admits 'true' or 'false'"
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
  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Evaluated_id and evaluator_id that have given must not be equals"
  And I validate update with mongoDB
    
  #NEGATIVEPUT
  @NEGATIVEPUT
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
  And I validate error structure message "Date has incorrect format"
  And I validate update with mongoDB
  

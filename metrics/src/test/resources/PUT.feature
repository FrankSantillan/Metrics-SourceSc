	@PUTMETHOD
Feature: In order to test MetricsCollection API
	I going to update metrics collection using  the PUT method for this API
	
	
	@putid1
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
  And I validate error structure message "Metric not found"
  
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
  And I validate error structure message "The given ID has incorrect format"
  
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
  And I validate error structure message "The given ID has incorrect format"
  
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
  And I validate error structure message "The given ID has incorrect format"
  
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
  And I validate error structure message "The given ID has incorrect format"
  
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
  And I validate error structure message "ERRORMESSAGE"
  
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
  And I validate error structure message "evaluador_id doest not exist"
  
  
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
  And I validate error structure message "ERRORMESSAGE"
  
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
  And I validate error structure message "ERRORMESSAGE"
  
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
  And I validate error structure message "ERRORMESSAGE"
  
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
  And I validate error structure message "ERRORMESSAGE"
  
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
  And I validate error structure message "ERRORMESSAGE"
  
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
  And I validate error structure message "ERRORMESSAGE"
  
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
  And I validate error structure message "sprint_id does not exist"
  
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
  And I validate error structure message "ERRORMESSAGE"
  
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
  And I validate error structure message "ERRORMESSAGE"
  
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
  And I validate error structure message "ERRORMESSAGE"
  
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
  And I have a date as past date
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
  And I have a date as future date
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
  And I validate error structure message " attendance only admits 'true' or 'false'"
  
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
  And I validate error structure message "carried_over only admits 'true' or 'false'"
  
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
  And I validate error structure message "blocked only admits 'true' or 'false'"
  
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
  And I validate error structure message "looked_for_help only admits 'true' or 'false'"
  
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
  And I validate error structure message "provided_help only admits 'true' or 'false'"
  
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
  And I validate error structure message "shared_resources only admits 'true' or 'false'"
  
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
  And I validate error structure message "delayed_looking_help only admits 'true' or 'false'"
  

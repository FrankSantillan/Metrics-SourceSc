@GETFILTERS
Feature: In order to test MetricsCollection API
	I test GET operation add filters: 
	
	@gfevaluator
	Scenario: 1 Get using an existing evaluator
	Given I get an existing metrics
	And I have an existing "evaluator_id" to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information

	#NEGATIVE
  @NEGATIVE
	Scenario: 2 Get using a non exist evaluator_id
	Given I have a non exist "evaluator_id" to search
  When I search metric using GET operation adding filters
  Then I should retrieve a not found
  And I validate error structure
  
  @gfevaluator
	Scenario: 3 Get using evaluator_id as letters
	Given I have an "evaluator_id" as letters to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  @gfevaluator
	Scenario: 4 Get using evaluator_id as numeric
	Given I have an "evaluator_id" as numeric to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  #NEGATIVE
  @NEGATIVE
	Scenario: 5 Get using evaluator_id as special characters
	Given I have an "evaluator_id" as special chars to search
  When I search metric using GET operation adding filters
  Then I should retrieve a bad request
  And I validate error structure
  
  @gfevaluator
	Scenario: 6 Get using evalutor_id as null
	Given I have an "evaluator_id" as null to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  @gfevaluator
	Scenario: 7 Get using evalutor_id as empty
	Given I have an "evaluator_id" as empty to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  # E V A L U A T E D - I D -------------------------------------------------------------------------------------------------------------
  
  @gfevaluated
	Scenario: 8 Get using an existing evaluated_id
	Given I get an existing metrics
	And I have an existing "evaluated_id" to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information

	#NEGATIVE
  @NEGATIVE
	Scenario: 9 Get using a non exist evaluated_id
	Given I have a non exist "evaluated_id" to search
  When I search metric using GET operation adding filters
  Then I should retrieve a not found
  And I validate error structure
  
  @gfevaluated
	Scenario: 10 Get using evaluated_id as letters
	Given I have an "evaluated_id" as letters to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  @gfevaluated
	Scenario: 11 Get using evaluated_id as numeric
	Given I have an "evaluated_id" as numeric to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  #NEGATIVE
  @NEGATIVE
	Scenario: 12 Get using evaluated_id as special characters
	Given I have an "evaluated_id" as special chars to search
  When I search metric using GET operation adding filters
  Then I should retrieve a bad request
  And I validate error structure
  
  @gfevaluated
	Scenario: 13 Get using evaluated_id as null
	Given I have an "evaluated_id" as null to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  @gfevaluated
	Scenario: 14 Get using evaluated_id as empty
	Given I have an "evaluated_id" as empty to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  # S P R I N T - I D -------------------------------------------------------------------------------------------------------------
  
	@gfsprint
	Scenario: 1 Get using an existing sprint_id
	Given I get an existing metrics
	And I have an existing "sprint_id" to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information

	#NEGATIVE
  @NEGATIVE
	Scenario: 16 Get using a non exist sprint_id
	Given I have a non exist "sprint_id" to search
  When I search metric using GET operation adding filters
  Then I should retrieve a not found
  And I validate error structure
  
  @gfsprint
	Scenario: 17 Get using sprint_id as letters
	Given I have an "sprint_id" as letters to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  @gfsprint
	Scenario: 18 Get using sprint_id as numeric
	Given I have an "sprint_id" as numeric to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  #NEGATIVE
  @NEGATIVE
	Scenario: 19 Get using sprint_id as special characters
	Given I have an "sprint_id" as special chars to search
  When I search metric using GET operation adding filters
  Then I should retrieve a bad request
  And I validate error structure
  
  @gfsprint
	Scenario: 20 Get using sprint_id as null
	Given I have an "sprint_id" as null to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  @gfsprint
	Scenario: 21 Get using sprint_id as empty
	Given I have an "sprint_id" as empty to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  
  # S T A R T -  D A T E---------------------------------------------------------------
  
  @gfstartdate
  Scenario: 22 Get using startDate as correct format
  Given I get an existing metrics
	And I have start date to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 23 Get using startDate as incorrect format
  Given I have "startDate" as incorrect format to search
  When I search metric using GET operation adding filters
  Then I should retrieve a bad request
  And I validate error structure
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 24 Get using startDate as null
  Given I have "startDate" as null to search
  When I search metric using GET operation adding filters
  Then I should retrieve a bad request
  And I validate error structure
  
  @gfstartdate
  Scenario: 25 Get using startDate as empty
  Given I have "startDate" as empty to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
   # E N D - D A T E -----------------------------------------------------------------------------------------
  
  @gfenddate
  Scenario: 26 Get using endDate as correct format
	Given I have end date to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 27 Get using endDate as incorrect format
  Given I have "endDate" as incorrect format to search
  When I search metric using GET operation adding filters
  Then I should retrieve a bad request
  And I validate error structure
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 28 Get using endDateendDate as null
  Given I have "endDate" as null to search
  When I search metric using GET operation adding filters
  Then I should retrieve a bad request
  And I validate error structure
  
  @gfenddate
  Scenario: 29 Get using endDate as empty
  Given I have "endDate" as empty to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  

  #----------------------------------------------------------------------
  
  @gf1
  Scenario: 30 Get using evaluator_id and evaluated_id
  Given I get an existing metrics
	And I have an existing "evaluator_id" to search
	And I have an existing "evaluated_id" to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  @gf1
  Scenario: 31 Get using evaluator_id and sprint_id
  Given I get an existing metrics
	And I have an existing "evaluator_id" to search
	And I have an existing "sprint_id" to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  @gf1
  Scenario: 32 Get using evaluator_id and startDate
  Given I get an existing metrics
	And I have an existing "evaluator_id" to search
	And I have start date to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information

	@gf1
  Scenario: 33 Get using evaluator_id and endDate
  Given I get an existing metrics
	And I have an existing "evaluator_id" to search
	And I have end date to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  #----------------------------------------------------------------------
 
  @gf1
  Scenario: 34 Get using evaluated_id and sprint_id
  Given I get an existing metrics
	And I have an existing "evaluated_id" to search
	And I have an existing "sprint_id" to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  @gf1
  Scenario: 35 Get using evaluated_id and startDate
  Given I get an existing metrics
	And I have an existing "evaluated_id" to search
	And I have start date to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information

	@gf1
  Scenario: 36 Get using evaluated_id and endDate
  Given I get an existing metrics
	And I have an existing "evaluated_id" to search
	And I have end date to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  #----------------------------------------------------------------------
 	@gf1
  Scenario: 37 Get using evaluator_id and startDate
  Given I get an existing metrics
	And I have an existing "sprint_id" to search
	And I have start date to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information

	@gf1
  Scenario: 38 Get using evaluator_id and endDate
  Given I get an existing metrics
	And I have an existing "sprint_id" to search
	And I have end date to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  #----------------------------------------------------------------------
	
	@gf1
  Scenario: 39 Get using start and end Date
  Given I get an existing metrics
  And I have start date to search
  And I have end date to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  #----------------------------------------------------------------------
 
	@gf1
  Scenario: 40 Get using start and end Date
  Given I get an existing metrics
	And I have an existing "evaluator_id" to search
	And I have an existing "evaluated_id" to search
	And I have an existing "sprint_id" to search
  And I have start date to search
  And I have end date to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  
  
  
  
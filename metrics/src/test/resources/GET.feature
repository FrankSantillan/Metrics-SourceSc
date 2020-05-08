@GETMETHOD
Feature: In order to test MetricsCollection API
	I need type my scenarios to GET method

	@GET
  Scenario: 1 Get all documents from MetricsCollectionAPI
  Given I need see all metrics collection
  When I search metric using GET operarion
  Then I should retrieve an OK
	
	@GET
  Scenario: 2 Get Metric by existing ID
  Given I have an existing metric ID
  When I search metric using GET operarion
  Then I should retrieve an OK
  And I validate GET reponse with MongoDB
  
  #NEGATIVEGET
  @NEGATIVEGET
  Scenario: 3 Get Metric by non-exist ID
  Given I have a non exist ID
  When I search metric using GET operarion
  Then I should retrieve a not found
  And I validate error structure message "Metric Id not found"
  
  #NEGATIVEGET
  @NEGATIVEGET
  Scenario: 4 Get Metric by ID as letters
  Given I have a metric ID as letters
  When I search metric using GET operarion
  Then I should retrieve a bad request
  And I validate error structure message "Metric Id has incorrect format"
  
  #NEGATIVEGET
  @NEGATIVEGET
  Scenario: 5 Get Metric by ID as numeric
  Given I have a metric ID as numeric
  When I search metric using GET operarion
  Then I should retrieve a bad request
  And I validate error structure message "Metric Id has incorrect format"
  
  #NEGATIVEGET
  @NEGATIVEGET
  Scenario: 6 Get Metric by ID as over length
  Given I have a metric ID as over length
  When I search metric using GET operarion
  Then I should retrieve a bad request
  And I validate error structure message "Metric Id has incorrect format"
	
	@GETFILTERS
	Scenario: 1 Get using an existing evaluator
	Given I get an existing metrics
	And I have an existing "evaluator_id" to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information

  @GETFILTERS
	Scenario: 2 Get using a non exist evaluator_id
	Given I have a non exist "evaluator_id" to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  @GETFILTERS
	Scenario: 3 Get using evaluator_id as letters
	Given I have an "evaluator_id" as letters to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  @GETFILTERS
	Scenario: 4 Get using evaluator_id as numeric
	Given I have an "evaluator_id" as numeric to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  #GETFILTERS
  @GETFILTERS
	Scenario: 5 Get using evaluator_id as special characters
	Given I have an "evaluator_id" as special chars to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  @GETFILTERS
	Scenario: 6 Get using evalutor_id as null
	Given I have an "evaluator_id" as null to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  @GETFILTERS
	Scenario: 7 Get using evalutor_id as empty
	Given I have an "evaluator_id" as empty to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  # E V A L U A T E D - I D -------------------------------------------------------------------------------------------------------------
  
  @GETFILTERS
	Scenario: 8 Get using an existing evaluated_id
	Given I get an existing metrics
	And I have an existing "evaluated_id" to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information

	#GETFILTERS
  @GETFILTERS
	Scenario: 9 Get using a non exist evaluated_id
	Given I have a non exist "evaluated_id" to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  @GETFILTERS
	Scenario: 10 Get using evaluated_id as letters
	Given I have an "evaluated_id" as letters to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  @GETFILTERS
	Scenario: 11 Get using evaluated_id as numeric
	Given I have an "evaluated_id" as numeric to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  #GETFILTERS
  @GETFILTERS
	Scenario: 12 Get using evaluated_id as special characters
	Given I have an "evaluated_id" as special chars to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  @GETFILTERS
	Scenario: 13 Get using evaluated_id as null
	Given I have an "evaluated_id" as null to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  @GETFILTERS
	Scenario: 14 Get using evaluated_id as empty
	Given I have an "evaluated_id" as empty to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  # S P R I N T - I D -------------------------------------------------------------------------------------------------------------
  
	@GETFILTERS
	Scenario: 1 Get using an existing sprint_id
	Given I get an existing metrics
	And I have an existing "sprint_id" to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information

	#GETFILTERS
  @GETFILTERS
	Scenario: 16 Get using a non exist sprint_id
	Given I have a non exist "sprint_id" to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  @GETFILTERS
	Scenario: 17 Get using sprint_id as letters
	Given I have an "sprint_id" as letters to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  @GETFILTERS
	Scenario: 18 Get using sprint_id as numeric
	Given I have an "sprint_id" as numeric to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  #GETFILTERS
  @GETFILTERS
	Scenario: 19 Get using sprint_id as special characters
	Given I have an "sprint_id" as special chars to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  @GETFILTERS
	Scenario: 20 Get using sprint_id as null
	Given I have an "sprint_id" as null to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  @GETFILTERS
	Scenario: 21 Get using sprint_id as empty
	Given I have an "sprint_id" as empty to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  
  # S T A R T -  D A T E---------------------------------------------------------------
  
  @GETFILTERS
  Scenario: 22 Get using startDate as correct format
  Given I get an existing metrics
	And I have start date to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  
  #GETFILTERS
  @GETFILTERS	
  Scenario: 23 Get using startDate as incorrect format
  Given I have "startDate" as incorrect format to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  #GETFILTERS
  @GETFILTERS
  Scenario: 24 Get using startDate as null
  Given I have "startDate" as null to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  @GETFILTERS
  Scenario: 25 Get using startDate as empty
  Given I have "startDate" as empty to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
   # E N D - D A T E -----------------------------------------------------------------------------------------
  
  @GETFILTERS
  Scenario: 26 Get using endDate as correct format
	Given I have end date to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  
  #GETFILTERS
  @GETFILTERS
  Scenario: 27 Get using endDate as incorrect format
  Given I have "endDate" as incorrect format to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  #GETFILTERS
  @GETFILTERS
  Scenario: 28 Get using endDateendDate as null
  Given I have "endDate" as null to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrieve array empty
  
  @GETFILTERS
  Scenario: 29 Get using endDate as empty
  Given I have "endDate" as empty to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  

  #----------------------------------------------------------------------
  
  @GETFILTERS
  Scenario: 30 Get using evaluator_id and evaluated_id
  Given I get an existing metrics
	And I have an existing "evaluator_id" to search
	And I have an existing "evaluated_id" to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  @GETFILTERS
  Scenario: 31 Get using evaluator_id and sprint_id
  Given I get an existing metrics
	And I have an existing "evaluator_id" to search
	And I have an existing "sprint_id" to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  @GETFILTERS
  Scenario: 32 Get using evaluator_id and startDate
  Given I get an existing metrics
	And I have an existing "evaluator_id" to search
	And I have start date to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information

	@GETFILTERS
  Scenario: 33 Get using evaluator_id and endDate
  Given I get an existing metrics
	And I have an existing "evaluator_id" to search
	And I have end date to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  #----------------------------------------------------------------------
 
  @GETFILTERS
  Scenario: 34 Get using evaluated_id and sprint_id
  Given I get an existing metrics
	And I have an existing "evaluated_id" to search
	And I have an existing "sprint_id" to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  @GETFILTERS
  Scenario: 35 Get using evaluated_id and startDate
  Given I get an existing metrics
	And I have an existing "evaluated_id" to search
	And I have start date to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information

	@GETFILTERS
  Scenario: 36 Get using evaluated_id and endDate
  Given I get an existing metrics
	And I have an existing "evaluated_id" to search
	And I have end date to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  #----------------------------------------------------------------------
 	@GETFILTERS
  Scenario: 37 Get using evaluator_id and startDate
  Given I get an existing metrics
	And I have an existing "sprint_id" to search
	And I have start date to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information

	@GETFILTERS
  Scenario: 38 Get using evaluator_id and endDate
  Given I get an existing metrics
	And I have an existing "sprint_id" to search
	And I have end date to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  #----------------------------------------------------------------------
	
	@GETFILTERS
  Scenario: 39 Get using start and end Date
  Given I get an existing metrics
  And I have start date to search
  And I have end date to search
  When I search metric using GET operation adding filters
  Then I should retrieve an OK
  And I should retrived information
  
  #----------------------------------------------------------------------
 
	@GETFILTERS
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
  
  
  @GETPAGINATION
	Scenario: 1 Get using size as numeric
	Given I count all documents
	And I have "size" as numeric
	When I search metrics with pagination using GET method
	Then I should retrieve an OK
	And I validate size
	
	#GETPAGINATION
  @GETPAGINATION
	Scenario: 2 Get using size equals zero
	Given I have "size" as zero
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure message "size had an invalid value"
	
	@GETPAGINATION
	Scenario: 3 Get using size as over leng
	Given I count all documents
	And I have "size" as over lenght
	When I search metrics with pagination using GET method
	Then I should retrieve an OK
	And I validate size that are equals all documents
	
	#GETPAGINATION
  @GETPAGINATION
	Scenario: 4 Get using size as letters
	Given I have "size" as letters
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure message "size field must only have numbers"
	
	#GETPAGINATION
  @GETPAGINATION
	Scenario: 5 Get using size as alphanumeric
	Given I have "size" as alphanumeric
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure message "size field must only have numbers"
	
	#GETPAGINATION
  @GETPAGINATION
	Scenario: 6 Get using size as special chars
	Given I have "size" as special chars
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure message "size field must only have numbers"
	
	#GETPAGINATION
  @GETPAGINATION
	Scenario: 7 Get using size as negative number
	Given I have "size" as negative
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure message "size had an invalid value"
	
	#GETPAGINATION
  @GETPAGINATION
	Scenario: 8 Get using size as null
	Given I have "size" as null
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure message "size field must only have numbers"
	
	@GETPAGINATION
	Scenario: 9 Get using size as empty
	Given I count all documents
	And I have "size" as empty
	When I search metrics with pagination using GET method
	Then I should retrieve an OK
	And I validate size that are equals all documents
	#-----------------------------------------------------------------
	
	@GETPAGINATION
	Scenario: 10 Get using page as numeric
	Given I count all documents
	And I have "page" as numeric
	When I search metrics with pagination using GET method
	Then I should retrieve an OK
	Then size should be one
	
	#GETPAGINATION
  @GETPAGINATION
	Scenario: 11 Get using page equals zero
	Given I have "page" as zero
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request	
	And I validate error structure message "page had an invalid value"
	
	@GETPAGINATION
	Scenario: 12 Get using page as over leng
	Given I have "page" as over lenght
	When I search metrics with pagination using GET method
	Then I should retrieve an OK
	And this equals array empty
	
	#GETPAGINATION
  @GETPAGINATION
	Scenario: 13 Get using page as letters
	Given I have "page" as letters
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure message "page field must only have numbers"
	
	#GETPAGINATION
  @GETPAGINATION
	Scenario: 14 Get using page as alphanumeric
	Given I have "page" as alphanumeric
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure message "page field must only have numbers"
	
	#GETPAGINATION
  @GETPAGINATION
	Scenario: 15 Get using page as special chars
	Given I have "page" as special chars
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure message "page field must only have numbers"
	
	#GETPAGINATION
  @GETPAGINATION
	Scenario: 16 Get using page as negative number
	Given I have "page" as negative
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure message "page had an invalid value"
	
	#GETPAGINATION
  @GETPAGINATION
	Scenario: 17 Get using page as null
	Given I have "page" as null
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure message "page field must only have numbers"
	
	@GETPAGINATION
	Scenario: 18 Get using page as empty
	Given I count all documents
	And I have "page" as empty
	When I search metrics with pagination using GET method
	Then I should retrieve an OK
	And I validate size that are equals all documents
	
	#----------------------------------
	@GETPAGINATION
	Scenario: 19 Get using size and page as numeric
	Given I count all documents
	And I have "size" as numeric
	And I have "page" equals 1
	When I search metrics with pagination using GET method
	Then I should retrieve an OK
	And I validate size
	
	@GETPAGINATION
	Scenario: 20 Get using page out size
	Given I count all documents
	And I have "size" as numeric
	And I have "page" as outpage
	When I search metrics with pagination using GET method
	And I should retrieve an OK
	Then this equals array empty
	
	#--------------------------------------------
	@GETPAGINATION
	Scenario: 21 Get using size equals one
	Given I count all documents
	And I have "size" equals 1
	When I search metrics with pagination using GET method
	Then I should retrieve an OK
	And size should be one
	
	@GETPAGINATION
	Scenario: 22 Get using page equals one
	Given I count all documents
	And I have "page" equals 1
	When I search metrics with pagination using GET method
	Then I should retrieve an OK
	And I validate size that are equals all documents
  
	@GETPAGINATION
	Scenario: 23 Get using page equals total document
	Given I count all documents
	And I have "page" equals total documents
	When I search metrics with pagination using GET method
	Then I should retrieve an OK
	And this equals array empty

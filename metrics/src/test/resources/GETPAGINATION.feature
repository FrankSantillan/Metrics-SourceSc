@GETPAGINATION
Feature: In order to test MetricsCollection API
	I test GET operation with pagination filters
	
	@gp
	Scenario: 1 Get using size as numeric
	Given I count all documents
	And I have "size" as numeric
	When I search metrics with pagination using GET method
	Then I should retrieve an OK
	And I validate size
	
	#NEGATIVE
  @NEGATIVE
	Scenario: 2 Get using size equals zero
	Given I have "size" as zero
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure
	
	@gp
	Scenario: 3 Get using size as over leng
	Given I count all documents
	And I have "size" as over lenght
	When I search metrics with pagination using GET method
	Then I should retrieve an OK
	And I validate size that are equals all documents
	
	#NEGATIVE
  @NEGATIVE
	Scenario: 4 Get using size as letters
	Given I have "size" as letters
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure
	
	#NEGATIVE
  @NEGATIVE
	Scenario: 5 Get using size as alphanumeric
	Given I have "size" as alphanumeric
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure
	
	#NEGATIVE
  @NEGATIVE
	Scenario: 6 Get using size as special chars
	Given I have "size" as special chars
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure
	
	#NEGATIVE
  @NEGATIVE
	Scenario: 7 Get using size as negative number
	Given I have "size" as negative
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure
	
	#NEGATIVE
  @NEGATIVE
	Scenario: 8 Get using size as null
	Given I have "size" as null
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure
	
	@gp
	Scenario: 9 Get using size as empty
	Given I count all documents
	And I have "size" as empty
	When I search metrics with pagination using GET method
	Then I should retrieve an OK
	And I validate size that are equals all documents
	#-----------------------------------------------------------------
	
	@getpage
	Scenario: 10 Get using page as numeric
	Given I count all documents
	And I have "page" as numeric
	When I search metrics with pagination using GET method
	Then I should retrieve an OK
	Then size should be one
	
	#NEGATIVE
  @NEGATIVE
	Scenario: 11 Get using page equals zero
	Given I have "page" as zero
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request	
	And I validate error structure
	
	@getpage
	Scenario: 12 Get using page as over leng
	Given I have "page" as over lenght
	When I search metrics with pagination using GET method
	Then I should retrieve an OK
	And this equals array empty
	
	#NEGATIVE
  @NEGATIVE
	Scenario: 13 Get using page as letters
	Given I have "page" as letters
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure
	
	#NEGATIVE
  @NEGATIVE
	Scenario: 14 Get using page as alphanumeric
	Given I have "page" as alphanumeric
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure
	
	#NEGATIVE
  @NEGATIVE
	Scenario: 15 Get using page as special chars
	Given I have "page" as special chars
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure
	
	#NEGATIVE
  @NEGATIVE
	Scenario: 16 Get using page as negative number
	Given I have "page" as negative
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure
	
	#NEGATIVE
  @NEGATIVE
	Scenario: 17 Get using page as null
	Given I have "page" as null
	When I search metrics with pagination using GET method
	Then I should retrieve a bad request
	And I validate error structure
	
	@getpage
	Scenario: 18 Get using page as empty
	Given I count all documents
	And I have "page" as empty
	When I search metrics with pagination using GET method
	Then I should retrieve an OK
	And I validate size that are equals all documents
	
	#----------------------------------
	@pg1
	Scenario: 19 Get using size and page as numeric
	Given I count all documents
	And I have "size" as numeric
	And I have "page" equals 1
	When I search metrics with pagination using GET method
	Then I should retrieve an OK
	And I validate size
	
	@pg1
	Scenario: 20 Get using page out size
	Given I count all documents
	And I have "size" as numeric
	And I have "page" as outpage
	When I search metrics with pagination using GET method
	And I should retrieve an OK
	Then this equals array empty
	
	#--------------------------------------------
	@pg1
	Scenario: 21 Get using size equals one
	Given I count all documents
	And I have "size" equals 1
	When I search metrics with pagination using GET method
	Then I should retrieve an OK
	Then size should be one
	
	@pg1
	Scenario: 22 Get using page equals one
	Given I count all documents
	And I have "page" equals 1
	When I search metrics with pagination using GET method
	Then I should retrieve an OK
	Then size should be one
  
	@pg1
	Scenario: 23 Get using page equals total document
	Given I count all documents
	And I have "page" equals total documents
	When I search metrics with pagination using GET method
	Then I should retrieve an OK
	Then size should be one
@GETMETHOD
Feature: In order to test MetricsCollection API
	I need type my scenarios to GET method

	@GetRegression
  Scenario: 1 Get all documents from MetricsCollectionAPI
  Given I need see all metrics collection
  When I search metric using GET operarion
  Then I should retrieve an OK
	
	@GetRegression
  Scenario: 2 Get Sprint by existing ID
  Given I have an existing metric ID
  When I search metric using GET operarion
  Then I should retrieve an OK
  And I validate GET reponse with MongoDB
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 3 Get Sprint by non-exist ID
  Given I have a non exist ID
  When I search metric using GET operarion
  Then I should retrieve a not found
  And I validate error structure
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 4 Get Sprint by ID as letters
  Given I have a metric ID as letters
  When I search metric using GET operarion
  Then I should retrieve a bad request
  And I validate error structure
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 5 Get Sprint by ID as numeric
  Given I have a metric ID as numeric
  When I search metric using GET operarion
  Then I should retrieve a bad request
  And I validate error structure
  
  #NEGATIVE
  @NEGATIVE
  Scenario: 6 Get Sprint by ID as over length
  Given I have a metric ID as over length
  When I search metric using GET operarion
  Then I should retrieve a bad request
  And I validate error structure

  
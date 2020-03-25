@GETMETHOD
Feature: In order to test SprintCollection API
	I need type my scenarios to GET method

	
  Scenario: Get all documents from SprintCollectionsAPI
  Given I need see all sprints
  When I send GET request to API to get all
  Then I retrieve status code and it should be 200 OK

  Scenario: Get Sprint by existing ID
  Given I have an existing ID
  When I send GET request to API
  Then I retrieve status code and it should be 200 OK
  And I validate reponse with MongoDB
  
  @non
  Scenario: Get Sprint by non-existing ID
  Given I have a non-existen ID
  When I send GET request to API
  Then I retrieve status code and it should be 404 Not Found
  And I validate reponse with MongoDB
  
  Scenario: Get Sprint by ID as letters
  Given I have a ID as letters
  When I send GET request to API
  Then I retrieve status code and it should be 400 Bad request
  And I validate reponse with MongoDB
  
  Scenario: Get Sprint by ID as numeric
  Given I have a ID as numeric
  When I send GET request to API as numeric
  Then I retrieve status code and it should be 400 Bad request
  And I validate reponse with MongoDB
  
  Scenario: Get Sprint by ID as special characters
  Given I have a ID as special characters
  When I send GET request to API
  Then I retrieve status code and it should be 400 Bad request
  And I validate reponse with MongoDB
  
  Scenario: Get Sprint by ID as over length
  Given I have a ID as over length
  When I send GET request to API
  Then I retrieve status code and it should be 400 Bad request
  And I validate reponse with MongoDB
  

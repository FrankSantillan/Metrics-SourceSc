package com.stepdefinitions;

import java.util.Date;

import org.json.JSONObject;

import org.json.JSONObject;

import com.globalClasses.ApiPaths;
import com.globalClasses.ApiTools;
import com.globalClasses.BasicSecurityUtil;
import com.globalClasses.MongoDBUtils;
import com.globalClasses.RandomTools;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Get {
	
	private BasicSecurityUtil base;
	String IDString;
	long IDLong;
	int statusCodeExpected, statusCodeRetrieved;
	boolean boolCheck = false;
	boolean boolRetrieved = false;
	 JSONObject jsonObject;
	public Get(BasicSecurityUtil base) {
		this.base = base;
	}
	
	RandomTools random = new RandomTools();
	
	@Given("I need see all sprints")
	public void i_need_see_all_sprints() {
		IDString = "";
	}

	@Given("I have an existing ID")
	public void i_have_an_existing_ID() {
		IDString = MongoDBUtils.executeRandomSelect("TEST", "InternHome", "metrics", "_id");
	}

	@Given("I have a non-existen ID")
	public void i_have_a_non_existen_ID() {
		IDString = MongoDBUtils.executeRandomSelect("TEST", "InternHome", "metrics", "_id");
		IDString = IDString.replaceAll("[0-5]", "7");
	}

	@Given("I have a ID as letters")
	public void i_have_a_ID_as_letters() {
		IDString = random.randomFirstName();		
	}
	
	@Given("I have a ID as over length")
	public void i_have_a_ID_as_over_length() {
		IDString = random.randomFirstNameOL();
	}

	@Given("I have a ID as numeric")
	public void i_have_a_ID_as_numeric() {
		IDLong = random.generateNumberPhoneRandomlong();
	}

	@Given("I have a ID as special characters")
	public void i_have_a_ID_as_special_characters() {
		IDString  = random.randomSpecialCharacteres();
	}
	
	// W H E N - - S T E P S 

	@When("I send GET request to API")
	public void i_send_GET_request_to_API() {
		
		base.apiResource = ApiPaths.MONGOCRUD + "/"+IDString;
		base.ServiceApi = new ApiTools();
        base.response = base.ServiceApi.retrieve(base.apiResource);
        base.responseBody = base.response.getBody();
        base.method = "GET";
        statusCodeRetrieved = base.response.getStatusCodeValue();
        System.out.println(base.responseBody);

        jsonObject = new JSONObject(base.responseBody);
        System.out.println("\n\tStatus code response\t " + statusCodeRetrieved);
	}
	
	@When("I send GET request to API to get all")
	public void i_send_GET_request_to_API_to_get_all() {
		base.apiResource = ApiPaths.MONGOCRUD + "/"+IDString;
		base.ServiceApi = new ApiTools();
        base.response = base.ServiceApi.retrieve(base.apiResource);
        base.responseBody = base.response.getBody();
        base.method = "GET";
        statusCodeRetrieved = base.response.getStatusCodeValue();
        System.out.println(base.responseBody);
	}

	
	@When("I send GET request to API as numeric")
	public void i_send_GET_request_to_API_as_numeric() {
		base.apiResource = ApiPaths.MONGOCRUD + "/"+IDLong;
		System.out.println("ID "  + IDLong);
		base.ServiceApi = new ApiTools();
        base.response = base.ServiceApi.retrieve(base.apiResource);
        base.responseBody = base.response.getBody();
        base.method = "GET";
        statusCodeRetrieved = base.response.getStatusCodeValue();
        System.out.println(base.responseBody);
      
	}

	
	//  T H E N  - - S T E P S
	@Then("I retrieve status code and it should be {int} OK")
	public void i_retrieve_status_code_and_it_should_be_OK(Integer statusCode) {
		statusCodeExpected = statusCode;
		if(statusCodeExpected == statusCodeRetrieved) {
			boolCheck = true;
		}
		assert statusCodeRetrieved == statusCodeExpected ;
		
	}

	@Then("I retrieve status code and it should be {int} Not Found")
	public void i_retrieve_status_code_and_it_should_be_Not_Found(Integer statusCode) {
		statusCodeExpected = statusCode;
		if(statusCodeExpected == statusCodeRetrieved) {
			boolCheck = true;
		}
		assert statusCodeRetrieved == statusCodeExpected ;
	}

	@Then("I retrieve status code and it should be {int} Bad request")
	public void i_retrieve_status_code_and_it_should_be_Bad_request(Integer statusCode) {
		statusCodeExpected = statusCode;
		if(statusCodeExpected == statusCodeRetrieved) {
			boolCheck = true;
		}
		assert statusCodeRetrieved == statusCodeExpected ;
	}

	
	@Then("I validate reponse with MongoDB")
	public void i_validate_reponse_with_MongoDB() {
		switch(statusCodeRetrieved) {
		case 200:
			boolRetrieved = MongoDBUtils.ExecuteGet("TEST", "InternHome", "metrics", IDString, jsonObject );
			System.out.println(boolRetrieved +" "+ boolCheck);
			assert boolRetrieved == boolCheck ;break;
			
		case 404:
			boolRetrieved = MongoDBUtils.ExecuteGet("TEST", "InternHome", "metrics", IDString, jsonObject );
			System.out.println(boolRetrieved +" "+ boolCheck);
			assert boolRetrieved != boolCheck ;break;
			
		}
	}

}
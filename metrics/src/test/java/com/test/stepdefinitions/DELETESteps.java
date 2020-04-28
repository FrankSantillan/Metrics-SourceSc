package com.test.stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.json.JSONArray;

import com.test.globalclasses.BasicSecurityUtil;
import com.test.globalclasses.RandomTools;
import com.test.globalclasses.ApiPaths;
import com.test.globalclasses.ApiTools;
import com.test.globalclasses.MongoDBUtils;
import com.test.globalclasses.BrowserDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DELETESteps {
	private BasicSecurityUtil base;
	BrowserDriver myBrowser = new BrowserDriver();
	long firstNameInt = 0, lastNameInt = 0, phoneInt = 0, idInt;
	int statusCodeExpected, statusCodeRetrieved;
	boolean bool = false;
	boolean boolRetrieved = false;
	String userFirstName, userLastName, userID, userPhone, field, data ,user ,id = "_id";
	String substr = "";
	JSONArray jsonResult = new JSONArray();
	String test, unext;
	
	RandomTools random = new RandomTools();
	public DELETESteps(BasicSecurityUtil base) {
		this.base = base;
	}
	
	// BACKGROUND
	@Given("I have a metric to Delete")
	public void i_have_a_metric_to_Delete() {
	    // Write code here that turns the phrase above into concrete actions
		 test = MongoDBUtils.executeRandomSelectID("TEST", "InternHome", "metrics", id);
		 System.out.println(test + " 777777777777777777777");
	}
	
	@Given("I have an metric ID")
	public void i_have_an_metric_ID() {
	    // Write code here that turns the phrase above into concrete actions
	    userID = test;
	    unext = test;
	}

	@Given("I have an null ID")
	public void i_have_an_null_ID() {
	    // Write code here that turns the phrase above into concrete actions
	    userID = null;

	}

	@Given("I have an overlenght metric ID")
	public void i_have_an_overlenght_metric_ID() {
	    // Write code here that turns the phrase above into concrete actions
		userID = test + random.generateNumberPhoneRandomlong();
	}
	
	@Given("I have an metric ID with wrong format")
	public void i_have_an_metric_ID_with_wrong_format() {
	    // Write code here that turns the phrase above into concrete actions
		userID = test.substring(0, 10) + "123456789f";
	}

	@Given("I have an underlenght metric ID")
	public void i_have_an_underlenght_metric_ID() {
	    // Write code here that turns the phrase above into concrete actions
		userID = test.substring(0, 10);

	}

	@Given("I have an metric ID as special characters")
	public void i_have_an_metric_ID_as_special_characters() {
	    // Write code here that turns the phrase above into concrete actions
		userID = test + "!#&()�*][]";
	}

	@Given("I have an unexistent metric ID")
	public void i_have_an_unexistent_metric_ID() {
	    // Write code here that turns the phrase above into concrete actions
	    userID = "5e94cb712e64f70bb043b946";
	}


	@Given("I prepare the resource to Delete an metric")
	public void i_prepare_the_resource_to_Delete_an_metric() {
	    // Write code here that turns the phrase above into concrete actions
		base.apiResource = ApiPaths.METRICS + userID ;

	}

	@When("I send the DELETE Request")
	public void i_send_the_DELETE_Request() {
	    // Write code here that turns the phrase above into concrete actions
		base.ServiceApi = new ApiTools();
	    base.response = base.ServiceApi.retrieveDelete(base.apiResource);
	    base.method = "DELETE";
	}

	@Then("the status code should be {int}")
	public void the_status_code_should_be(int code) {
	    // Write code here that turns the phrase above into concrete actions
	    int result = Integer.parseInt(base.response.getStatusCode().toString().substring(0, 3));
	    System.out.println("code " + code + "res: " + result);
	    assertEquals(code, result);
	}
	
	@Then("I verify in the data base if the resource was Deleted")
	public void i_verify_in_the_data_base_if_the_resource_was_Deleted() {
	    // Write code here that turns the phrase above into concrete actions

			JSONArray jsonResult = new JSONArray();
			System.out.println(userID);			
			jsonResult = MongoDBUtils.executeMyQuery("TEST", "InternHome", "metrics", id, userID);	
		    if (jsonResult.length() == 0) {
		    	System.out.println("Error: --------------------- FAILED");
		    }else {	    	
		    	System.out.println("Success: --------------------- Success");
		    }
	}

}

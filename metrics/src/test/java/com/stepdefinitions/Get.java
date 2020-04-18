package com.stepdefinitions;

import org.json.JSONObject;
import com.globalClasses.ApiPaths;
import com.globalClasses.ApiTools;
import com.globalClasses.BasicSecurityUtil;
import com.globalClasses.MongoDBUtils;
import com.globalClasses.MyTools;
import com.globalClasses.RandomTools;
import com.globalClasses.globalVariables;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Get {
	
	private BasicSecurityUtil base;
	private globalVariables variable;
	
	public Get(BasicSecurityUtil base , globalVariables variable) {
		this.base = base;
		
		this.variable = variable;
	}
	
	RandomTools random = new RandomTools();
	MyTools myTools = new MyTools();

	int  statusCodeRetrieved;

	boolean boolRetrieved = false;
	JSONObject jsonObject;
	
	
	
	
	
	@Given("I need see all metrics collection")
	public void i_need_see_all_metrics_collection() {
		variable.metricID = "";
	}
	
	@Given("I have an existing metric ID")
	public void i_have_an_existing_metric_ID() {
		//variable.metricID = MongoDBUtils.executeRandomSelect("TEST", "InternHome", "metrics", "_id");
				variable.metricID = "5e94c03d2b23de190a809651";
	}
	
	@Given("I have a non exist ID")
	public void i_have_a_non_exist_ID() {
		variable.metricID = "5e9486cbe5303d599f55f833";
	}
	
	
	@Given("I have a metric ID as letters")
	public void i_have_a_metric_ID_as_letters() {
		variable.metricID = random.idLetters();
	}

	@Given("I have a metric ID as numeric")
	public void i_have_a_metric_ID_as_numeric() {
		variable.metricID = random.idNumber();
	}

	@Given("I have a metric ID as over length")
	public void i_have_a_metric_ID_as_over_length() {
		variable.metricID = "5e948739e5303d599f55f83e5e948739e5303d599f55f83e";
	}

	@Given("I have a metric ID as null")
	public void i_have_a_metric_ID_as_null() {
		variable.metricID = null;
	}

	@Given("I have a metric ID as empty")
	public void i_have_a_metric_ID_as_empty() {
		variable.metricID = "";
	}


	
	// W H E N - - S T E P S 
	
	@When("I search metric using GET operarion")
	public void i_search_metric_using_GET_operarion() {
		base.apiResource = ApiPaths.METRICS + variable.metricID;
		base.ServiceApi = new ApiTools();
        base.response = base.ServiceApi.retrieve(base.apiResource);
        base.responseBody = base.response.getBody();
        base.method = "GET";
        statusCodeRetrieved = base.response.getStatusCodeValue();
        
        myTools.resource( ApiPaths.METRICS + variable.metricID  );
        myTools.statusCode(String.valueOf(statusCodeRetrieved));
        myTools.responseBody(base.responseBody);
        
        if(!variable.metricID.equals("")) {
        	 jsonObject = new JSONObject(base.responseBody);
        }
	}



	@Then("I validate GET reponse with MongoDB")
	public void i_validate_GET_reponse_with_MongoDB() {

		switch(statusCodeRetrieved) {
		case 200:
			boolRetrieved = MongoDBUtils.ExecuteGet("TEST", "InternHome", "metrics", variable.metricID, jsonObject );
			assert boolRetrieved == true ;break;
			
		case 404:
			boolRetrieved = MongoDBUtils.ExecuteGet("TEST", "InternHome", "metrics", variable.metricID, jsonObject );
			
			assert boolRetrieved == false ;break;
			
		}
		

	}

}
package com.stepdefinitions;

import java.time.LocalDate;

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

public class GETFILTERS{
	
	private BasicSecurityUtil base;
	private globalVariables variable;
	
	public GETFILTERS(BasicSecurityUtil base , globalVariables variable) {
		this.base = base;
		
		this.variable = variable;
	}
	
	RandomTools random = new RandomTools();
	MyTools myTools = new MyTools();
	
	

	

	
	//
	
	@Given("I get an existing metrics")
	public void i_get_an_existing_metrics() {
	    variable.metricObject = new JSONObject(MongoDBUtils.executeRandomSelectJson("TEST", "InternHome", "metrics"));
	}
	
	//  I D 
	
	@Given("I have an existing {string} to search")
	public void i_have_an_existing_to_search(String string) {
	    variable.param = variable.param + "&" + string + "=" + variable.metricObject.get(string);
	}

	@Given("I have a non exist {string} to search")
	public void i_have_a_non_exist_to_search(String string) {
		variable.param = variable.param + "&" + string + "=" + "5e9486cbe5303d599f55f833";
	}
	
	@Given("I have an {string} as letters to search")
	public void i_have_an_as_letters_to_search(String string) {
		variable.param = variable.param + "&" + string + "=" + random.idLetters();
	}

	
	@Given("I have an {string} as numeric to search")
	public void i_have_an_as_numeric_to_search(String string) {
		variable.param = variable.param + "&" + string + "=" + random.idNumber();
	}

	@Given("I have an {string} as special chars to search")
	public void i_have_an_as_special_chars_to_search(String string) {
		variable.param = variable.param + "&" + string + "=" + random.randomSpecialCharacteres();
	}

	@Given("I have an {string} as null to search")
	public void i_have_an_as_null_to_search(String string) {
		variable.param = variable.param + "&" + string + "=" + null;
	}

	@Given("I have an {string} as empty to search")
	public void i_have_an_as_empty_to_search(String string) {
		variable.param = variable.param + "&" + string + "=" + "";
	}

	// D A T E 
	
	@Given("I have start date to search")
	public void i_have_start_date_to_search() {
		variable.param = variable.param + "&" + "startDate" + "=" + variable.metricObject.get("date");
	}

	@Given("I have {string} as incorrect format to search")
	public void i_have_as_incorrect_format_to_search(String string) {
		variable.param = variable.param + "&" + string + "=" + "01-01-2020";
	}
	
	@Given("I have end date to search")
	public void i_have_end_date_to_search() {
		variable.param = variable.param + "&" + "endDate" + "=" + LocalDate.now();
	}


	@Given("I have {string} as null to search")
	public void i_have_as_null_to_search(String string) {
		variable.param = variable.param + "&" + string + "=" + null;
	}

	@Given("I have {string} as empty to search")
	public void i_have_as_empty_to_search(String string) {
		variable.param = variable.param + "&" + string + "=" + "";
	}


	@When("I search metric using GET operation adding filters")
	public void i_search_metric_using_GET_operation_adding_filters() {
		base.apiResource = ApiPaths.METRICS + "?" + variable.param ;
		base.ServiceApi = new ApiTools();
        base.response = base.ServiceApi.retrieve(base.apiResource);
        base.responseBody = base.response.getBody();
        base.method = "GET";
        
        myTools.resource( ApiPaths.METRICS + "?" + variable.param  );
        myTools.statusCode(String.valueOf(base.response.getStatusCodeValue()));
        myTools.responseBody(base.responseBody);
        
        System.out.println("\n\tQuery param \t " + ApiPaths.METRICS + "?" + variable.param);
        System.out.println("\n\tResponse body \t " + base.responseBody);

        System.out.println("\n\tStatus code response\t " + base.response.getStatusCodeValue());
	}


	@Then("I should retrived information")
	public void i_should_retrived_information() {
		if(base.responseBody.toString().equals("[]")) {
			assert 0 == 1;
		}

	}
	
	@Then("I should retrieve array empty")
	public void i_should_retrieve_array_empty() {
		assert base.responseBody.toString().equals("[]");
		
	}
	
	

	

	
	




	
}


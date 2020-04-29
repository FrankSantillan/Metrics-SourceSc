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

public class GETPAGINATION{
	
	private BasicSecurityUtil base;
	private globalVariables variable;
	
	public GETPAGINATION(BasicSecurityUtil base , globalVariables variable) {
		this.base = base;
		
		this.variable = variable;
	}
	
	
	RandomTools random = new RandomTools();
	MyTools myTools = new MyTools();

	
	int totalDocs;

	
	//  S T E P S - D E F I N I T I O N S
	
	@Given("I count all documents")
	public void i_count_all_documents() {
		base.apiResource = ApiPaths.METRICS;
		base.ServiceApi = new ApiTools();
        base.response = base.ServiceApi.retrieve(base.apiResource);
        base.responseBody = base.response.getBody();
        base.method = "GET";
        
        int initial;
        initial = base.responseBody.indexOf("type");
        while (initial != -1) {
        	totalDocs++; 
        	initial = base.responseBody.indexOf("type", initial + 1);
        }
        //System.out.println(totalDocs);
        assert totalDocs != 0: "Metrics collecion is empy, I cant run  this scenario";

	}
	
	@Given("I have {string} as numeric")
	public void i_have_as_numeric(String string) {
		variable.size = (int)(Math.random()*(totalDocs-1+1)+1);
	    variable.param = variable.param + "&" + string + "=" + variable.size ;
	}


	@Given("I have {string} as zero")
	public void i_have_as_zero(String string) {
		variable.param = variable.param + "&" + string + "=" + 0;
	}

	@Given("I have {string} as over lenght")
	public void i_have_as_over_lenght(String string) {
		variable.param = variable.param + "&" + string + "=" + 2147483647;
	}


	@Given("I have {string} as letters")
	public void i_have_as_letters(String string) {
		variable.param = variable.param + "&" + string + "=" + random.randomNumberLetters();
	}

	@Given("I have {string} as alphanumeric")
	public void i_have_as_alphanumeric(String string) {
		variable.param = variable.param + "&" + string + "=" + random.alphanumeric() ;
	}

	@Given("I have {string} as special chars")
	public void i_have_as_special_chars(String string) {
		variable.param = variable.param + "&" + string + "=" + random.randomSpecialCharacteres() ;
	}

	@Given("I have {string} as negative")
	public void i_have_as_negative(String string) {
		variable.param = variable.param + "&" + string + "=" + (int) (Math.random()*-(9-1+1)+1);
	}

	@Given("I have {string} as null")
	public void i_have_as_null(String string) {
		variable.param = variable.param + "&" + string + "=" + null ;
	}

	@Given("I have {string} as empty")
	public void i_have_as_empty(String string) {
		variable.param = variable.param + "&" + string + "=" ;
	}
	
	@Given("I have {string} equals {int}")
	public void i_have_equals(String string, Integer number) {
		variable.param = variable.param + "&" + string + "=" + number ;
	}
	
	@Given("I have {string} as outpage")
	public void i_have_as_outpage(String string) {
		variable.param = variable.param + "&" + string + "=" + (totalDocs + 2) ;
	}
	
	@Given("I have {string} equals total documents")
	public void i_have_equals_total_documents(String string) {
		variable.param = variable.param + "&" + string + "=" + totalDocs ;
	}



	
	@When("I search metrics with pagination using GET method")
	public void i_search_metrics_with_pagination_using_GET_method() {
		base.apiResource = ApiPaths.METRICS + "?" + variable.param ; 
		base.ServiceApi = new ApiTools();
        base.response = base.ServiceApi.retrieve(base.apiResource);
        base.responseBody = base.response.getBody();
        base.method = "GET";
        
        System.out.println(ApiPaths.METRICS + "?"+ variable.param);
        myTools.resource(ApiPaths.METRICS + "?"+ variable.param );
        myTools.statusCode(String.valueOf(base.response.getStatusCodeValue()));
        myTools.responseBody(base.responseBody);
	}
	
	



	@Then("I validate size")
	public void i_validate_size() {
		
		int initial;
		int count  = 0;
        initial = base.responseBody.indexOf("type");
        while (initial != -1) {
        	count++; 
        	initial = base.responseBody.indexOf("type", initial + 1);
        }
        
        assert count == variable.size: "Size non equals " + "\n\tSize: " + variable.size + "\n\tTotal docs retrieved: " + count ;
        
	}
	
	@Then("I validate size that are equals all documents")
	public void i_validate_size_that_are_equals_all_documents() {
		
		int initial;
		int count  = 0;
        initial = base.responseBody.indexOf("type");
        while (initial != -1) {
        	count++; 
        	initial = base.responseBody.indexOf("type", initial + 1);
        }
        System.out.println(totalDocs);
        System.out.println(count);
        assert count == totalDocs: "Size non equals total docs T\n\tTotal docs: " + totalDocs + "\n\tTotal docs retrieved: " + count;
        
	}
	
	@Then("size should be one")
	public void size_should_be_one() {
		
		int initial;
		int count  = 0;
        initial = base.responseBody.indexOf("type");
        while (initial != -1) {
        	count++; 
        	initial = base.responseBody.indexOf("type", initial + 1);
        }
        
        System.out.println(count);
        
        assert count == 1: "Size  are not one  \n\tSize = " + count;
        
	}
	
	@Then("this equals array empty")
	public void this_equals_array_empty() {
		assert base.responseBody.toString().equals("[]");
	}
	
	@Then("I validate page that are equals all documents")
	public void i_validate_page_that_are_equals_all_documents() {
		int initial;
		int count  = 0;
        initial = base.responseBody.indexOf("type");
        while (initial != -1) {
        	count++; 
        	initial = base.responseBody.indexOf("type", initial + 1);
        }
        System.out.println(totalDocs);
        System.out.println(count);
        assert count == totalDocs: "Size non equals";
	}


}
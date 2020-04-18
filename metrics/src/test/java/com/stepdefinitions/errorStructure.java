package com.stepdefinitions;

import com.globalClasses.BasicSecurityUtil;

import io.cucumber.java.en.Then;

public class errorStructure{
	private BasicSecurityUtil base;
	
	public errorStructure(BasicSecurityUtil base) {
		this.base = base;
	}
	
	@Then("I should retrieve an OK")
	public void i_should_retrieve_an_OK() {
		
		assert base.response.getStatusCodeValue() == 200 : " Retrieve status code incorrect " +
			"\n\tStatus code retrieved: " + base.response.getStatusCodeValue() +
			"\n\tResponse body retrieved: " + base.responseBody;;
	}

	
	@Then("I should retrieve a bad request")
	public void i_should_retrieve_a_bad_request() {
		
		assert base.response.getStatusCodeValue() == 400 : " Retrieve status code incorrect " +
				"\n\tStatus code retrieved: " + base.response.getStatusCodeValue() +
				"\n\tResponse body retrieved: " + base.responseBody;
	}
	
	@Then("I should retrieve a not found")
	public void i_should_retrieve_a_not_found() {
		
		assert base.response.getStatusCodeValue() == 404 : " Retrieve status code incorrect " +
				"\n\tStatus code retrieved: " + base.response.getStatusCodeValue() +
				"\n\tResponse body retrieved: " + base.responseBody;
	}
	
	@Then("I should retrieve a method not allowed")
	public void i_should_retrieve_a_method_not_allowed() {
		assert base.response.getStatusCodeValue() == 405 : " Retrieve status code incorrect " +
				"\n\tStatus code retrieved: " + base.response.getStatusCodeValue() +
				"\n\tResponse body retrieved: " + base.responseBody;
	}

	
	@Then("I should retrieve a conflict")
	public void i_should_retrieve_a_conflict() {
		
		assert base.response.getStatusCodeValue() == 409 : " Retrieve status code incorrect " +
				"\n\tStatus code retrieved: " + base.response.getStatusCodeValue() +
				"\n\tResponse body retrieved: " + base.responseBody;
	}
	

	
	
	
	
	@Then("I validate error structure")
	public void i_valite_error_structure() {
	   System.out.println(base.responseBody);
	}
}
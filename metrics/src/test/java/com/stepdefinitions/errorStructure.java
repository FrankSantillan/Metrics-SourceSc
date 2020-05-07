package com.stepdefinitions;

import org.json.JSONObject;

import com.globalClasses.BasicSecurityUtil;
import com.globalClasses.MyTools;
import com.globalClasses.globalVariables;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class errorStructure{
	private BasicSecurityUtil base;
	private globalVariables variable;
	
	public errorStructure(BasicSecurityUtil base , globalVariables variable) {
		this.base = base;
		
		this.variable = variable;
	}
	MyTools myTools = new MyTools();
	
	@Then("I should retrieve an OK")
	public void i_should_retrieve_an_OK() {
		
		assert base.response.getStatusCodeValue() == 200 : "\n\t Retrieve status code incorrect " +
				"\n\tStatus code expected: 200 "  +	
			"\n\tStatus code retrieved: " + base.response.getStatusCodeValue() +
			"\n\tResponse body retrieved: " + base.responseBody;;
	}

	
	@Then("I should retrieve a bad request")
	public void i_should_retrieve_a_bad_request() {
		
		assert base.response.getStatusCodeValue() == 400 : "\n\t Retrieve status code incorrect " +
				"\n\tStatus code expected: 400 "  +	
				"\n\tStatus code retrieved: " + base.response.getStatusCodeValue() +
				"\n\tResponse body retrieved: " + base.responseBody;
	}
	
	@Then("I should retrieve a not found")
	public void i_should_retrieve_a_not_found() {
		
		assert base.response.getStatusCodeValue() == 404 : "\n\t Retrieve status code incorrect " +
				"\n\tStatus code expected: 404 "  +	
				"\n\tStatus code retrieved: " + base.response.getStatusCodeValue() +
				"\n\tResponse body retrieved: " + base.responseBody;
	}
	
	@Then("I should retrieve a method not allowed")
	public void i_should_retrieve_a_method_not_allowed() {
		assert base.response.getStatusCodeValue() == 405 : "\n\t Retrieve status code incorrect " +
				"\n\tStatus code expected: 405 "  +	
				"\n\tStatus code retrieved: " + base.response.getStatusCodeValue() +
				"\n\tResponse body retrieved: " + base.responseBody;
	}

	
	@Then("I should retrieve a conflict")
	public void i_should_retrieve_a_conflict() {
		
		assert base.response.getStatusCodeValue() == 409 : "\n\tRetrieve status code incorrect " +
				"\n\tStatus code expected: 409 "  +	
				"\n\tStatus code retrieved: " + base.response.getStatusCodeValue() +
				"\n\tResponse body retrieved: " + base.responseBody;
	}
	

	@Then("I validate error structure message {string}")
	public void i_validate_error_structure_message(String string) {
		System.out.println(base.responseBody);
		   JSONObject error = new JSONObject(base.responseBody);
		   
		    
			myTools.status(Integer.toString(error.getInt("status")));
			myTools.message(error.getString("message"));
			myTools.path(error.getString("path"));
			myTools.timestamp(error.getString("timestamp"));
		   assert error.getInt("status") == base.response.getStatusCodeValue():"\n\tStatus is not same that status code API	";
		   
		   
		   
		   assert error.getString("message").indexOf(string)>-1 : "\n\t Standat error message" +"\n\t Message expected: " + string +
		   "\n\t Message retrieved: " + error.getString("message") ;
		   
		   switch(base.response.getStatusCodeValue()) {
		   case 400:
			   assert "Bad Request".equals(error.getString("error")): "\n\t Incorrect syntax" + "\n\t Retrieved: " +error.getString("error")+
			   "\n\t Expected: Bad request ";break;
		   case 404:
			   assert "Not Found".equals(error.getString("error")): "\n\t Incorrect syntax" + "\n\t Retrieved: " +error.getString("error")+
			   "\n\t Expected: Not found ";break;
		   case 405:
			   assert "Method not allowed".equals(error.getString("error")): "\n\t Incorrect syntax" + "\n\t Retrieved: " +error.getString("error")+
			   "\n\t Expected: Method not allowed ";break;
		   case 409:
			   assert "Conflict".equals(error.getString("error")): "\n\t Incorrect syntax" + "\n\t Retrieved: " +error.getString("error")+
			   "\n\t Expected: Conflict";break;
		   }
		   
		   
		   assert error.getString("path").indexOf("/metrics/"+variable.param)>-1 :"\n\t Path incorrect formart"+ "\n\t Path expected: /metrics/" + variable.param +
		   "\n\t Path retrieved: " + error.getString("path") ;
		   
		   
		   
		   
	}
	


	
	
	
}
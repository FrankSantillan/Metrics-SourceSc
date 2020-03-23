package com.stepdefinitions;

import org.json.JSONObject;

import com.globalClasses.ApiPaths;
import com.globalClasses.ApiTools;
import com.globalClasses.BasicSecurityUtil;
import com.globalClasses.MongoDBUtils;
import com.globalClasses.RandomTools;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetTest {
	/*
	private BasicSecurityUtil base;
	String firstName, lastName, phone, idRetrieved;
	long firstNameInt = 0, lastNameInt = 0, phoneInt = 0, idInt;
	int statusCodeExpected, statusCodeRetrieved;
	boolean bool = false;
	boolean boolRetrieved = false;
	
	RandomTools random = new RandomTools();
	
	public GetTest(BasicSecurityUtil base) {
		this.base = base;
	}
	// GIVEN PUT METHOD
	@Given("I get a random user to update datas from")
	public void i_get_a_random_user_to_update_datas_from() {
		idRetrieved = MongoDBUtils.executeRandomSelect("TEST", "test", "users", "_id");
		System.out.println("\n\t***************************************\n");
		System.out.println("\tR A N D O M *** S E L E C T *** ID \n\t\n\t "+ idRetrieved);
		System.out.println("\n\t***************************************\n");
	}
	
	@Given("i call method delete")
	public void i_call_method_delete() {
		MongoDBUtils.executeDelete("TEST", "test", "users");
	}

	// S T R I N G S
	
	@Given("I have a first name")
	public void i_have_a_first_name() {
	    firstName = random.randomFirstName(); 
	}

	@Given("I have a last name")
	public void i_have_a_last_name() {
	    lastName = random.randomLastName();
	}

	@Given("I have a phone number")
	public void i_have_a_phone_number() {
	    phone = random.generateNumberPhoneRandomString();
	}

	//  N U	L L S 
	
	@Given("I have a phone number as null")
	public void i_have_a_phone_number_as_null() {
	    phone = null;
	}

	@Given("I have a last name as null")
	public void i_have_a_last_name_as_null() {
	    lastName = null;
	}

	@Given("I have a first name as null")
	public void i_have_a_first_name_as_null() {
	    firstName = null;
	}

	//GIVEN NUMERIC
	
	@Given("I have a phone number as numeric")
	public void i_have_a_phone_number_as_numeric() {
	    phoneInt = random.generateNumberPhoneRandomlong();
	}

	@Given("I have a last name as numeric")
	public void i_have_a_last_name_as_numeric() {
	    lastNameInt = random.generateNumberPhoneRandomlong();
	}

	@Given("I have a first name as numeric")
	public void i_have_a_first_name_as_numeric() {
	    firstNameInt = random.generateNumberPhoneRandomlong();
	}

	// S P E C I A L - C H A R A C T E R S
	@Given("I have a phone number as special characters")
	public void i_have_a_phone_number_as_special_characters() {
	    phone = random.randomSpecialCharacteres();
	}
	
	@Given("I have a last name as special characters")
	public void i_have_a_last_name_as_special_characters() {
	    lastName = random.randomSpecialCharacteres();
	}

	@Given("I have a first name as special characters")
	public void i_have_a_first_name_as_special_characters() {
	    firstName = random.randomSpecialCharacteres();
	}
	
	// O V E R - L E N G T H 
	@Given("I have a phone number as over length")
	public void i_have_a_phone_number_as_over_length() {
		phone = random.generateNumberPhoneRandomStringOL();
	}

	@Given("I have a last name as over length")
	public void i_have_a_last_name_as_over_length() {
		lastName = random.randomLastNameOL();
	}

	@Given("I have a first name as over length")
	public void i_have_a_first_name_as_over_length() {
		firstName = random.randomFirstNameOL();
	}
	
	// C A S E - S E N S I T I V E
	@Given("I have a last name as uppercase")
	public void i_have_a_last_name_as_uppercase() {
	    lastName = random.randomLastName().toUpperCase();
	}

	@Given("I have a first name as uppercase")
	public void i_have_a_first_name_as_uppercase() {
	    firstName = random.randomFirstName().toUpperCase();
	}

	// ---------- W H E N - S T E P S -------------
	
	@When("I send data by API using POST method")
	public void i_send_data_by_API_using_POST_method() {
	    JSONObject obj = new JSONObject();
	    obj.put("firstName", firstName);
	    obj.put("lastName", lastName);
	    obj.put("phone", phone);
	    base.requestBody = obj.toString();
	    //System.out.println("\n\tI sending " + obj + "\n");
	    
		base.apiResource = ApiPaths.MONGOCRUD;
		base.ServiceApi = new ApiTools();
	    base.response = base.ServiceApi.POSTMethod(base.apiResource,base.requestBody);
		base.responseBody = base.response.getBody();
		base.method = "POST";
		
		statusCodeRetrieved = base.response.getStatusCodeValue();
		if(statusCodeRetrieved == 201) {
			idRetrieved =  base.responseBody;
		}else {
			idRetrieved = null;
		}
		
		System.out.println("\n\tStatus code retrieved\t " + statusCodeRetrieved);
		//System.out.println("\n\tResponse Body \t" + base.responseBody + "\n");
		//System.out.println("\n\tID retrieved\t" + idRetrieved);
	}
	
	@When("I send data by API using POST method with numeric")
	public void i_send_data_by_API_using_POST_method_with_numeric() {;
	    JSONObject obj = new JSONObject();
	    if(firstName == null) {
	    	obj.put("firstName", firstNameInt);
	    }else {
	    	obj.put("firstName", firstName);
	    }
	    
	    if(lastName == null) {
	    	obj.put("lastName", lastNameInt);
	    }else {
	    	obj.put("lastName", lastName);
	    }
	    
	    if(phone == null) {
	    	obj.put("phone", phoneInt);
	    }else {
	    	obj.put("phone", phone);
	    }
	    
	    System.out.println("\n\tI sending " + obj + "\n");;

	    base.requestBody = obj.toString();
	    
		base.apiResource = ApiPaths.MONGOCRUD;
		base.ServiceApi = new ApiTools();
	    base.response = base.ServiceApi.POSTMethod(base.apiResource,base.requestBody);
		base.responseBody = base.response.getBody();
		base.method = "POST";
		
		statusCodeRetrieved = base.response.getStatusCodeValue();
		if(statusCodeRetrieved == 201) {
			idRetrieved =  base.responseBody;
		}else {
			idRetrieved = null;
		}
		
		System.out.println("\n\tStatus code response\t " + statusCodeRetrieved);
		//System.out.println("\n\tResponse Body \t" + base.responseBody + "\n");
		//System.out.println("\n\t Response body id " + idRetrieved);
	    
	}

	@When("I send data by API using PUT method")
	public void i_send_data_by_API_using_PUT_method() {
		JSONObject obj = new JSONObject();
		
	    obj.put("firstName",firstName);
	    obj.put("lastName",lastName);
	    obj.put("phone",phone);
	    
	    System.out.println("\n\tI sending " + obj + "\n");
	    base.requestBody = obj.toString();
	    		
		base.apiResource = ApiPaths.MONGOCRUD + "/" + idRetrieved;
		base.ServiceApi = new ApiTools();
	    base.response = base.ServiceApi.PUTMethod(base.apiResource,base.requestBody);
		base.responseBody = base.response.getBody();
		base.method = "PUT";
		
		statusCodeRetrieved = base.response.getStatusCodeValue();
		
		System.out.println("\n\tStatus code response\t " + statusCodeRetrieved);
		//System.out.println("\n\tResponse Body \t" + base.responseBody + "\n");
		
		//System.out.println("\n\t Response body id " + base.responseBody.substring(7, 31));
	}
	
	@When("I send data by API using PUT method with numeric")
	public void i_send_data_by_API_using_PUT_method_with_numeric() {
		JSONObject obj = new JSONObject();
	    if(firstName == null) {
	    	obj.put("firstName", firstNameInt);
	    }else {
	    	obj.put("firstName", firstName);
	    }
	    
	    if(lastName == null) {
	    	obj.put("lastName", lastNameInt);
	    }else {
	    	obj.put("lastName", lastName);
	    }
	    
	    if(phone == null) {
	    	obj.put("phone", phoneInt);
	    }else {
	    	obj.put("phone", phone);
	    }
	    
	    System.out.println("\n\tI sending " + obj + "\n");;

	    base.requestBody = obj.toString();
	    
	    base.apiResource = ApiPaths.MONGOCRUD + "/" + idRetrieved;
		base.ServiceApi = new ApiTools();
	    base.response = base.ServiceApi.PUTMethod(base.apiResource,base.requestBody);
		base.responseBody = base.response.getBody();
		base.method = "PUT";
		
		statusCodeRetrieved = base.response.getStatusCodeValue();
		
		System.out.println("\n\tStatus code response\t " + statusCodeRetrieved);
		//System.out.println("\n\tResponse Body \t" + base.responseBody + "\n");
		
		//System.out.println("\n\t Response body id " + base.responseBody.substring(7, 31));
		
	}

	
	
    //---------- T H E N -- S T E P S ------------
	
	
	@Then("I retrieve status code and it should be {int} OK")
	public void i_retrieve_status_code_and_it_should_be_OK(Integer int1) {
		statusCodeExpected = int1;
		//System.out.println("\n\tBoolean " + bool);
		if(statusCodeExpected == statusCodeRetrieved) {
			bool = true;
		}
		//System.out.println("\n\tBoolean after if " + bool);
	}
	
	@Then("I retrieve status code and it should be {int} CREATED")
	public void i_retrieve_status_code_and_it_should_be_CREATED(Integer int1) {
		statusCodeExpected = int1;
		//System.out.println("\n\tBoolean " + bool);
		if(statusCodeExpected == statusCodeRetrieved) {
			bool = true;
		}
		//System.out.println("\n\tBoolean after if " + bool);
	}
	
	@Then("I retrieve status code and it should be {int} bad request")
	public void i_retrieve_status_code_and_it_should_be_bad_request(Integer int1) {
		statusCodeExpected = int1;
		//System.out.println("\n\tBoolean " + bool);
		if(statusCodeExpected == statusCodeRetrieved) {
			bool = true;
		}
		//System.out.println("\n\tBoolean after if " + bool);
	}

	
	@Then("I compare response body with a mongodb query")
	public void i_compare_response_body_with_a_mongodb_query() {
		
		switch(statusCodeRetrieved) {
		case 200:
			boolRetrieved = MongoDBUtils.executeSelectByFields("TEST", "test", "users", idRetrieved, firstName, lastName, phone);
			//System.out.println("boolretrieven "+boolRetrieved +" \tbool "+bool);
			assert boolRetrieved != bool ;
			break;
		case 201:
			if(idRetrieved != null) {
				boolRetrieved = MongoDBUtils.executeSelectByFields("TEST", "test", "users", idRetrieved, firstName, lastName, phone);
			}else {
				boolRetrieved = MongoDBUtils.executeSelectByFields2("TEST", "test", "users", firstName, lastName, phone);
			}
			//System.out.println("boolretrieven "+boolRetrieved +" \tbool "+bool);
			assert boolRetrieved != bool ;
			break;
		case 400:
			if(idRetrieved != null) {
				boolRetrieved = MongoDBUtils.executeSelectByFields("TEST", "test", "users", idRetrieved, firstName, lastName, phone);
			}else {
				boolRetrieved = MongoDBUtils.executeSelectByFields2("TEST", "test", "users", firstName, lastName, phone);
			}
			//System.out.println("boolretrieven "+boolRetrieved +" \tbool "+bool);
			assert boolRetrieved == bool ;
			break;
		}
		
		//boolean boolRetrieved = MongoDBUtils.executeSelectByFields("TEST", "test", "users", firstName, lastName, phone);
		
		//assert bool == true: "Scenario fail";

		//System.out.println("MYquery *** S E L E C T by fields "+MongoDBUtils.executeDelete("TEST", "test", "users"));
		
		//to executeMyQuery need envioroment, bdname, collection, firstname, lastname and phone 
		//System.out.println("MYquery *** S E L E C T by fields "+MongoDBUtils.executeSelectByFields("TEST", "test", "users", firstName, lastName, phone));
		
		
	}
	
	@Then("I compare response body with a mongodb query as numeric")
	public void i_compare_response_body_with_a_mongodb_query_as_numeric() {
		firstName = String.valueOf(firstNameInt);
		lastName = String.valueOf(lastNameInt);
		phone = String.valueOf(phoneInt);
		switch(statusCodeRetrieved) {
		case 200:
			boolRetrieved = MongoDBUtils.executeSelectByFields("TEST", "test", "users", idRetrieved, firstName, lastName, phone);
			//System.out.println("boolretrieven "+boolRetrieved +" \tbool "+bool);
			assert boolRetrieved != bool ;
			break;
		case 201:
			if(idRetrieved != null) {
				boolRetrieved = MongoDBUtils.executeSelectByFields("TEST", "test", "users", idRetrieved, firstName, lastName, phone);
			}else {
				boolRetrieved = MongoDBUtils.executeSelectByFields2("TEST", "test", "users", firstName, lastName, phone);
			}
			//System.out.println("boolretrieven "+boolRetrieved +" \tbool "+bool);
			assert boolRetrieved != bool ;
			break;
		case 400:
			if(idRetrieved != null) {
				boolRetrieved = MongoDBUtils.executeSelectByFields("TEST", "test", "users", idRetrieved, firstName, lastName, phone);
			}else {
				boolRetrieved = MongoDBUtils.executeSelectByFields2("TEST", "test", "users", firstName, lastName, phone);
			}
			//System.out.println("boolretrieven "+boolRetrieved +" \tbool "+bool);
			assert boolRetrieved == bool ;
			break;
		}
	}


*/
	

}
package com.stepdefinitions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;

import com.globalClasses.ApiPaths;
import com.globalClasses.ApiTools;
import com.globalClasses.BasicSecurityUtil;
import com.globalClasses.MongoDBUtils;
import com.globalClasses.RandomTools;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Put {

	private BasicSecurityUtil base;
	String IDString, nameString, techString;
	String startDateString, endDateString;
	long  nameNumeric, techNumeric;
	
	int statusCodeExpected, statusCodeRetrieved;
	
	LocalDate startDate, endDate;
	
	boolean active = false;
	boolean isBacklog = false;
	String activeString, isBacklogString;
	byte activeByte, isBacklogByte;
	
	boolean boolCheck = false;
	boolean boolRetrieved = false;
	
	Date date = new Date();
	DateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
	RandomTools random = new RandomTools();
	
	public Put(BasicSecurityUtil base) {
		this.base = base;
	}
	
	// I D  - - V A  L U E S 
	@Given("I take a ramdom existing ID")
	public void i_take_a_ramdom_existing_ID() {
		IDString = MongoDBUtils.executeRandomSelect("TEST", "InternHome", "sprints", "_id");
		//IDString = "5e70ec06f5c3875b3c085c74";
	}
	
	@Given("I take a non existing ID")
	public void i_take_a_non_existing_ID() {
		IDString = MongoDBUtils.executeRandomSelect("TEST", "InternHome", "sprints", "_id");
		IDString = IDString.replaceAll("[0-5]", "7");
	}

	@Given("I take an ID as null")
	public void i_take_an_ID_as_null() {
		IDString = "";
	}
	
	//  N A M E  & T E C H N O L O G Y
	@Given("I have name as letters")
	public void i_have_name_as_letters() {
		nameString = random.randomPokemon()+" " + String.valueOf((int)(Math.random()*(100-1+1))+1);
	}

	@Given("I have technology as letters")
	public void i_have_technology_as_letters() {
		techString = random.randomHacker();
	}
	
	@Given("I have name as alphanumeric")
	public void i_have_name_as_alphanumeric() {
		nameString = random.randomPokemon() +" " + String.valueOf((int)(Math.random()*(10-1+1))+1);
	}

	@Given("I have technology as alphanumeric")
	public void i_have_technology_as_alphanumeric() {
		techString = random.randomHacker() + String.valueOf((int)(Math.random()*(10-1+1))+1);
	}
	
	@Given("I have name as numeric")
	public void i_have_name_as_numeric() {
		nameNumeric = random.generateNumberPhoneRandomlong();
	}

	@Given("I have technology as numeric")
	public void i_have_technology_as_numeric() {
		techNumeric = random.generateNumberPhoneRandomlong();
	}
	
	@Given("I have name as letters but over length")
	public void i_have_name_as_letters_but_over_length() {
		nameString = random.randomFirstNameOL();
	}

	@Given("I have technology as letters but over length")
	public void i_have_technology_as_letters_but_over_length() {
		techString = random.randomFirstNameOL();
	}

	@Given("I have name as special chars")
	public void i_have_name_as_special_chars() {
		nameString = random.randomSpecialCharacteres();;
	}

	@Given("I have technology as special chars")
	public void i_have_technology_as_special_chars() {
		techString = random.randomSpecialCharacteres();
	}
	
	@Given("I have name as capital letters")
	public void i_have_name_as_capital_letters() {
		nameString = random.randomPokemon().toUpperCase();
	}

	@Given("I have technology as capital letters")
	public void i_have_technology_as_capital_letters() {
		techString = random.randomHacker().toUpperCase();
	}

	@Given("I have name as null")
	public void i_have_name_as_null() {
	    nameString = null;
	}

	@Given("I have technology as null")
	public void i_have_technology_as_null() {
	    techString = null;
	}

	
	//  B O O L E A N - - V A  L U E S
	@Given("I have active as bool true")
	public void i_have_active_as_bool_true() {
		active = true;
	}

	@Given("I have is backlog as bool true")
	public void i_have_is_backlog_as_bool_true() {
		isBacklog = true;
	}
	
	@Given("I have active as bool false")
	public void i_have_active_as_bool_false() {
		active = false;
	}

	@Given("I have is backlog as bool false")
	public void i_have_is_backlog_as_bool_false() {
		isBacklog = false;
	}
	
	@Given("I have active as capital letters")
	public void i_have_active_as_capital_letters() {
		activeString = "FALSE";
		System.out.println(activeString);
	}

	@Given("I have is backlog as capital letters")
	public void i_have_is_backlog_as_capital_letters() {
		isBacklogString = "FALSE";
		System.out.println(isBacklogString);
	}
	
	@Given("I have active as letters")
	public void i_have_active_as_letters() {
		activeString = "false";
		System.out.println(activeString);
	}

	@Given("I have is backlog as letters")
	public void i_have_is_backlog_as_letters() {
		isBacklogString = "false";
		System.out.println(isBacklogString);
	}
	
	@Given("I have active as numeric")
	public void i_have_active_as_numeric() {
		activeByte = 0;
		System.out.println(activeByte);
	}

	@Given("I have is backlog as numeric")
	public void i_have_is_backlog_as_numeric() {
		isBacklogByte = 0;
		System.out.println(isBacklogByte);
	}

	@Given("I have active as null")
	public void i_have_active_as_null() {
		activeString = null;
	}

	@Given("I have is backlog as null")
	public void i_have_is_backlog_as_null() {
		isBacklogString = null;
	}

	
	// D A T E - - V A L U E S
	
	@Given("I have start date as current date")
	public void i_have_start_date_as_current_date() {
	    startDate = LocalDate.now();
	    
	}
	
	@Given("I have end date as current date")
	public void i_have_end_date_as_current_date() {
		 endDate = LocalDate.now();
		
	}

	@Given("I have start date as future date")
	public void i_have_start_date_as_future_date() {
		startDate = LocalDate.now().plusDays(random.randomDays());
	    
	}

	@Given("I have end date as future date")
	public void i_have_end_date_as_future_date() {
	    endDate = LocalDate.now().plusDays(random.randomDays());
	    
	}
	
	@Given("I have start date as null")
	public void i_have_start_date_as_null() {
		startDate = null;
	   
	}

	@Given("I have end date as null")
	public void i_have_end_date_as_null() {
		endDate = null;
	    
	}
	
	@Given("I have start date as past date")
	public void i_have_start_date_as_past_date() {
		startDate = LocalDate.now().minusDays(random.randomDays());
	    
	}
	
	@Given("I have end date as past date")
	public void i_have_end_date_as_past_date() {
		endDate = LocalDate.now().minusDays(random.randomDays());
	   
	}
	
	@Given("I have end date as distant future date")
	public void i_have_end_date_as_distant_future_date() {
		endDate = LocalDate.now().plusDays(365);
	  
	}
	
	@Given("I have start date as different format")
	public void i_have_start_date_as_different_format() {
		startDateString = dateformat.format(date);
	    
	}

	@Given("I have end date as different format")
	public void i_have_end_date_as_different_format() {
		endDateString = dateformat.format(date);
	   
	}

	
	// W H E N  - - S T E P S

	@When("I send PUT request to API")
	public void i_send_PUT_request_to_API() {
		JSONObject obj = new JSONObject();		
		if(nameString == null) {
			obj.put("name", nameNumeric);
			System.out.println("string null");
		}else {
			obj.put("name", nameString);
		}
		if(techString == null) {
			obj.put("technology", techNumeric );
		}else {
			obj.put("technology", techString );
		}
		obj.put("active", active );
		obj.put("is_backlog", isBacklog );
		obj.put("start_date", startDate );
		obj.put("end_date", endDate);
		System.out.println("\n\tI sending " + obj + "\n");
		base.requestBody = obj.toString();
		
		base.apiResource = ApiPaths.MONGOCRUD + "/" + IDString;
		base.ServiceApi = new ApiTools();
	    base.response = base.ServiceApi.PUTMethod(base.apiResource,base.requestBody);
		base.responseBody = base.response.getBody();
		base.method = "PUT";		
		statusCodeRetrieved = base.response.getStatusCodeValue();		
		System.out.println("---------------response body "+base.responseBody);
		System.out.println("\n\tStatus code response\t " + statusCodeRetrieved);
	}
	
	@When("I send PUT request to API bool")
	public void i_send_PUT_request_to_API_bool() {
		JSONObject obj = new JSONObject();
		obj.put("name", nameString);
		obj.put("technology", techString );
		if(active == true) {
			obj.put("active", active );
		}else {
			obj.put("active", activeString );
		}
		if(isBacklog == true) {
			obj.put("is_backlog", isBacklog );
		}else {
			obj.put("is_backlog", isBacklogString );
		}
		obj.put("start_date", startDate );
		obj.put("end_date", endDate);
		
		 System.out.println("\n\tI sending " + obj + "\n");
		base.requestBody = obj.toString();
		
		base.apiResource = ApiPaths.MONGOCRUD + "/" + IDString;
		base.ServiceApi = new ApiTools();
	    base.response = base.ServiceApi.PUTMethod(base.apiResource,base.requestBody);
		base.responseBody = base.response.getBody();
		base.method = "PUT";
		System.out.println("---------------response body "+base.responseBody);
		statusCodeRetrieved = base.response.getStatusCodeValue();
		
		System.out.println("\n\tStatus code response\t " + statusCodeRetrieved);


	}

	@When("I send PUT request to API null")
	public void i_send_PUT_request_to_API_null() {
		JSONObject obj = new JSONObject();
		obj.put("name", nameString);
		obj.put("technology", techString );
		if(active == true ) {
			obj.put("active", active );
		}
		if(isBacklog == true) {
			obj.put("is_backlog", isBacklog );
		}
		obj.put("start_date", startDate );
		obj.put("end_date", endDate);
		
		 System.out.println("\n\tI sending " + obj + "\n");
		base.requestBody = obj.toString();
		
		base.apiResource = ApiPaths.MONGOCRUD + "/" + IDString;
		base.ServiceApi = new ApiTools();
	    base.response = base.ServiceApi.PUTMethod(base.apiResource,base.requestBody);
		base.responseBody = base.response.getBody();
		base.method = "PUT";
		System.out.println("---------------"+base.responseBody);
		statusCodeRetrieved = base.response.getStatusCodeValue();
		
		System.out.println("---------------response body "+base.responseBody);
		System.out.println("\n\tStatus code response\t " + statusCodeRetrieved);
	}

	@When("I send PUT request to API date")
	public void i_send_PUT_request_to_API_date() {
		JSONObject obj = new JSONObject();
		obj.put("name", nameString);
		obj.put("technology", techString );
		obj.put("active", active );
		obj.put("is_backlog", isBacklog );
		if(startDate == null) {
			obj.put("start_date", startDateString );
		}else {
			obj.put("start_date", startDate );
		}
		if(endDate == null) {
			obj.put("end_date", endDateString );
		}else {
			obj.put("end_date", endDate);
		}
		
		 System.out.println("\n\tI sending " + obj + "\n");
		base.requestBody = obj.toString();
		
		base.apiResource = ApiPaths.MONGOCRUD + "/" + IDString;
		base.ServiceApi = new ApiTools();
	    base.response = base.ServiceApi.PUTMethod(base.apiResource,base.requestBody);
		base.responseBody = base.response.getBody();
		base.method = "PUT";
		System.out.println("---------------"+base.responseBody);
		statusCodeRetrieved = base.response.getStatusCodeValue();
		
		System.out.println("---------------response body "+base.responseBody);
		System.out.println("\n\tStatus code response\t " + statusCodeRetrieved);
	}

	
	
	// T H E N - - S T E P S 

	@Then("I retrieve status code and it should be {int} OK")
	public void i_retrieve_status_code_and_it_should_be_OK(Integer statusCode) {
		statusCodeExpected = statusCode;
		if(statusCodeExpected == statusCodeRetrieved) {
			boolCheck = true;
		}
	}
	
	@Then("I retrieve status code and it should be {int} Not found")
	public void i_retrieve_status_code_and_it_should_be_Not_found(Integer statusCode) {
		statusCodeExpected = statusCode;
		if(statusCodeExpected == statusCodeRetrieved) {
			boolCheck = true;
		}
	}
	
	@Then("I retrieve status code and it should be {int} Bad request")
	public void i_retrieve_status_code_and_it_should_be_Bad_request(Integer statusCode) {
		statusCodeExpected = statusCode;
		if(statusCodeExpected == statusCodeRetrieved) {
			boolCheck = true;
		}
	}

	@Then("I retrieve status code and it should be {int} Not allowed")
	public void i_retrieve_status_code_and_it_should_be_Not_allowed(Integer statusCode) {
		statusCodeExpected = statusCode;
		if(statusCodeExpected == statusCodeRetrieved) {
			boolCheck = true;
		}
	}


	@Then("I validate reponse with MongoDB")
	public void i_validate_reponse_with_MongoDB() {
		if(techNumeric != 0) {
			techString = String.valueOf(techNumeric);
		}
		if(nameNumeric != 0) {
			nameString = String.valueOf(nameNumeric);
		}
		switch(statusCodeRetrieved) {
		case 202:
			boolRetrieved = MongoDBUtils.executeSelectByFields("TEST", "InternHome", "sprints", IDString, nameString, techString, active, isBacklog, startDate, endDate);
			System.out.println("boolretrieve "+boolRetrieved +" \tboolCheck "+boolCheck);
			assert boolRetrieved == boolCheck ;
			break;
		case 400:
			boolRetrieved = MongoDBUtils.compareNulls("TEST", "InternHome", "sprints", IDString, nameString, techString, active, isBacklog, startDate, endDate);
			System.out.println("boolretrieve "+boolRetrieved +" \tboolCheck "+boolCheck);
			assert boolRetrieved != boolCheck ;
			break;
		case 404: 
			boolRetrieved = MongoDBUtils.executeSelectByFields("TEST", "InternHome", "sprints", IDString, nameString, techString, active, isBacklog, startDate, endDate);
			System.out.println("boolretrieve "+boolRetrieved +" \tboolCheck "+boolCheck);
			assert boolRetrieved != boolCheck ;
			break;
		case 405:
			boolRetrieved = MongoDBUtils.executeSelectByFields2("TEST", "InternHome", "sprints", nameString, techString, active, isBacklog, startDate, endDate);
			System.out.println("boolretrieve "+boolRetrieved +" \tboolCheck "+boolCheck);
			assert boolRetrieved != boolCheck ;
			break;
		}

	}
	
	@Then("I validate reponse with MongoDB with end date as null")
	public void i_validate_reponse_with_MongoDB_with_end_date_as_null() {
		switch(statusCodeRetrieved) {
		case 202:
			boolRetrieved = MongoDBUtils.executeSelectENull("TEST", "InternHome", "sprints", IDString, nameString, techString, active, isBacklog, startDate, endDate);
			System.out.println("boolretrieve 444 "+boolRetrieved +" \tboolCheck "+boolCheck);
			assert boolRetrieved == boolCheck ;
			break;
		case 400:
			boolRetrieved = MongoDBUtils.executeSelectENull("TEST", "InternHome", "sprints", IDString, nameString, techString, active, isBacklog, startDate, endDate);
			System.out.println("boolretrieve "+boolRetrieved +" \tboolCheck "+boolCheck);
			assert boolRetrieved != boolCheck ;
			break;
		}

	}

	@Then("I validate reponse with MongoDB bool")
	public void i_validate_reponse_with_MongoDB_bool() {
		if(activeString != null) {
			active = Boolean.parseBoolean(activeString); 
		}
		if(isBacklogString != null) {
			isBacklog = Boolean.parseBoolean(isBacklogString); 
		}
		switch(statusCodeRetrieved) {
		case 202:
			boolRetrieved = MongoDBUtils.executeSelectByFields("TEST", "InternHome", "sprints", IDString, nameString, techString, active, isBacklog, startDate, endDate);
			System.out.println("boolretrieve "+boolRetrieved +" \tboolCheck "+boolCheck);
			assert boolRetrieved == boolCheck ;
			break;
		case 400:
			boolRetrieved = MongoDBUtils.compareNulls("TEST", "InternHome", "sprints", IDString, nameString, techString, active, isBacklog, startDate, endDate);
			System.out.println("boolretrieve "+boolRetrieved +" \tboolCheck "+boolCheck);
			assert boolRetrieved != boolCheck ;
			break;
		case 404: 
			boolRetrieved = MongoDBUtils.executeSelectByFields("TEST", "InternHome", "sprints", IDString, nameString, techString, active, isBacklog, startDate, endDate);
			System.out.println("boolretrieve "+boolRetrieved +" \tboolCheck "+boolCheck);
			assert boolRetrieved != boolCheck ;
			break;
		case 405:
			boolRetrieved = MongoDBUtils.executeSelectByFields2("TEST", "InternHome", "sprints", nameString, techString, active, isBacklog, startDate, endDate);
			System.out.println("boolretrieve "+boolRetrieved +" \tboolCheck "+boolCheck);
			assert boolRetrieved != boolCheck ;
			break;
		}
	}

}
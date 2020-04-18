package com.stepdefinitions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

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

public class PutMetrics {

	private BasicSecurityUtil base;
	private globalVariables variable;
	
	public PutMetrics(BasicSecurityUtil base,  globalVariables variable) {
		this.base = base;
		this.variable = variable;
	}
	
	
	RandomTools random = new RandomTools();
	MyTools myTools = new MyTools();
	
	/*
	Date date2 = new Date();  
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
    String strDate;
	

*/
	
	
	//  E V A L U A T O R
	
	@Given("I have an existing evaluator")
	public void i_have_an_existing_evaluator() {
	    //variable.evaluatorID = MongoDBUtils.executeRandomSelect("TEST", "InternHome", "users", "_id");
	    
	    variable.evaluatorID = "5e95c4341051380d88aee06d";
	    variable.object.put("evaluator_id", variable.evaluatorID);
	}
	
	//  E V A L U A T E D

	@Given("I have an existing evaluated")
	public void i_have_an_existing_evaluated() {
	    //variable.evaluatedID =  MongoDBUtils.executeRandomSelect("TEST", "InternHome", "users", "_id");
		
		/*
		if( variable.evaluatorID !=null ) {
			do {
				variable.evaluatedID =  MongoDBUtils.executeRandomSelect("TEST", "InternHome", "users", "_id");
			}while(variable.evaluatorID.equals(variable.evaluatedID));
		}else {
			variable.evaluatedID =  MongoDBUtils.executeRandomSelect("TEST", "InternHome", "users", "_id");
		}
		*/
		
		variable.evaluatedID = "5e976d9aa0755e0b34d43aeb";
		variable.object.put("evaluated_id", variable.evaluatedID);
	}
	
	@Given("I have an evaluated equals evaluator")
	public void i_have_an_evaluated_equals_evaluator() {
		variable.object.put("evaluated_id", variable.evaluatorID);
	}

	// S P R I N 
		@Given("I have an existing sprint")
		public void i_have_an_existing_sprint() {
		    //variable.sprintID = MongoDBUtils.executeRandomSelect("TEST", "InternHome", "sprints", "_id");
			variable.sprintID = "5e8ede5edfc3ca01e1b1cd92";
			variable.object.put("sprint_id", variable.sprintID);
			
		}

	// I D  - F A K E S
	
	@Given("I have a non exist {string}")
	public void i_have_a_non_exist(String field) {
		variable.object.put(field, "5e9486cbe5303d599f55f833");
	}
	
	@Given("I have an {string} as letters")
	public void i_have_an_as_letters(String field) {
		variable.object.put(field, random.idLetters());
	}

	@Given("I have an {string} as numeric")
	public void i_have_an_as_numeric(String field) {
		variable.object.put(field, random.idNumber());
	}

	@Given("I have an {string} as over length")
	public void i_have_an_as_over_length(String field) {
		variable.object.put(field, "5e95c4341051380d88aee06d5e95c4341051380d88aee06d");
	}
	
	@Given("I have an {string} as null")
	public void i_have_an_as_null(String field) {
		String str = null;
		variable.object.put(field, str );
	}
	
	@Given("I have an {string} as empty")
	public void i_have_an_as_empty(String field) {
		variable.object.put(field, "" );
	}


	
	// T Y P E
	@Given("I have type as string")
	public void i_have_type_as_string() {
		variable.type = random.randomPokemon() +  " " + random.randomFirstName() ;
		variable.object.put("type", variable.type );
	}
	
	@Given("I have type as numeric")
	public void i_have_type_as_numeric() {
		
		variable.object.put("type", random.generateNumberPhoneRandomString() );
	}

	@Given("I have type as alphanumeric")
	public void i_have_type_as_alphanumeric() {
		variable.type = random.alphanumeric();
		variable.object.put("type", variable.type );
	}

	@Given("I have type as over length")
	public void i_have_type_as_over_length() {
		variable.object.put("type", random.randomFirstNameOL() );
	}

	@Given("I have type as special chars")
	public void i_have_type_as_special_chars() {
		variable.type = random.randomSpecialCharacteres();
		variable.object.put("type", variable.type );
	}

	@Given("I have type as capital letters")
	public void i_have_type_as_capital_letters() {
		variable.type = random.randomPokemon() +  " " + random.randomFirstName() ;
		variable.object.put("type", variable.type.toUpperCase() );
	}
	
	@Given("I have type as null")
	public void i_have_type_as_null() {
		String str = null;
		variable.object.put("type", str );
	}

	@Given("I have type as empty")
	public void i_have_type_as_empty() {
		variable.object.put("type", "" );
	}


	// D A T E

	@Given("I have a date as current date")
	public void i_have_a_date_as_current_date() {
		variable.date = LocalDate.now();
		variable.object.put("date", variable.date );
	}
	
	@Given("I have a date as past date")
	public void i_have_a_date_as_past_date() {
		variable.date = LocalDate.now().minusDays((int)(Math.random()*(350-30+1)+30));
		variable.object.put("date", variable.date );
	}

	@Given("I have a date as future date")
	public void i_have_a_date_as_future_date() {
		variable.date = LocalDate.now().plusDays((int)(Math.random()*(350-30+1)+30));
		variable.object.put("date", variable.date );
	}
	
	@Given("I have a date as null")
	public void i_have_a_date_as_null() {
		variable.date = null;
		variable.object.put("date", variable.date );
	}

	@Given("I have a date as empty")
	public void i_have_a_date_as_empty() {
		variable.date = null;
		variable.object.put("date", "" );
	}
	
	@Given("I have a date as different format")
	public void i_have_a_date_as_different_format() {
		variable.object.put("date", "01-01-2020" );
	}

	
	// B O O L E  A N S 
	@Given("I have a Boolean fields as false")
	public void i_have_a_Boolean_fields_as_false() {
	    variable.metrics.put("attendance", variable.attendance);
	    variable.metrics.put("carried_over", variable.carried_over);
	    
	    variable.blockers.put("blocked", variable.blocked);
	    
	    variable.proactive.put("looked_for_help", variable.looked);
	    variable.proactive.put("provided_help", variable.provided);
	    variable.proactive.put("worked_ahead", variable.worked);
	    variable.proactive.put("shared_resources", variable.shared);
	    
	    variable.retroactive.put("delayed_looking_help", variable.delayed);
	}
	
	@Given("{string} {string} as uppercase")
	public void as_uppercase(String field, String field2) {
		switch(field) {
		case "metrics":
			System.out.println("aqui estoy");
			variable.metrics.put(field2, "FALSE");
			break;
		case "blockers":
			variable.blockers.put(field2, "FALSE");
			break;
		case "proactive":
			variable.proactive.put(field2, "FALSE");
			break;
		case "retroactive":
			variable.retroactive.put(field2, "FALSE");
		}
	}
	

	// C O M M E N T S
	@Given("I have a comment fields")
	public void i_have_a_comment_fields() {
	    variable.blockers_comments = random.randomPokemon() + " " + random.randomHacker();
	    variable.blockers.put("comments", variable.blockers_comments);
	    
	    variable.retroactive_comments = random.randomPokemon() + " " + random.randomHacker();
	    variable.retroactive.put("comments", variable.retroactive_comments);
	}
	
	@Given("I have a blockers comments as numeric")
	public void i_have_a_blockers_comments_as_numeric() {
		variable.blockers_comments = random.commentsNumeric();
	    variable.blockers.put("comments", variable.blockers_comments);
	}

	@Given("I have a blockers comments as alphanumeric")
	public void i_have_a_blockers_comments_as_alphanumeric() {
		variable.blockers_comments = random.alphanumeric();
	    variable.blockers.put("comments", variable.blockers_comments);
	}

	@Given("I have a blockers comments as over length")
	public void i_have_a_blockers_comments_as_over_length() {
		variable.blockers_comments = random.randomFirstNameOL();
	    variable.blockers.put("comments", variable.blockers_comments);
	}

	@Given("I have a blockers comments as special chars")
	public void i_have_a_blockers_comments_as_special_chars() {
		variable.blockers_comments = random.randomSpecialCharacteres();
	    variable.blockers.put("comments", variable.blockers_comments);
	}

	@Given("I have a blockers comments as capital letters")
	public void i_have_a_blockers_comments_as_capital_letters() {
		variable.blockers_comments = random.randomPokemon() + " " + random.randomHacker();
	    variable.blockers.put("comments", variable.blockers_comments.toUpperCase());
	}
	
	@Given("I have a retroactive comments as numeric")
	public void i_have_a_retroactive_comments_as_numeric() {
	    variable.retroactive_comments = random.commentsNumeric();
	    variable.retroactive.put("comments", variable.retroactive_comments);
	}

	@Given("I have a retroactive comments as alphanumeric")
	public void i_have_a_retroactive_comments_as_alphanumeric() {
		variable.retroactive_comments = random.alphanumeric();
	    variable.retroactive.put("comments", variable.retroactive_comments);
	}

	@Given("I have a retroactive comments as over length")
	public void i_have_a_retroactive_comments_as_over_length() {
		variable.retroactive_comments = random.randomFirstNameOL();
	    variable.retroactive.put("comments", variable.retroactive_comments);
	}

	@Given("I have a retroactive comments as special chars")
	public void i_have_a_retroactive_comments_as_special_chars() {
		variable.retroactive_comments = random.randomSpecialCharacteres();
	    variable.retroactive.put("comments", variable.retroactive_comments);
	}

	@Given("I have a retroactive comments as capital letters")
	public void i_have_a_retroactive_comments_as_capital_letters() {
		variable.retroactive_comments = random.randomPokemon() + " " + random.randomHacker();
	    variable.retroactive.put("comments", variable.retroactive_comments.toUpperCase());
	}

	@Given("{string} {string} as null")
	public void as_null(String field, String field2) {
		String str = null;
		switch(field) {
		case "metrics":
			variable.metrics.put(field2, str);
			break;
		case "blockers":
			if(field2.contentEquals("comments")) {
				variable.blockers_comments = null;
			}
			variable.blockers.put(field2, str);
			break;
		case "proactive":
			variable.proactive.put(field2, str);
			break;
		case "retroactive":
			if(field2.contentEquals("comments")) {
				variable.retroactive_comments = null;
			}
			variable.retroactive.put(field2, str);
		}
	}
	
	@Given("{string} {string} as empty")
	public void as_empty(String field, String field2) {
		switch(field) {
		case "metrics":
			variable.metrics.put(field2, "");
			break;
		case "blockers":
			variable.blockers.put(field2, "");
			break;
		case "proactive":
			variable.proactive.put(field2, "");
			break;
		case "retroactive":
			variable.retroactive.put(field2, "");
		}
	}
	
	@When("I update metric using PUT operatation")
	public void i_update_metric_using_PUT_operatation() {
		variable.metrics.put("blockers", variable.blockers);
		variable.metrics.put("proactive", variable.proactive);
		variable.metrics.put("retroactive", variable.retroactive);
		variable.object.put("metrics", variable.metrics);
		
		base.requestBody = variable.object.toString();
		System.out.println("Request body : "+  variable.object.toString());

		base.apiResource = ApiPaths.METRICS + variable.metricID ;
		base.ServiceApi = new ApiTools();
	    base.response = base.ServiceApi.PUTMethod(base.apiResource,base.requestBody);
		base.responseBody = base.response.getBody();
		base.method = "PUT";		
		
		myTools.resource(ApiPaths.METRICS  + variable.metricID );
        myTools.statusCode(String.valueOf(base.response.getStatusCodeValue()));
        myTools.responseBody(base.responseBody);
        
        
		System.out.println("---------------response body "+base.responseBody);
		System.out.println("\n\tStatus code response\t " + base.response.getStatusCodeValue());
	}
	
	
	@Then("I validate update with mongoDB")
	public void i_validate_update_with_mongoDB() {
		
		
		switch(base.response.getStatusCodeValue()) {
		case 200:
			if ( variable.date == null) {
				variable.object.put("date", LocalDate.now() );
			}
			if(variable.blockers_comments == null) {
				variable.blockers.put("comments", "");
				variable.metrics.put("blockers", variable.blockers);
				variable.object.put("metrics", variable.metrics);
			}
			if(variable.retroactive_comments == null) {
				variable.retroactive.put("comments", "");
				variable.metrics.put("retroactive", variable.retroactive);
				variable.object.put("metrics", variable.metrics);
			}
			
			assert MongoDBUtils.compareHP("TEST", "InternHome", "metrics", variable.metricID, variable.object) == true ;
			break;
		case 400:
			System.out.println("to work");
			break;
		case 404:
			System.out.println("to work");
			break;
		}
	}




}
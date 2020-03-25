package com.stepdefinitions;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.json.JSONObject;

import com.globalClasses.ApiPaths;
import com.globalClasses.ApiTools;
import com.globalClasses.BasicSecurityUtil;
import com.globalClasses.MongoDBUtils;
import com.globalClasses.RandomTools;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PutMetrics {
	/*
	private BasicSecurityUtil base;
	
	JSONObject obj = new JSONObject();		
	JSONObject metrics = new JSONObject();
	JSONObject blockers = new JSONObject();
	JSONObject proactive = new JSONObject();
	JSONObject retroactive = new JSONObject();
	
	
	String IDString, evaluatorIDString, evaluatedIDString, sprintIDString;
	String typeString, BcommentsString, RcommentsString;
	String bool;
	LocalDate date;
	
	Date date2 = new Date();  
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
    String strDate;
	
	long IDNumeric;
	long typeNumeric, commentsNumeric;
	
	int statusCodeExpected, statusCodeRetrieved;
	int boolNumeric;
	
	boolean attendance, blocked, looked, provided, worked, shared, carried, delay = false;
	
	byte activeByte, isBacklogByte;
	
	boolean boolCheck = false;
	boolean boolRetrieved = false;

	RandomTools random = new RandomTools();
	
	public PutMetrics(BasicSecurityUtil base) {
		this.base = base;
	}
	
	// i d m a n a g m e n t
	@Given("I take a ramdom existing ID")
	public void i_take_a_ramdom_existing_ID() {
	    IDString = MongoDBUtils.executeRandomSelect("TEST", "InternHome", "metrics", "_id");
	    //IDString = "5e713b69f892f82be93cb405";
	    System.out.println(IDString);
	}

	@Given("I take a non exist ID")
	public void i_take_a_non_exist_ID() {
		IDString = MongoDBUtils.executeRandomSelect("TEST", "InternHome", "metrics", "_id");
		//IDString = "5e7132b3413b952b9d13196d";
		IDString = IDString.replaceAll("[0-5]", "7");
		System.out.println(IDString);
	}

	@Given("I take an ID as letters")
	public void i_take_an_ID_as_letters() {
		IDString = random.randomFirstName();
		System.out.println(IDString);
	}
	
	@Given("I take an ID as over length")
	public void i_take_an_ID_as_over_length() {
		IDString = random.randomFirstNameOL();
		System.out.println(IDString);
	}
	
	@Given("I take an ID as numeric")
	public void i_take_an_ID_as_numeric() {
	    IDNumeric = random.generateNumeric();
	    System.out.println(IDNumeric);
	}
	
	@Given("I take an ID as special chars")
	public void i_take_an_ID_as_special_chars() {
		IDString = random.randomSpecialCharacteres();
		System.out.println(IDString);
	}
	
	@Given("I take a ID as null")
	public void i_take_a_ID_as_null() {
		IDString = null;
	}


	// E V A L U A T O R I D
	@Given("I have an existing evaluator_id")
	public void i_have_an_existing_evaluator_id() {
		evaluatorIDString = MongoDBUtils.executeRandomSelect("TEST", "InternHome", "users", "_id");
		//evaluatorIDString = "5e792a55210a700ee41d480e";
		System.out.println(evaluatorIDString);
	}
	
	@Given("I have a non exist evaluator_id")
	public void i_have_a_non_exist_evaluator_id() {
		evaluatorIDString = MongoDBUtils.executeRandomSelect("TEST", "InternHome", "users", "_id");
		evaluatorIDString = evaluatorIDString.replaceAll("[0-5]", "7");
	}
	
	@Given("I have an evaluator_id as letters")
	public void i_have_an_evaluator_id_as_letters() {
		evaluatorIDString = random.randomFirstName();
	}

	@Given("I have an evaluator_id as numeric")
	public void i_have_an_evaluator_id_as_numeric() {
		evaluatorIDString = random.generateNumberPhoneRandomString();
	}

	@Given("I have an evaluator_id as over length")
	public void i_have_an_evaluator_id_as_over_length() {
		evaluatorIDString = random.randomFirstNameOL();
	}

	@Given("I have an evaluator_id as special chars")
	public void i_have_an_evaluator_id_as_special_chars() {
		evaluatorIDString = random.randomSpecialCharacteres();
	}

	@Given("I have an evaluator_id as null")
	public void i_have_an_evaluator_id_as_null() {
		evaluatorIDString = null;
	}

	// E V A L U A T E D I D
	@Given("I have an existing evaluated_id")
	public void i_have_an_existing_evaluated_id() {
		evaluatedIDString =  MongoDBUtils.executeRandomSelect("TEST", "InternHome", "users", "_id");
		//evaluatedIDString = "5e792a5e210a700ee41d4824";
		System.out.println(evaluatedIDString);
	}
	
	@Given("I have an non exist evaluated_id")
	public void i_have_an_non_exist_evaluated_id() {
		evaluatedIDString =  MongoDBUtils.executeRandomSelect("TEST", "InternHome", "users", "_id");
		evaluatedIDString = evaluatedIDString.replaceAll("[0-5]", "7");
		//System.out.println(evaluatedIDString);
	}

	@Given("I have an evaluated_id as letters")
	public void i_have_an_evaluated_id_as_letters() {
		evaluatedIDString = random.randomFirstName();
		System.out.println(evaluatedIDString);
	}

	@Given("I have an evaluated_id as numeric")
	public void i_have_an_evaluated_id_as_numeric() {
		evaluatedIDString = random.generateNumberPhoneRandomString();
		System.out.println(evaluatedIDString);
	}

	@Given("I have an evaluated_id as over length")
	public void i_have_an_evaluated_id_as_over_length() {
		evaluatedIDString = random.randomFirstNameOL();
		System.out.println(evaluatedIDString);
	}

	@Given("I have an evaluated_id as special chars")
	public void i_have_an_evaluated_id_as_special_chars() {
		evaluatedIDString = random.randomSpecialCharacteres();
		System.out.println(evaluatedIDString);
	}
	
	@Given("I have an evaluated_id as null")
	public void i_have_an_evaluated_id_as_null() {
		evaluatedIDString = null;
	}
	
	@Given("I have an existing evaluated_id equals evaluator_id")
	public void i_have_an_existing_evaluated_id_equals_evaluator_id() {
		evaluatedIDString = evaluatorIDString;
		System.out.println(evaluatedIDString);
	}

	//  S P R I N T S I D 
	@Given("I have a non exist sprint_id")
	public void i_have_a_non_exist_sprint_id() {
		sprintIDString = MongoDBUtils.executeRandomSelect("TEST", "InternHome", "sprints", "_id");
		sprintIDString = sprintIDString.replaceAll("[0-5]", "7");
		System.out.println(sprintIDString);
	}

	@Given("I have a sprint_id as letters")
	public void i_have_a_sprint_id_as_letters() {
		sprintIDString = random.randomFirstName();
	}

	@Given("I have a sprint_id as numeric")
	public void i_have_a_sprint_id_as_numeric() {
		sprintIDString = random.generateNumberPhoneRandomString();
	}

	@Given("I have a sprint_id as over length")
	public void i_have_a_sprint_id_as_over_length() {
		sprintIDString = random.randomFirstNameOL();
	}

	@Given("I have a sprint_id as special chars")
	public void i_have_a_sprint_id_as_special_chars() {
		sprintIDString = random.randomSpecialCharacteres();
	}

	@Given("I have an existing sprint_id")
	public void i_have_an_existing_sprint_id() {
		//sprintIDString = MongoDBUtils.executeRandomSelect("TEST", "InternHome", "sprints", "_id");
		sprintIDString = "5e78f5e792675632e42d1a96";
		System.out.println(sprintIDString);
	}
	
	@Given("I have an sprint_id as null")
	public void i_have_an_sprint_id_as_null() {
		sprintIDString = null;
	}
	//  S T R I N G  - F I E L D S
	
	@Given("I have type as null")
	public void i_have_type_as_null() {
		typeString = null;
	}

	@Given("I have type as string")
	public void i_have_type_as_string() {
		typeString = "This is a Type";
	}

	@Given("I have blockers comments as string")
	public void i_have_blockers_comments_as_string() {
		BcommentsString ="This a comment as String for blockers";
	}

	@Given("I have retroactive comments as string")
	public void i_have_retroactive_comments_as_string() {
		RcommentsString ="This a comment as String for retroactive ";
	}

	@Given("I have type as letters")
	public void i_have_type_as_letters() {
		typeString = random.randomFirstName();
	}

	@Given("I have blockers comments as letters")
	public void i_have_blockers_comments_as_letters() {
		BcommentsString = random.randomFirstName();
	}

	@Given("I have retroactive comments as letters")
	public void i_have_retroactive_comments_as_letters() {
		RcommentsString = random.randomFirstName();
	}
	
	@Given("I have type as numeric")
	public void i_have_type_as_numeric() {
		typeString = random.generateNumberPhoneRandomString();
	}

	@Given("I have blockers comments as numeric")
	public void i_have_blockers_comments_as_numeric() {
		BcommentsString = random.generateNumberPhoneRandomString();
	}

	@Given("I have retroactive comments as numeric")
	public void i_have_retroactive_comments_as_numeric() {
		RcommentsString = random.generateNumberPhoneRandomString();
	}
	
	@Given("I have type as over length")
	public void i_have_type_as_over_length() {
		typeString = random.randomFirstNameOL();
	}

	@Given("I have blockers comments as over length")
	public void i_have_blockers_comments_as_over_length() {
		BcommentsString = random.randomFirstNameOL();
	}

	@Given("I have retroactive comments as over length")
	public void i_have_retroactive_comments_as_over_length() {
		RcommentsString = random.generateNumberPhoneRandomStringOL();
	}

	@Given("I have type as special chars")
	public void i_have_type_as_special_chars() {
		typeString = random.randomSpecialCharacteres();
	}

	@Given("I have blockers comments as special chars")
	public void i_have_blockers_comments_as_special_chars() {
		BcommentsString = random.randomSpecialCharacteres();
	}

	@Given("I have retroactive comments as special chars")
	public void i_have_retroactive_comments_as_special_chars() {
		RcommentsString = random.randomSpecialCharacteres();
	}
	
	@Given("I have type as capital letters")
	public void i_have_type_as_capital_letters() {
		typeString = "THIS A TYPE";
	}
	
	@Given("I have blockers comments as capital letters")
	public void i_have_blockers_comments_as_capital_letters() {
		BcommentsString ="THIS A COMMENT AS STRING FOR BLOCKERS";
	}

	@Given("I have retroactive comments as capital letters")
	public void i_have_retroactive_comments_as_capital_letters() {
		RcommentsString ="THIS AA COMMENT AS STRING FOR RETROACTIVE ";
	}
	
	@Given("I have retroactive comments as null")
	public void i_have_retroactive_comments_as_null() {
		RcommentsString = null;
	}
	
	@Given("I have blockers comments as null")
	public void i_have_blockers_comments_as_null() {
		BcommentsString = null;
	}





	// D A T E S - F I E L D S
	@Given("I have date as current date")
	public void i_have_date_as_current_date() {
		date = LocalDate.now();
	}
	
	@Given("I have date as past date")
	public void i_have_date_as_past_date() {
		date = LocalDate.now().minusDays(random.randomDays());
	}

	@Given("I have date as future date")
	public void i_have_date_as_future_date() {
		date = LocalDate.now().plusDays(random.randomDays());
	}

	@Given("I have date as different format")
	public void i_have_date_as_different_format() {
	    strDate= formatter.format(date2);  
	    System.out.println(strDate);  
	}

	@Given("I have date as null")
	public void i_have_date_as_null() {
		date = null;
	}
	//B O O L E A N S - F I E L D S 

	@Given("I have attendance as false")
	public void i_have_attendance_as_false() {
		attendance = false;
	}

	@Given("I have blocked as false")
	public void i_have_blocked_as_false() {
		blocked = false;
	}

	@Given("I have looked_for_help as false")
	public void i_have_looked_for_help_as_false() {
		looked = false;
	}

	@Given("I have provided_help as false")
	public void i_have_provided_help_as_false() {
		provided = false;
	}

	@Given("I have worked_ahead as false")
	public void i_have_worked_ahead_as_false() {
		worked = false;
	}

	@Given("I have shared_resource as false")
	public void i_have_shared_resource_as_false() {
		shared = false;
	}

	@Given("I have carried_over as false")
	public void i_have_carried_over_as_false() {
		carried = false;
	}

	@Given("I have delay_looking_help as false")
	public void i_have_delay_looking_help_as_false() {
		delay = false;
	}
	
	@Given("I have attendance as true")
	public void i_have_attendance_as_true() {
		attendance = true;
	}

	@Given("I have blocked as true")
	public void i_have_blocked_as_true() {
		blocked = true;
	}

	@Given("I have looked_for_help as true")
	public void i_have_looked_for_help_as_true() {
	    looked = true;
	}

	@Given("I have provided_help as true")
	public void i_have_provided_help_as_true() {
	    provided = true;
	}

	@Given("I have worked_ahead as true")
	public void i_have_worked_ahead_as_true() {
	    worked = true;
	}

	@Given("I have shared_resource as true")
	public void i_have_shared_resource_as_true() {
	    shared = true;
	}

	@Given("I have carried_over as true")
	public void i_have_carried_over_as_true() {
	    carried = true;
	}

	@Given("I have delay_looking_help as true")
	public void i_have_delay_looking_help_as_true() {
	    delay = true;
	}

	@Given("I have attendance as letters")
	public void i_have_attendance_as_letters() {
		bool = "Yes";
	}

	@Given("I have blocked as letters")
	public void i_have_blocked_as_letters() {
		bool = "Yes";
	}

	@Given("I have looked_for_help as letters")
	public void i_have_looked_for_help_as_letters() {
		bool = "Yes";
	}

	@Given("I have provided_help as letters")
	public void i_have_provided_help_as_letters() {
		bool = "Yes";
	}

	@Given("I have worked_ahead as letters")
	public void i_have_worked_ahead_as_letters() {
		bool = "Yes";
	}

	@Given("I have shared_resource as letters")
	public void i_have_shared_resource_as_letters() {
		bool = "Yes";
	}

	@Given("I have carried_over as letters")
	public void i_have_carried_over_as_letters() {
		bool = "Yes";
	}

	@Given("I have delay_looking_help as letters")
	public void i_have_delay_looking_help_as_letters() {
		bool = "Yes";
	}
	
	@Given("I have attendance as capital letters")
	public void i_have_attendance_as_capital_letters() {
		bool = "FALSE";
	}

	@Given("I have blocked as capital letters")
	public void i_have_blocked_as_capital_letters() {
		bool = "FALSE";
	}

	@Given("I have looked_for_help as capital letters")
	public void i_have_looked_for_help_as_capital_letters() {
		bool = "FALSE";
	}

	@Given("I have provided_help as capital letters")
	public void i_have_provided_help_as_capital_letters() {
		bool = "FALSE";
	}

	@Given("I have worked_ahead as capital letters")
	public void i_have_worked_ahead_as_capital_letters() {
		bool = "FALSE";
	}

	@Given("I have shared_resource as capital letters")
	public void i_have_shared_resource_as_capital_letters() {
		bool = "FALSE";
	}

	@Given("I have carried_over as capital letters")
	public void i_have_carried_over_as_capital_letters() {
		bool = "FALSE";
	}

	@Given("I have delay_looking_help as capital letters")
	public void i_have_delay_looking_help_as_capital_letters() {
		bool = "FALSE";
	}
	
	@Given("I have attendance as numeric")
	public void i_have_attendance_as_numeric() {
		boolNumeric = 0;
	}

	@Given("I have blocked as numeric")
	public void i_have_blocked_as_numeric() {
		boolNumeric = 0;
	}

	@Given("I have looked_for_help as numeric")
	public void i_have_looked_for_help_as_numeric() {
		boolNumeric = 0;
	}

	@Given("I have provided_help as numeric")
	public void i_have_provided_help_as_numeric() {
		boolNumeric = 0;
	}

	@Given("I have worked_ahead as numeric")
	public void i_have_worked_ahead_as_numeric() {
		boolNumeric = 0;
	}

	@Given("I have shared_resource as numeric")
	public void i_have_shared_resource_as_numeric() {
		boolNumeric = 0;
	}

	@Given("I have carried_over as numeric")
	public void i_have_carried_over_as_numeric() {
		boolNumeric = 0;
	}

	@Given("I have delay_looking_help as numeric")
	public void i_have_delay_looking_help_as_numeric() {
		boolNumeric = 0;
	}

	@Given("I have attendance as null")
	public void i_have_attendance_as_null() {
		bool = null;
	}

	@Given("I have blocked as null")
	public void i_have_blocked_as_null() {
		bool = null;
	}


	@Given("I have looked_for_help as null")
	public void i_have_looked_for_help_as_null() {
		bool = null;
	}

	@Given("I have provided_help as null")
	public void i_have_provided_help_as_null() {
		bool = null;
	}
	
	@Given("I have worked_ahead as null")
	public void i_have_worked_ahead_as_null() {
		bool = null;
	}

	@Given("I have shared_resource as null")
	public void i_have_shared_resource_as_null() {
		bool = null;
	}

	@Given("I have carried_over as null")
	public void i_have_carried_over_as_null() {
		bool = null;
	}

	@Given("I have delay_looking_help as null")
	public void i_have_delay_looking_help_as_null() {
	    bool = null;
	}


	// A P I
	@When("I send PUT request to API")
	public void i_send_PUT_request_to_API() {
		
		blockers.put("blocked", blocked);
		blockers.put("comments", BcommentsString);
		
		proactive.put("looked_for_help", looked);
		proactive.put("provided_help", provided);
		proactive.put("worked_ahead", worked);
		proactive.put("shared_resources", shared);
		
		retroactive.put("delayed_looking_help", delay);
		retroactive.put("comments", RcommentsString);		
		
		metrics.put("attendance", attendance);
		metrics.put("carried_over", carried);
		metrics.put("blockers", blockers);
		metrics.put("proactive", proactive);
		metrics.put("retroactive", retroactive);
		
		obj.put("evaluator_id", evaluatorIDString);
		obj.put("evaluated_id", evaluatedIDString);
		if(typeString == null) {
			obj.put("type", typeNumeric);
		}else {
			obj.put("type", typeString);
		}
		obj.put("date", date);
		obj.put("sprint_id", sprintIDString);
		obj.put("metrics", metrics);
		
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
	
	@When("I send PUT request to API with nulls")
	public void i_send_PUT_request_to_API_with_nulls() {
		blockers.put("blocked", blocked);
		blockers.put("comments", BcommentsString);
		
		proactive.put("looked_for_help", looked);
		proactive.put("provided_help", provided);
		proactive.put("worked_ahead", worked);
		proactive.put("shared_resources", shared);
		
		retroactive.put("delayed_looking_help", delay);
		retroactive.put("comments", RcommentsString);		
		
		metrics.put("attendance", attendance);
		metrics.put("carried_over", carried);
		metrics.put("blockers", blockers);
		metrics.put("proactive", proactive);
		metrics.put("retroactive", retroactive);
		
		obj.put("evaluator_id", evaluatorIDString);
		obj.put("evaluated_id", evaluatedIDString);
	    obj.put("type", typeString);

		obj.put("date", date);
		obj.put("sprint_id", sprintIDString);
		obj.put("metrics", metrics);
		
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

	@When("I send PUT request to API bool as letters")
	public void i_send_PUT_request_to_API_bool_as_letters() {
		
		if(blocked == true) {
			blockers.put("blocked", blocked);
		}else {
			blockers.put("blocked", bool);
		}
		blockers.put("comments", BcommentsString);
		//////////////////////////////////////////////////
		if(looked == true) {
			proactive.put("looked_for_help", looked);
		}else {
			proactive.put("looked_for_help", bool);
		}
		if(provided == true ) {
			proactive.put("provided_help", provided);
		}else {
			proactive.put("provided_help", bool);
		}
		if(worked == true ) {
			proactive.put("worked_ahead", worked);
		}else {
			proactive.put("worked_ahead", bool);
		}
		if(shared == true) {
			proactive.put("shared_resources", shared);
		}else {
			proactive.put("shared_resources", bool);
		}
		//////////////////////////////////////////////////////////
		if(delay== true) {
			retroactive.put("delayed_looking_help", delay);
		}else {
			retroactive.put("delayed_looking_help", bool);
		}
		retroactive.put("comments", RcommentsString);		
		/////////////////////////////////////////////////////////
		if(attendance == true) {
			metrics.put("attendance", attendance);
		}else {
			metrics.put("attendance", bool);
		}
		
		if(carried == true) {
			metrics.put("carried_over", carried);
		}else {
			metrics.put("carried_over", bool);
		}
		
		metrics.put("blockers", blockers);
		metrics.put("proactive", proactive);
		metrics.put("retroactive", retroactive);
		
		obj.put("evaluator_id", evaluatorIDString);
		obj.put("evaluated_id", evaluatedIDString);
		if(typeString == null) {
			obj.put("type", typeNumeric);
			System.out.println("string null");
		}else {
			obj.put("type", typeString);
		}
		obj.put("date", date);
		obj.put("sprint_id", sprintIDString);
		obj.put("metrics", metrics);
		
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

	@When("I send PUT request to API bool as numeric")
	public void i_send_PUT_request_to_API_bool_as_numeric() {
		if(blocked == true) {
			blockers.put("blocked", blocked);
		}else {
			blockers.put("blocked", boolNumeric);
		}
		blockers.put("comments", BcommentsString);
		//////////////////////////////////////////////////
		if(looked == true) {
			proactive.put("looked_for_help", looked);
		}else {
			proactive.put("looked_for_help", boolNumeric);
		}
		if(provided == true ) {
			proactive.put("provided_help", provided);
		}else {
			proactive.put("provided_help", boolNumeric);
		}
		if(worked == true ) {
			proactive.put("worked_ahead", worked);
		}else {
			proactive.put("worked_ahead", boolNumeric);
		}
		if(shared == true) {
			proactive.put("shared_resources", shared);
		}else {
			proactive.put("shared_resources", boolNumeric);
		}
		//////////////////////////////////////////////////////////
		if(delay== true) {
			retroactive.put("delayed_looking_help", delay);
		}else {
			retroactive.put("delayed_looking_help", boolNumeric);
		}
		retroactive.put("comments", RcommentsString);		
		/////////////////////////////////////////////////////////
		if(attendance == true) {
			metrics.put("attendance", attendance);
		}else {
			metrics.put("attendance", boolNumeric);
		}
		
		if(carried == true) {
			metrics.put("carried_over", carried);
		}else {
			metrics.put("carried_over", boolNumeric);
		}
		
		metrics.put("blockers", blockers);
		metrics.put("proactive", proactive);
		metrics.put("retroactive", retroactive);
		
		obj.put("evaluator_id", evaluatorIDString);
		obj.put("evaluated_id", evaluatedIDString);
		if(typeString == null) {
			obj.put("type", typeNumeric);
			System.out.println("string null");
		}else {
			obj.put("type", typeString);
		}
		obj.put("date", date);
		obj.put("sprint_id", sprintIDString);
		obj.put("metrics", metrics);
		
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
		
		blockers.put("blocked", blocked);
		blockers.put("comments", BcommentsString);
		
		proactive.put("looked_for_help", looked);
		proactive.put("provided_help", provided);
		proactive.put("worked_ahead", worked);
		proactive.put("shared_resources", shared);
		
		retroactive.put("delayed_looking_help", delay);
		retroactive.put("comments", RcommentsString);		
		
		metrics.put("attendance", attendance);
		metrics.put("carried_over", carried);
		metrics.put("blockers", blockers);
		metrics.put("proactive", proactive);
		metrics.put("retroactive", retroactive);
		
		obj.put("evaluator_id", evaluatorIDString);
		obj.put("evaluated_id", evaluatedIDString);
		if(typeString == null) {
			obj.put("type", typeNumeric);
			System.out.println("string null");
		}else {
			obj.put("type", typeString);
		}
		obj.put("date", date);
		obj.put("sprint_id", sprintIDString);
		obj.put("metrics", metrics);
		System.out.println("\n\tnew Obj " + obj + "\n");
	}
	
	@When("I send PUT request to API bool nulls")
	public void i_send_PUT_request_to_API_bool_nulls() {
		if(blocked == true) {
			blockers.put("blocked", blocked);
		}else {
			blockers.put("blocked", bool);
		}
		blockers.put("comments", BcommentsString);
		//////////////////////////////////////////////////
		if(looked == true) {
			proactive.put("looked_for_help", looked);
		}else {
			proactive.put("looked_for_help", bool);
		}
		if(provided == true ) {
			proactive.put("provided_help", provided);
		}else {
			proactive.put("provided_help", bool);
		}
		if(worked == true ) {
			proactive.put("worked_ahead", worked);
		}else {
			proactive.put("worked_ahead", bool);
		}
		if(shared == true) {
			proactive.put("shared_resources", shared);
		}else {
			proactive.put("shared_resources", bool);
		}
		//////////////////////////////////////////////////////////
		if(delay== true) {
			System.out.println(delay);
			retroactive.put("delayed_looking_help", delay);
		}else {
			System.out.println(bool);
			retroactive.put("delayed_looking_help", bool);
		}
		retroactive.put("comments", RcommentsString);		
		/////////////////////////////////////////////////////////
		if(attendance == true) {
			metrics.put("attendance", attendance);
		}else {
			metrics.put("attendance", bool);
		}
		
		if(carried == true) {
			metrics.put("carried_over", carried);
		}else {
			metrics.put("carried_over", bool);
		}
		
		metrics.put("blockers", blockers);
		metrics.put("proactive", proactive);
		metrics.put("retroactive", retroactive);
		
		obj.put("evaluator_id", evaluatorIDString);
		obj.put("evaluated_id", evaluatedIDString);
		if(typeString == null) {
			obj.put("type", typeNumeric);
			System.out.println("string null");
		}else {
			obj.put("type", typeString);
		}
		obj.put("date", date);
		obj.put("sprint_id", sprintIDString);
		obj.put("metrics", metrics);
		
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
		blockers.put("blocked", blocked);
		blockers.put("comments", BcommentsString);
		
		proactive.put("looked_for_help", looked);
		proactive.put("provided_help", provided);
		proactive.put("worked_ahead", worked);
		proactive.put("shared_resources", shared);
		
		retroactive.put("delayed_looking_help", delay);
		retroactive.put("comments", RcommentsString);		
		
		metrics.put("attendance", attendance);
		metrics.put("carried_over", carried);
		metrics.put("blockers", blockers);
		metrics.put("proactive", proactive);
		metrics.put("retroactive", retroactive);
		
		obj.put("evaluator_id", evaluatorIDString);
		obj.put("evaluated_id", evaluatedIDString);
		if(typeString == null) {
			obj.put("type", typeNumeric);
			System.out.println("string null");
		}else {
			obj.put("type", typeString);
		}
		obj.put("date", date);
		obj.put("sprint_id", sprintIDString);
		obj.put("metrics", metrics);
	}
	
	@When("I send PUT request to API different format")
	public void i_send_PUT_request_to_API_different_format() {
		blockers.put("blocked", blocked);
		blockers.put("comments", BcommentsString);
		
		proactive.put("looked_for_help", looked);
		proactive.put("provided_help", provided);
		proactive.put("worked_ahead", worked);
		proactive.put("shared_resources", shared);
		
		retroactive.put("delayed_looking_help", delay);
		retroactive.put("comments", RcommentsString);		
		
		metrics.put("attendance", attendance);
		metrics.put("carried_over", carried);
		metrics.put("blockers", blockers);
		metrics.put("proactive", proactive);
		metrics.put("retroactive", retroactive);
		
		obj.put("evaluator_id", evaluatorIDString);
		obj.put("evaluated_id", evaluatedIDString);
		if(typeString == null) {
			obj.put("type", typeNumeric);
		}else {
			obj.put("type", typeString);
		}
		obj.put("date", strDate);
		obj.put("sprint_id", sprintIDString);
		obj.put("metrics", metrics);
		
		System.out.println("\n\tI sending " + obj + "\n");
		base.requestBody = obj.toString();
		
		base.apiResource = ApiPaths.MONGOCRUD + "/" + IDString;
		base.ServiceApi = new ApiTools();
	    base.response = base.ServiceApi.PUTMethod(base.apiResource,base.requestBody);
		base.responseBody = base.response.getBody();
		base.method = "PUT";		
		statusCodeRetrieved = base.response.getStatusCodeValue();		
		System.out.println("---------------response body "+base.responseBody);
		System.out.println("\n\tStatus code response\t " + statusCodeRetrieved);;
	}

	
	@When("I send PUT request to API as numeric")
	public void i_send_PUT_request_to_API_as_numeric() {
		blockers.put("blocked", blocked);
		blockers.put("comments", BcommentsString);
		
		proactive.put("looked_for_help", looked);
		proactive.put("provided_help", provided);
		proactive.put("worked_ahead", worked);
		proactive.put("shared_resources", shared);
		
		retroactive.put("delayed_looking_help", delay);
		retroactive.put("comments", RcommentsString);		
		
		metrics.put("attendance", attendance);
		metrics.put("carried_over", carried);
		metrics.put("blockers", blockers);
		metrics.put("proactive", proactive);
		metrics.put("retroactive", retroactive);
		
		obj.put("evaluator_id", evaluatorIDString);
		obj.put("evaluated_id", evaluatedIDString);
		if(typeString == null) {
			obj.put("type", typeNumeric);
			System.out.println("string null");
		}else {
			obj.put("type", typeString);
		}
		obj.put("date", date);
		obj.put("sprint_id", sprintIDString);
		obj.put("metrics", metrics);
		
		//System.out.println(obj.getJSONObject("metrics").getBoolean("attendance"));
		
		System.out.println("\n\tI sending " + obj + "\n");
		base.requestBody = obj.toString();
		
		if(IDString == null) {
			base.apiResource = ApiPaths.MONGOCRUD + "/" + IDNumeric;
			System.out.println("sendings id numeric");
		}else {
			base.apiResource = ApiPaths.MONGOCRUD + "/" + IDString;
		}
		base.ServiceApi = new ApiTools();
	    base.response = base.ServiceApi.PUTMethod(base.apiResource,base.requestBody);
		base.responseBody = base.response.getBody();
		base.method = "PUT";		
		statusCodeRetrieved = base.response.getStatusCodeValue();		
		System.out.println("---------------response body "+base.responseBody);
		System.out.println("\n\tStatus code response\t " + statusCodeRetrieved);
	}


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
		};
	}



	@Then("I validate reponse with MongoDB")
	public void i_validate_reponse_with_MongoDB() {
		
		switch(statusCodeRetrieved) {
		case 202:
			boolRetrieved = MongoDBUtils.compareHP("TEST", "InternHome", "metrics", IDString, obj);
			System.out.println("boolretrieve "+boolRetrieved +" \tboolCheck "+boolCheck);
			assert boolRetrieved == boolCheck ;
			break;
		case 400:
			boolRetrieved = MongoDBUtils.compareHP("TEST", "InternHome", "metrics", IDString, obj);
			System.out.println("boolretrieve "+boolRetrieved +" \tboolCheck "+boolCheck);
			assert boolRetrieved != boolCheck ;
			break;
		case 404:
			if(IDString==null) {
				IDString = Long.toString(IDNumeric);
			}
			boolRetrieved = MongoDBUtils.compareHP("TEST", "InternHome", "metrics", IDString, obj);
			System.out.println("boolretrieve "+boolRetrieved +" \tboolCheck "+boolCheck);
			assert boolRetrieved != boolCheck ;
			break;
		}
	}
	

*/
}
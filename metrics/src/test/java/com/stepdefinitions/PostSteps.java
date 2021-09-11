package com.stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.bson.types.ObjectId;
import org.json.JSONArray;
import org.json.JSONObject;

import com.globalClasses.BasicSecurityUtil;
import com.globalClasses.RandomTools;
import com.globalClasses.ApiPaths;
import com.globalClasses.ApiTools;
import com.globalClasses.MongoDBUtils;
import com.globalClasses.MyTools;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PostSteps {
	private BasicSecurityUtil base;
	long firstNameInt = 0, lastNameInt = 0, phoneInt = 0, idInt, numeric = 0;
	int statusCodeExpected, statusCodeRetrieved;
	boolean bool = false;
	boolean boolRetrieved = false, numTyp = false, numRet = false, numBl = false;
	String field, id = "_id", type, blockers_comments, retroactive_comments;
	String evaluator_id, evaluated_id, sprint_id;
	JSONObject metrics = new JSONObject();
	JSONObject blockers = new JSONObject();
	JSONObject proactive = new JSONObject();
	JSONObject retroactive = new JSONObject();
	String attendance, blocked, looked_for_help, provided_help, worked_ahead, shared_resources, carried_over,
			delayed_looking_help;
	String name = "name", technology = "technology", active = "active", isBacklog = "is_backlog",
			startDate = "start_date", endDate = "end_date";
	String substr = "";
	JSONArray jsonResult = new JSONArray();
	String test;
	String date;
	LocalDate targetDate;


	RandomTools random = new RandomTools();

	public PostSteps(BasicSecurityUtil base) {
		this.base = base;
	}

	@Given("I have an Evaluator ID")
	public void i_have_an_Evaluator_ID() {
		// Write code here that turns the phrase above into concrete actions
		evaluator_id = MongoDBUtils.executeRandomSelectIDUser("TEST", "InternHome", "users", "role", "mentor");
	}

	@Given("I have an Evaluated ID")
	public void i_have_an_Evaluated_ID() {
		// Write code here that turns the phrase above into concrete actions
		evaluated_id = MongoDBUtils.executeRandomSelectIDUser("TEST", "InternHome", "users", "role", "intern");
	}
	
	@Given("I have an Evaluator ID as null")
	public void i_have_an_Evaluator_ID_as_null() {
		// Write code here that turns the phrase above into concrete actions
		evaluated_id = " ";

	}
	
	@Given("I have an Evaluated ID as same as evaluator")
	public void i_have_an_Evaluated_ID_as_same_as_evaluator() {
	    // Write code here that turns the phrase above into concrete actions
	    evaluated_id = evaluator_id;
	}

	@Given("I have an type")
	public void i_have_an_type() {
		// Write code here that turns the phrase above into concrete actions
		type = random.randomFirstName();
	}

	@Given("I have a date")
	public void i_have_a_date() {
		// Write code here that turns the phrase above into concrete actions
		Date dat = new Date();
		long time = dat.getTime();
		date = new Timestamp(time).toString().substring(0,10);
		System.out.println(date);
	}

	@Given("I have an Sprint ID")
	public void i_have_an_Sprint_ID() {
		// Write code here that turns the phrase above into concrete actions
		test = MongoDBUtils.executeRandomSelectID("TEST", "InternHome", "sprints", id);
		sprint_id = test;
	}
	
	@Given("I have an unexistent Sprint ID")
	public void i_have_an_unexistent_Sprint_ID() {
	    // Write code here that turns the phrase above into concrete actions
		sprint_id = "5ea70358ce7a050fb7c36eca";
	}
	@Given("I have an the attendance")
	public void i_have_an_the_attendance() {
		// Write code here that turns the phrase above into concrete actions
		Random rand = new Random();
		boolean f = rand.nextBoolean();
		attendance = String.valueOf(f);
	}

	@Given("I have an blocked")
	public void i_have_an_blocked() {
		// Write code here that turns the phrase above into concrete actions
		Random rand = new Random();
		boolean f = rand.nextBoolean();
		blocked = String.valueOf(f);
	}

	@Given("I have an blockers comments")
	public void i_have_an_blockers_comments() {
		// Write code here that turns the phrase above into concrete actions
		blockers_comments = random.randomLastNameOL();
	}

	@Given("I have an looked for help")
	public void i_have_an_looked_for_help() {
		// Write code here that turns the phrase above into concrete actions
		Random rand = new Random();
		boolean f = rand.nextBoolean();
		looked_for_help = String.valueOf(f);
	}

	@Given("I have an provided help")
	public void i_have_an_provided_help() {
		// Write code here that turns the phrase above into concrete actions
		Random rand = new Random();
		boolean f = rand.nextBoolean();
		provided_help = String.valueOf(f);
	}

	@Given("I have an worked ahead")
	public void i_have_an_worked_ahead() {
		// Write code here that turns the phrase above into concrete actions
		Random rand = new Random();
		boolean f = rand.nextBoolean();
		worked_ahead = String.valueOf(f);
	}

	@Given("I have an shared resources")
	public void i_have_an_shared_resources() {
		// Write code here that turns the phrase above into concrete actions
		Random rand = new Random();
		boolean f = rand.nextBoolean();
		shared_resources = String.valueOf(f);
	}

	@Given("I have an carried over")
	public void i_have_an_carried_over() {
		// Write code here that turns the phrase above into concrete actions
		Random rand = new Random();
		boolean f = rand.nextBoolean();
		carried_over = String.valueOf(f);
	}

	@Given("I have an delayed looking help")
	public void i_have_an_delayed_looking_help() {
		// Write code here that turns the phrase above into concrete actions
		Random rand = new Random();
		boolean f = rand.nextBoolean();
		delayed_looking_help = String.valueOf(f);
	}

	@Given("I have an retroactive comments")
	public void i_have_an_retroactive_comments() {
		// Write code here that turns the phrase above into concrete actions
		retroactive_comments = random.randomFirstName();
	}

	@Given("I have an type as Alphanumeric")
	public void i_have_an_type_as_Alphanumeric() {
		// Write code here that turns the phrase above into concrete actions
		type = random.randomLastNameOL() + random.generateNumberPhoneRandomString();
	}

	@Given("I have an type as Letters")
	public void i_have_an_type_as_Letters() {
		// Write code here that turns the phrase above into concrete actions
		type = random.randomLastNameOL();
	}

	@Given("I have an the attendance as True")
	public void i_have_an_the_attendance_as_True() {
		// Write code here that turns the phrase above into concrete actions
		attendance = "true";
	}

	@Given("I have an the attendance as False")
	public void i_have_an_the_attendance_as_False() {
		// Write code here that turns the phrase above into concrete actions
		attendance = "false";
	}

	@Given("I have an blocked as True")
	public void i_have_an_blocked_as_True() {
		// Write code here that turns the phrase above into concrete actions
		blocked = "true";
	}

	@Given("I have an blocked as False")
	public void i_have_an_blocked_as_False() {
		// Write code here that turns the phrase above into concrete actions
		blocked = "false";
	}

	@Given("I have an looked for help as True")
	public void i_have_an_looked_for_help_as_True() {
		// Write code here that turns the phrase above into concrete actions
		looked_for_help = "true";
	}

	@Given("I have an looked for help as False")
	public void i_have_an_looked_for_help_as_False() {
		// Write code here that turns the phrase above into concrete actions
		looked_for_help = "false";
	}

	@Given("I have an provided help as True")
	public void i_have_an_provided_help_as_True() {
		// Write code here that turns the phrase above into concrete actions
		provided_help = "true";
	}

	@Given("I have an provided help as False")
	public void i_have_an_provided_help_as_False() {
		// Write code here that turns the phrase above into concrete actions
		provided_help = "false";
	}

	@Given("I have an worked ahead as True")
	public void i_have_an_worked_ahead_as_True() {
		// Write code here that turns the phrase above into concrete actions
		worked_ahead = "true";
	}

	@Given("I have an worked ahead as False")
	public void i_have_an_worked_ahead_as_False() {
		// Write code here that turns the phrase above into concrete actions
		worked_ahead = "false";
	}

	@Given("I have an shared resources as True")
	public void i_have_an_shared_resources_as_True() {
		// Write code here that turns the phrase above into concrete actions
		shared_resources = "true";
	}

	@Given("I have an shared resources as False")
	public void i_have_an_shared_resources_as_False() {
		// Write code here that turns the phrase above into concrete actions
		shared_resources = "false";
	}

	@Given("I have an carried over as True")
	public void i_have_an_carried_over_as_True() {
		// Write code here that turns the phrase above into concrete actions
		carried_over = "true";
	}

	@Given("I have an carried over as False")
	public void i_have_an_carried_over_as_False() {
		// Write code here that turns the phrase above into concrete actions
		carried_over = "false";
	}

	@Given("I have an delayed looking help as True")
	public void i_have_an_delayed_looking_help_as_True() {
		// Write code here that turns the phrase above into concrete actions
		delayed_looking_help = "true";
	}

	@Given("I have an delayed looking help as False")
	public void i_have_an_delayed_looking_help_as_False() {
		// Write code here that turns the phrase above into concrete actions
		delayed_looking_help = "false";
	}

	@Given("I have an type as Numeric")
	public void i_have_an_type_as_Numeric() {
		// Write code here that turns the phrase above into concrete actions
		numeric = random.generateNumberPhoneRandomlong();
		numTyp = true;
	}

	@Given("I have an type as overlenght")
	public void i_have_an_type_as_overlenght() {
		// Write code here that turns the phrase above into concrete actions
		type = random.randomFirstNameOL() + random.randomLastNameOL();
	}

	@Given("I have an type as Special characters")
	public void i_have_an_type_as_Special_characters() {
		// Write code here that turns the phrase above into concrete actions
		type = random.randomSpecialCharacteres();
	}

	@Given("I have an type as case Sensitive")
	public void i_have_an_type_as_case_Sensitive() {
		// Write code here that turns the phrase above into concrete actions
		type = random.randomLastName().toUpperCase();
	}

	@Given("I have an type as null")
	public void i_have_an_type_as_null() {
		// Write code here that turns the phrase above into concrete actions
		type = null;
	}

	@Given("I have an type as empty field")
	public void i_have_an_type_as_empty_field() {
		// Write code here that turns the phrase above into concrete actions
		type = "";
	}

	@Given("I have a date as incorrect format")
	public void i_have_a_date_as_incorrect_format() {
		// Write code here that turns the phrase above into concrete actions
		date = String.valueOf(targetDate.getYear() + "-" + targetDate.getDayOfMonth() + "-" + targetDate.getMonthValue()); 
	}

	@Given("I have a date as past date")
	public void i_have_a_date_as_past_date() {
		// Write code here that turns the phrase above into concrete actions
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate currentDate = LocalDate.now();
		date = LocalDate.parse(currentDate.format(dtf)).minusMonths(10).toString();

	}

	@Given("I have a date as future date")
	public void i_have_a_date_as_future_date() {
		// Write code here that turns the phrase above into concrete actions
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate currentDate = LocalDate.now();
		date = LocalDate.parse(currentDate.format(dtf)).plusYears(50).toString();

	}

	@Given("I have a date as null")
	public void i_have_a_date_as_null() {
		// Write code here that turns the phrase above into concrete actions
		date = null;
	}

	@Given("I have an blockers comments as numeric")
	public void i_have_an_blockers_comments_as_numeric() {
		// Write code here that turns the phrase above into concrete actions
		numeric = random.generateNumberPhoneRandomlong();
		numBl = true;
	}

	@Given("I have an blockers comments as overlenght")
	public void i_have_an_blockers_comments_as_overlenght() {
		// Write code here that turns the phrase above into concrete actions
		blockers_comments = random.randomFirstNameOL() + random.randomLastNameOL();
	}

	@Given("I have an blockers comments as special characters")
	public void i_have_an_blockers_comments_as_special_characters() {
		// Write code here that turns the phrase above into concrete actions
		blockers_comments = random.randomSpecialCharacteres();
	}

	@Given("I have an blockers comments as alphanumeric")
	public void i_have_an_blockers_comments_as_alphanumeric() {
		// Write code here that turns the phrase above into concrete actions
		blockers_comments = random.randomFirstName() + random.generateNumberPhoneRandomString();
	}

	@Given("I have an retroactive comments as alphanumeric")
	public void i_have_an_retroactive_comments_as_alphanumeric() {
		// Write code here that turns the phrase above into concrete actions
		retroactive_comments = random.randomFirstName() + random.generateNumberPhoneRandomString();
	}

	@Given("I have an retroactive comments as numeric")
	public void i_have_an_retroactive_comments_as_numeric() {
		// Write code here that turns the phrase above into concrete actions
		numeric = random.generateNumberPhoneRandomlong();
		numRet = true;
	}

	@Given("I have an retroactive comments as overlenght")
	public void i_have_an_retroactive_comments_as_overlenght() {
		// Write code here that turns the phrase above into concrete actions
		retroactive_comments = random.randomLastNameOL() + random.randomLastNameOL();
	}

	@Given("I have an retroactive comments as special characters")
	public void i_have_an_retroactive_comments_as_special_characters() {
		// Write code here that turns the phrase above into concrete actions
		retroactive_comments = random.randomSpecialCharacteres();
	}

	@Given("I have an retroactive comments as null")
	public void i_have_an_retroactive_comments_as_null() {
		// Write code here that turns the phrase above into concrete actions
		retroactive_comments = null;
	}

	@Given("I have an metric as null")
	public void i_have_an_metric_as_null() {
		// Write code here that turns the phrase above into concrete actions
		metrics = null;
	}

	@Given("I have an Evaluated ID as null")
	public void i_have_an_Evaluated_ID_as_null() {
		// Write code here that turns the phrase above into concrete actions
		evaluated_id = null;
	}

	@Given("I have an Sprint ID as null")
	public void i_have_an_Sprint_ID_as_null() {
		// Write code here that turns the phrase above into concrete actions
		sprint_id = null;
	}

	@Given("I have an Sprint ID with an existent metric")
	public void i_have_an_Sprint_ID_with_an_existent_metric() {
		// Write code here that turns the phrase above into concrete actions
		sprint_id = MongoDBUtils.executeRandomSelectID("TEST", "InternHome", "sprints", id);
		
	}

	@Given("I have an with unexistent Evaluated ID")
	public void i_have_an_with_unexistent_Evaluated_ID() {
		// Write code here that turns the phrase above into concrete actions
		evaluated_id = MongoDBUtils.executeRandomSelectID("TEST", "InternHome", "sprints", id);
	}

	@Given("I have an Sprint ID as incorrect format")
	public void i_have_an_Sprint_ID_as_incorrect_format() {
		// Write code here that turns the phrase above into concrete actions
		test = MongoDBUtils.executeRandomSelectID("TEST", "InternHome", "sprints", id);
		sprint_id = test.substring(0, 10) + "123456789f";
		System.out.println();
	}

	@Given("I have an Evaluated ID as incorrect format")
	public void i_have_an_Evaluated_ID_as_incorrect_format() {
		// Write code here that turns the phrase above into concrete actions
		test = MongoDBUtils.executeRandomSelectID("TEST", "InternHome", "users", id);
		System.out.println(test);
		evaluated_id = test.substring(7, 10) + "123456789f";
		System.out.println(sprint_id);
	}

	@Given("I have an Evaluator ID as incorrect format")
	public void i_have_an_Evaluator_ID_as_incorrect_format() {
		// Write code here that turns the phrase above into concrete actions
		test = MongoDBUtils.executeRandomSelectID("TEST", "InternHome", "users", id);
		evaluator_id = test.substring(0, 10) + "123456789f";
	}

	@Given("I have the Blockers as null")
	public void i_have_the_Blockers_as_null() {
		// Write code here that turns the phrase above into concrete actions
		blockers = null;
	}

	@Given("I have a proactive as null")
	public void i_have_a_proactive_as_null() {
		// Write code here that turns the phrase above into concrete actions
		proactive = null;
	}

	@Given("I have an retroactive as null")
	public void i_have_an_retroactive_as_null() {
		// Write code here that turns the phrase above into concrete actions
		retroactive = null;
	}

	@Given("I have an blocked as alphanumeric")
	public void i_have_an_blocked_as_alphanumeric() {
		// Write code here that turns the phrase above into concrete actions
		blocked = "true2qwe";
	}

	@Given("I have an blocked as Cappital letter")
	public void i_have_an_blocked_as_Cappital_letter() {
		// Write code here that turns the phrase above into concrete actions
		blocked = "FALSE";
	}

	@Given("I have an the attendance as null")
	public void i_have_an_the_attendance_as_null() {
		// Write code here that turns the phrase above into concrete actions
		attendance = null;
	}

	@Given("I have an the attendance as cappital letter")
	public void i_have_an_the_blocked_as_cappital_letter() {
		// Write code here that turns the phrase above into concrete actions
		attendance = "FALSE";
	}

	@Given("I have an blocked as null")
	public void i_have_an_blocked_as_null() {
		// Write code here that turns the phrase above into concrete actions
		blocked = null;
	}

	@Given("I have an looked for help as cappital letter")
	public void i_have_an_looked_for_help_as_cappital_letter() {
		// Write code here that turns the phrase above into concrete actions
		looked_for_help = "TRUE";
	}

	@Given("I have an looked for help as null")
	public void i_have_an_looked_for_help_as_null() {
		// Write code here that turns the phrase above into concrete actions
		looked_for_help = null;
	}

	@Given("I have an provided help as cappital letter")
	public void i_have_an_provided_help_as_cappital_letter() {
		// Write code here that turns the phrase above into concrete actions
		provided_help = "FALSE";
	}

	@Given("I have an provided help as null")
	public void i_have_an_provided_help_as_null() {
		// Write code here that turns the phrase above into concrete actions
		provided_help = null;
	}

	@Given("I have an worked ahead as cappital letter")
	public void i_have_an_worked_ahead_as_cappital_letter() {
		// Write code here that turns the phrase above into concrete actions
		worked_ahead = "TRUE";
	}

	@Given("I have an worked ahead as null")
	public void i_have_an_worked_ahead_as_null() {
		// Write code here that turns the phrase above into concrete actions
		worked_ahead = null;
	}

	@Given("I have an shared resources as upper case")
	public void i_have_an_shared_resources_as_upper_case() {
		// Write code here that turns the phrase above into concrete actions
		shared_resources = "TRUE";
	}

	@Given("I have an shared resources as null")
	public void i_have_an_shared_resources_as_null() {
		// Write code here that turns the phrase above into concrete actions
		shared_resources = null;
	}

	@Given("I have an carried over as upper case")
	public void i_have_an_carried_over_as_upper_case() {
		// Write code here that turns the phrase above into concrete actions
		carried_over = "FALSE";
	}

	@Given("I have an carried over as null")
	public void i_have_an_carried_over_as_null() {
		// Write code here that turns the phrase above into concrete actions
		carried_over = null;
	}

	@Given("I have an delayed looking help as upper case")
	public void i_have_an_delayed_looking_help_as_upper_case() {
		// Write code here that turns the phrase above into concrete actions
		delayed_looking_help = "TRUE";
	}

	@Given("I have an delayed looking help as null")
	public void i_have_an_delayed_looking_help_as_null() {
		// Write code here that turns the phrase above into concrete actions
		delayed_looking_help = null;
	}

	@Given("I prepare the resource")
	public void i_prepare_the_resource() {
		// Write code here that turns the phrase above into concrete actions
		JSONObject obj = new JSONObject();
		if (metrics == null) {
			obj.put("evaluator_id", evaluator_id);
			obj.put("evaluated_id", evaluated_id);
			obj.put("type", type);
			obj.put("date", date);
			obj.put("sprint_id", sprint_id);
			obj.put("metrics", metrics);
		} else if (blockers == null) {
			obj.put("evaluator_id", evaluator_id);
			obj.put("evaluated_id", evaluated_id);
			obj.put("type", type);
			obj.put("date", date);
			obj.put("sprint_id", sprint_id);
			obj.put("metrics", metrics);
			proactive.put("looked_for_help", looked_for_help);
			proactive.put("provided_help", provided_help);
			proactive.put("worked_ahead", worked_ahead);
			proactive.put("shared_resources", shared_resources);
			retroactive.put("delayed_looking_help", delayed_looking_help);
			retroactive.put("retroactive_comments", retroactive_comments);
			metrics.put("attendance", attendance);
			metrics.put("blockers", blockers);
			metrics.put("proactive", proactive);
			metrics.put("carried_over", carried_over);
			metrics.put("retroactive", retroactive);
			obj.put("metrics", metrics);
		} else if (proactive == null) {
			obj.put("evaluator_id", evaluator_id);
			obj.put("evaluated_id", evaluated_id);
			obj.put("type", type);
			obj.put("date", date);
			obj.put("sprint_id", sprint_id);
			blockers.put("blocked", blocked);
			blockers.put("comments", blockers_comments);
			retroactive.put("delayed_looking_help", delayed_looking_help);
			retroactive.put("comments", retroactive_comments);
			metrics.put("attendance", attendance);
			metrics.put("blockers", blockers);
			metrics.put("proactive", proactive);
			metrics.put("carried_over", carried_over);
			metrics.put("retroactive", retroactive);
			obj.put("metrics", metrics);
		}else if (retroactive == null) {
			obj.put("evaluator_id", evaluator_id);
			obj.put("evaluated_id", evaluated_id);
			obj.put("type", type);
			obj.put("date", date);
			obj.put("sprint_id", sprint_id);
			blockers.put("blocked", blocked);
			blockers.put("comments", blockers_comments);
			proactive.put("looked_for_help", looked_for_help);
			proactive.put("provided_help", provided_help);
			proactive.put("worked_ahead", worked_ahead);
			proactive.put("shared_resources", shared_resources);
			metrics.put("attendance", attendance);
			metrics.put("blockers", blockers);
			metrics.put("proactive", proactive);
			metrics.put("carried_over", carried_over);
			metrics.put("retroactive", retroactive);
			obj.put("metrics", metrics);
		} else {

			obj.put("evaluator_id", evaluator_id);
			obj.put("evaluated_id", evaluated_id);
			if (numTyp == true) {
				obj.put("type", numeric);

			} else {
				obj.put("type", type);
			}

			obj.put("date", date);
			obj.put("sprint_id", sprint_id);
			blockers.put("blocked", blocked);
			if (numBl == true) {
				blockers.put("comments", numeric);
			} else {
				blockers.put("comments", blockers_comments);
			}
			proactive.put("looked_for_help", looked_for_help);
			proactive.put("provided_help", provided_help);
			proactive.put("worked_ahead", worked_ahead);
			proactive.put("shared_resources", shared_resources);
			retroactive.put("delayed_looking_help", delayed_looking_help);
			if (numRet == true) {
				blockers.put("comments", numeric);
			} else {
				retroactive.put("comments", retroactive_comments);
			}
			metrics.put("attendance", attendance);
			metrics.put("blockers", blockers);
			metrics.put("proactive", proactive);
			metrics.put("carried_over", carried_over);
			metrics.put("retroactive", retroactive);
			obj.put("metrics", metrics);
		}

		base.requestBody = obj.toString();
		System.out.println(base.requestBody);
	}

	@When("I create a new Metric with Post method")
	public void i_create_a_new_Metric_with_Post_method() {
		// Write code here that turns the phrase above into concrete actions
		base.apiResource = ApiPaths.METRICS;
		base.ServiceApi = new ApiTools();
		base.response = base.ServiceApi.POSTMethod(base.apiResource, base.requestBody);
		base.responseBody = base.response.getBody();
		base.method = "POST";
		//MyTools.resource(ApiPaths.METRICS);
        //MyTools.statusCode(String.valueOf(statusCodeRetrieved));
       // MyTools.responseBody(base.responseBody);
	}

	@Then("The API should indicate that the resource was Created")
	public void the_API_should_indicate_that_the_resource_was_Created() {
		int code = 201;
	    int result = Integer.parseInt(base.response.getStatusCode().toString().substring(0, 3));
	    assertEquals(code, result);
	}

	@Then("The status error should be Bad Request")
	public void the_status_error_should_be_Bad_Request() {
	    // Write code here that turns the phrase above into concrete actions
		int code = 400;
	    int result = Integer.parseInt(base.response.getStatusCode().toString().substring(0, 3));
	    assertEquals(code, result);
	}

	@Then("The status error should return a CONFLICT")
	public void the_status_error_should_return_a_CONFLICT() {
	    // Write code here that turns the phrase above into concrete actions
		int code = 409;
	    int result = Integer.parseInt(base.response.getStatusCode().toString().substring(0, 3));
	    assertEquals(code, result);
	}

	@Then("I verify in the database if the Metric exist")
	public void i_verify_in_the_database_if_the_Metric_exist() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(base.responseBody);
		jsonResult = MongoDBUtils.executeMyQueryID("TEST", "InternHome", "metrics", "_id", base.responseBody);
		System.out.println(jsonResult.toString());
		if (jsonResult.isEmpty()) {
			System.out.println("Error: --------------------- FAILED");
		} else {
			System.out.println("Success: --------------------- Success");
		}
	}
	
	@Then("verify the error message {string} from the API")
	public void verify_the_error_message_from_the_API(String api) {
	    // Write code here that turns the phrase above into concrete actions
		JSONObject result = new JSONObject(base.responseBody);
		String error = api;
	    assertEquals(error, result.get("message"));
	}


	@After
	public void printResults(Scenario sce) {
		if (base.apiResource != null)
			sce.write("Resource: " + base.apiResource);
		if (base.responseBody != null)
			sce.write("RequestBody: " + base.requestBody);
		if (base.responseBody != null)
			sce.write("ResponseAPI: " + base.responseBody);

	}
}

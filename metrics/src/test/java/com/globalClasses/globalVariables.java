package com.globalClasses;

import java.time.LocalDate;

import org.json.JSONObject;

public class globalVariables{
	public String metricID;
	public String evaluatorID;
	public String evaluatedID;
	public String sprintID;
	public String type;
	public LocalDate date;
	
	public int size;
	public int page;
	
	
	public boolean attendance = false;;
	public boolean carried_over = false;;
	
	public boolean blocked = false;;
	public String blockers_comments;
	
	public boolean looked = false;;
	public boolean provided = false;;
	public boolean worked = false;;
	public boolean shared = false;;
	
	public boolean delayed = false;
	public String retroactive_comments;
	
	//to insert and update
	public JSONObject object = new JSONObject();		
	public JSONObject metrics = new JSONObject();
	public JSONObject blockers = new JSONObject();
	public JSONObject proactive = new JSONObject();
	public JSONObject retroactive = new JSONObject();
	
	//
	public JSONObject metricObject = new JSONObject();
	
	public String queryParam= "";
	
}
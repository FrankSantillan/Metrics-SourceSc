package com.test.globalclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bson.Document;
import org.json.JSONArray;
import org.json.JSONObject;

import com.test.globalclasses.MongoDBConnection;


public class MongoDBUtils {
	/** 
	   *<p>Return the number of results of a query.
	   *@param env Environment, i.e TEST.
	   *@param mDataBase Database name.
	   *@param query Query that will be counted on SQL style Mongo.
	   *@param A long number
	   *@throws Exception
	   * */
	/** 
	   *<p>Return the number of results of a query.
	   *@param env Environment, i.e TEST.
	   *@param mDataBase Database name.
	   *@param query Query that will be counted on SQL style Mongo.
	   *@param A long number
	   *@throws Exception
	   * */
	   public static long executeSelectCount(String env, String mDataBase, String query) {
	       MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	       long count = 0;
	       try {
	           count = db.executeSelectCount(query);
	       } catch (Exception e) {
	           e.printStackTrace();
	       } finally {
	           db.close();
	       }
	       return count;
	   }

	    /** 
	   *<p>Execute a single select of a query on SQL or Mongo style.
	   *@param env Environment, i.e TEST.
	   *@param mDataBase Database name.
	   *@param query Query that will be counted on SQL style Mongo.
	   *@return A single record.
	   *@throws Exception
	   * */
	   public static String executeSelectSingle(String env, String mDataBase, String coll, String query) {
	       MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	       String singleField = "";
	       try {
	           singleField = db.executeSelectSingle(query, coll);
	       } catch(Exception e) {
	           e.printStackTrace();
	       } finally {
	           db.close();
	       }
	       return singleField;
	   }

	   
	   
	    public static JSONArray executeMyQuery(String env, String mDataBase, String collection, String field, String filter) {
	           MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	           JSONArray querySelect = new JSONArray();
	           try {
	               System.out.println("-----step 1");
	               querySelect = db.executeQuerySelect(collection, field, filter); 
	           } catch(Exception var9) {
	               var9.printStackTrace();
	           } finally {
	               db.close();
	           }
	           System.out.println("return result");
	           return querySelect;
	       }
	    public static JSONArray executeMyQueryID(String env, String mDataBase, String collection, String field, String filter) {
	           MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	           JSONArray querySelect = new JSONArray();
	           try {
	               querySelect = db.executeQuerySelectID(collection, field, filter); 
	           } catch(Exception var9) {
	               var9.printStackTrace();
	           } finally {
	               db.close();
	           }
	           System.out.println("return result");
	           return querySelect;
	       }
	    

	   /** 
	   *<p>Execute a select  with multiple records of a query on SQL or Mongo style.
	   *@param env Environment, i.e TEST.
	   *@param mDataBase Database name.
	   *@param query Query that will be counted on SQL style Mongo.
	   *@return A list of records.
	   *@throws Exception
	   * */
	   public static List<JSONObject> executeSelectJsonList(String env, String mDataBase, String query, boolean excludeId) {
	       MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	       List<JSONObject> resultList = new ArrayList<JSONObject>();
	       try {
	           resultList = db.executeSelectJsonList(query, excludeId);
	       } catch(Exception e) {
	           e.printStackTrace();
	       } finally {
	           db.close();
	       }
	       return resultList;
	   }

	   /** 
	   *<p>This method return a value from random document given a collection.
	   *@param env Environment, i.e TEST.
	   *@param mDataBase Database name.
	   *@param collection Collection name where query will be executed.
	   *@param field Field name that will be retrieved.
	   *@return A random String value from Collection.
	   *@throws Exception
	   * */
	   public static String executeRandomSelect(String env, String mDataBase, String collection, String field) {
	       MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	       String randomSelect = "";
	       try {
	           randomSelect = db.executeRandomSelect(collection, field);
	       } catch(Exception var9) {
	           var9.printStackTrace();
	       } finally {
	           db.close();
	       }
	       return randomSelect;
	   }

	   public static String executeRandomSelectID(String env, String mDataBase, String collection, String field) {
	       MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	       String randomSelect = "";
	       try {
	           randomSelect = db.executeRandomSelectID(collection, field);
	       } catch(Exception var9) {
	           var9.printStackTrace();
	       } finally {
	           db.close();
	       }
	       return randomSelect;
	   }

	   public static String executeRandomSelectD(String env, String mDataBase, String collection, String id, String name, String tech, String active, String backlog, String startDate, String endDate) {
	         MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	         String randomSelect = "";
	         try {
	             randomSelect = db.executeRandomSelectD(collection, id, name, tech, active, backlog, startDate, endDate);
	         } catch(Exception exception) {
	             exception.printStackTrace();
	         } finally {
	             db.close();
	         }
	         return randomSelect;
	     }
	   
	   public static ArrayList<String> split(String var) {
         ArrayList<String> result = new ArrayList<>();
         String[] parts = var.split(",");
         result.add(parts[0]);
         result.add(parts[1]);
         result.add(parts[2]);
         result.add(parts[3]);
         result.add(parts[4]);
         result.add(parts[5]);
         result.add(parts[6]);
       
         return result;
     }

	    /** 
	   *<p>Execute a random select from given collection.
	   *@param env Environment, i.e TEST.
	   *@param mDataBase Database name.
	   *@param collection Collection name where query will be executed.
	   *@return A random Json Object from Collection.
	   *@throws Exception
	   * */
	   public static JSONObject executeRandomJsonSelect(String env, String mDataBase, String collection) {
	       MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	       JSONObject jsonResult = new JSONObject();
	       try {
	           jsonResult = db.executeRandomJsonSelect(collection);
	       } catch(Exception var9) {
	           var9.printStackTrace();
	       } finally {
	           db.close();
	       }
	       return jsonResult;
	   }

	   /** 
	   *<p>Execute a query on Document format.
	   *@param env Environment where application is geing run, i.e TEST.
	   *@param mDataBase Mongo database name.
	   *@param collection Collection name where query will be executed.
	   *@param mQuery List of document with all the query information.
	   *@return A Json Object with the result of the query.
	   *@throws Exception
	   * */
	   public static JSONObject executeSelect(String env, String mDataBase, String collection, List<Document> mQuery) {
	       MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	       JSONObject jsonResult = new JSONObject();
	       try {
	           jsonResult = db.executeSelect(collection, mQuery);
	       } catch(Exception var9) {
	           var9.printStackTrace();
	       } finally {
	           db.close();
	       }
	       return jsonResult;
	   }
	   
	   public static String executeRandomSelectIDUser(String env, String mDataBase, String collection, String field, String filter) {
	       MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	       Random r = new Random();
	       JSONArray randomSelect;
	       JSONObject jjo;
	       String res = "";
	       try {
	           randomSelect = db.executeQueryRandom(collection, field, filter);
	           int ind = r.nextInt(randomSelect.length() + 1);
	           jjo = randomSelect.getJSONObject(ind);
	           res = jjo.getJSONObject("_id").getString("$oid").toString();
	       } catch(Exception var9) {
	           var9.printStackTrace();
	       } finally {
	           db.close();
	       }
	       return res;
	   }
}
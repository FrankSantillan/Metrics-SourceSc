package com.globalClasses;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.json.JSONArray;
import org.json.JSONObject;

public class MongoDBUtils {
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
	   
	   public static String executeDelete(String env, String mDataBase, String collection) {
	       MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	       String singleField = "";
	       try {
	           singleField = db.executeDelete(collection);
	       } catch(Exception e) {
	           e.printStackTrace();
	       } finally {
	           db.close();
	       }
	       return singleField;
	   }
	   

	    /** 
	   *<p>Execute a single select of a query on SQL or Mongo style.
	   *@param env Environment, i.e TEST.
	   *@param mDataBase Database name.
	   *@param query Query that will be counted on SQL style Mongo.
	   *@return A single record.
	   *@throws Exception
	   * */
	   public static String executeSelectSingle(String env, String mDataBase, String query) {
	       MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	       String singleField = "";
	       try {
	           singleField = db.executeSelectSingle(query);
	       } catch(Exception e) {
	           e.printStackTrace();
	       } finally {
	           db.close();
	       }
	       return singleField;
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
	    	   System.out.println("catch");
	           var9.printStackTrace();
	       } finally {
	           db.close();
	       }
	       return randomSelect;
	   }
	   /*
	   public static String executeSelectByFields(String env, String mDataBase, String collection, String firstName, String lastName, String phone) {
	       MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	       String querySelect = "";
	       try {
	    	   System.out.println("-----Executing searh by fields     ");
	    	   querySelect = db.executeSelectByFields(collection, firstName, lastName, phone);	    	   
	       } catch(Exception var9) {
	           var9.printStackTrace();
	       } finally {
	           db.close();
	       }
	       System.out.println("return result");
	       return querySelect;
	   }*/
	   
	   public static boolean executeSelectByFields(String env, String mDataBase, String collection, String id, String name, String tech, boolean active, boolean isbacklog, LocalDate startDate, LocalDate endDate) {
	       MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	       boolean bool;
	       try {
	    	   bool = db.executeSelectByFields(collection, id, name,tech, active, isbacklog, startDate, endDate);	    	   
	       } catch(Exception var9) {
	           var9.printStackTrace();
	           bool = false;
	       } finally {
	           db.close();    
	       }
	       return bool;
	   }
	   
	   public static boolean compareHP(String env, String mDataBase, String collection, String id, JSONObject object) {
	       MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	       boolean bool;
	       try {
	    	   bool = db.compareHP(collection, id, object);	    	   
	       } catch(Exception var9) {
	           var9.printStackTrace();
	           bool = false;
	       } finally {
	           db.close();    
	       }
	       return bool;
	   }
	   
	   public static boolean ExecuteGet(String env, String mDataBase, String collection, String id, JSONObject object) {
	       MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	       boolean bool;
	       try {
	    	   bool = db.executeGET(collection, id, object);	    	   
	       } catch(Exception var9) {
	           var9.printStackTrace();
	           bool = false;
	       } finally {
	           db.close();    
	       }
	       return bool;
	   }
	   
	   public static boolean executeSelectENull(String env, String mDataBase, String collection, String id, String name, String tech, boolean active, boolean isbacklog, LocalDate startDate, LocalDate endDate) {
	       MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	       boolean bool;
	       try {
	    	   bool = db.executeSelectENull(collection, id, name,tech, active, isbacklog, startDate, endDate);	    	   
	       } catch(Exception var9) {
	           var9.printStackTrace();
	           bool = false;
	       } finally {
	           db.close();    
	       }
	       return bool;
	   }
	   
	   public static boolean compareNulls(String env, String mDataBase, String collection, String id, String name, String tech, boolean active, boolean isbacklog, LocalDate startDate, LocalDate endDate) {
	       MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	       boolean bool;
	       try {
	    	   bool = db.compareNulls(collection, id, name,tech, active, isbacklog, startDate, endDate);	    	   
	       } catch(Exception var9) {
	           var9.printStackTrace();
	           bool = false;
	       } finally {
	           db.close();    
	       }
	       return bool;
	   }
	   
	   public static boolean executeSelectByFields2(String env, String mDataBase, String collection, String name, String tech, boolean active, boolean isbacklog, LocalDate startDate, LocalDate endDate) {
	       MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	       boolean bool;
	       try {
	    	   bool = db.executeSelectByFields2(collection, name,tech, active, isbacklog, startDate, endDate);    	   
	       } catch(Exception var9) {
	           var9.printStackTrace();
	           bool = false;
	       } finally {
	           db.close();    
	       }
	       return bool;
	   }
	      
	   
	   
	   public static String executeSelectByID(String env, String mDataBase, String collection, String id) {
	       MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	       String querySelect = "";
	       try {
	    	   System.out.println("-----Executing search by id  ");
	    	   querySelect = db.executeSelectByID(collection, id);	    	   
	       } catch(Exception var9) {
	           var9.printStackTrace();
	       } finally {
	           db.close();
	       }
	       System.out.println("return result");
	       return querySelect;
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
	   
	   
	   
	   
	   
	   
	   
	   
	   /// MY METHODS
	   
	   public static LocalDate executeRandomSelectDate(String env, String mDataBase, String collection, String field) {
	       MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	       LocalDate randomSelect = null ;
	       try {
	           randomSelect = db.executeRandomSelectDate(collection, field);
	       } catch(Exception var9) {
	           var9.printStackTrace();
	       } finally {
	           db.close();
	       }
	       return randomSelect;
	   }
	   
	   
	   public static String executeRandomSelectJson(String env, String mDataBase, String collection) {
	       MongoDBConnection db = new MongoDBConnection(env, mDataBase);
	       String randomSelect = "";
	       try {
	           randomSelect = db.executeRandomSelectJson(collection);
	       } catch(Exception var9) {
	    	   System.out.println("catch");
	           var9.printStackTrace();
	       } finally {
	           db.close();
	       }
	       return randomSelect;
	   }
	   
	   //espindola
	   
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
	   
	   public static String executeRandomSelectIDUser(String env, String mDataBase, String collection, String field, String filter) {
           MongoDBConnection db = new MongoDBConnection(env, mDataBase);
           JSONObject json = new JSONObject();
           JSONArray querySelect = new JSONArray();
           String dat = "";
           try {
               querySelect = db.executeQueryRandomSelectID(collection, field, filter);
               json = querySelect.getJSONObject(0);
               dat = json.getJSONObject("_id").get("$oid").toString();
           } catch(Exception var9) {
               var9.printStackTrace();
           } finally {
               db.close();
           }
           System.out.println("return result");
           return dat;
       }
	   
}
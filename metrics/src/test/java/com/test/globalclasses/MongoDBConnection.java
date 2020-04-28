package com.test.globalclasses;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Projections.excludeId;
import static com.mongodb.client.model.Projections.fields;
import static com.mongodb.client.model.Projections.include;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.Binary;
import org.bson.types.ObjectId;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.experimental.categories.IncludeCategories;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.Bytes;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Indexes;
import com.mongodb.client.model.Projections;

public class MongoDBConnection {
	private static MongoClient mClient;
    private static MongoDatabase mDataBase;
    private String fields, collection, conditions, elmMatch;
    List<Bson> filters, elmMatchFilters;
    JSONObject resultJson;
    List<JSONObject> resultList;
    boolean all, hasFilters, hasElemMatch;
    Gson gson;

    public MongoDBConnection(String env, String db) {
        Properties prop = new Properties();
        String propFileName = "config.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

        try {
            if(inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
            String uriString = prop.getProperty(env + "." + db);
            getMongoClient(uriString);
            mDataBase = getDB(db);
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Failed to make connection!");
        }
    }
    
    public String executeSelectSingle(String query, String coll) {
        String value = "1212323123123";
        if(query.matches("select(.*?)from(.*?)")) {
            parseQuery(query);
            System.out.println(query + "	22222222222222222222222222222222222222222222222222222222222222222222");
 
        } else {
            parseQuery2(query);
            System.out.println(query + " 1111111111111111111111111111111111111111111111111111111111111111111111");
        }
        System.out.println(coll + "  9999999999999999999999999999999999999999999999999999999999999999999999");
        //MongoCollection<Document> collection = mDataBase.getCollection(this.collection);
        MongoCollection<Document> collection = mDataBase.getCollection(coll);
        //DBCursor cursor = collection.find(eq(query, query));
        System.out.println(mDataBase.getCollection(this.collection)+ "	6666666666666666666666666666666666");
        System.out.println(collection + "	888888888888888888888888888888888888888888");
        List<String> fields = Arrays.asList(this.fields.split("\\s*,\\s*"));
        System.out.println(fields + " holaaaaaaaaaaaaaaaaaaaaaaa");
        hasFilters = filters.isEmpty();
        System.out.println("00000000000000000000000" + elmMatchFilters + elmMatch + hasFilters);
        hasElemMatch = elmMatchFilters.isEmpty();
        System.out.println(hasElemMatch + "	5555555555555555555555555555555555555555555555555555");
        Document doc = (hasFilters ? hasElemMatch ? collection.find() : collection.find(Projections.elemMatch(elmMatch, Filters.and(elmMatchFilters))) : collection.find(Filters.and(filters))).projection(fields(include(fields))).first();
        System.out.println(value + doc + "	4444444444444444444444444444444444444" + collection.find(Projections.elemMatch(elmMatch, Filters.and(elmMatchFilters))));
        value = doc.get(fields).toString();
        System.out.println("hola1111111111111111111111111111111" + value);
        return value;
    }


    private MongoClient getMongoClient(String uriString) {
        if(mClient == null) {
            mClient = new MongoClient(new MongoClientURI(uriString));
        }
        return mClient;
    }

    private MongoDatabase getDB(String db) {
        return mClient.getDatabase(db);
    }
    
    public String executeDelete(String collection) {
    	MongoCollection<Document> coll = mDataBase.getCollection(collection);	
    	coll.deleteMany(eq("firstName", "PickMan"));
    	coll.deleteMany(eq("firstName", "Jhon"));
    	return "OK";
    }

    private void parseQuery(String query) {
    	System.out.println("--------------parse query -----"+ query);
        fields = query.replaceAll("select\\s(.*?)\\sfrom.*", "%1");
        System.out.println("-------field into parseQuery   "+ fields);
        collection = query.replaceAll(".*from\\s(.*?)($|\\swhere).*", "%1");
        System.out.println("-------collection into parseQuery   "+ collection);
        Matcher m = Pattern.compile("(and\\s|where\\s)(.*?)(\\s|)(.*?)($|\\s)").matcher(query);
        String condition;
        elmMatchFilters = new ArrayList<Bson>();// Original line: elmMatchFilters = new ArrayList<>();
        filters = new ArrayList<Bson>(); // Original line: filters = new ArrayList<>();
        while (m.find()) {
            condition = m.group().replaceAll("(and\\s|where\\s)(.*?)(\\s|)=(\\s|)(.*?)($|\\s)", "$2=$5");
            System.out.println("condition   "+ condition);
            String[] conVal = condition.split("\\=");
            System.out.println("conVal  "+ conVal);
            addToFilters(conVal[0], conVal[1]);
        }
    }

    private void parseQuery2(String query) {
        if(query.matches(".*find\\(\\{(.*?)},\\{(.*?)}\\).*")) {
            fields = query.replaceAll(".*find\\(\\{(.*?)},\\{(.*?)}\\).*", "$2").replaceAll("\\s+", "");
        } else {
            fields = "";
        }

        if(query.matches(".*find\\(\\{(.*?)}(,|\\)).*")) {
            conditions = query.replaceAll(".*find\\(\\{(.*?)}(,|\\)).*", "$1");
        } else {
            conditions = "";
        }

        collection = query.replaceAll(".*Collection\\('(.*?)'\\)", "$1");
        elmMatchFilters = new ArrayList<Bson>();// Original line: elmMatchFilters = new ArrayList<>();
        filters = new ArrayList<Bson>(); // Original line: filters = new ArrayList<>();

        if(!conditions.equals("")) {
            String[] arrConditions = conditions.split(",");
            String[] conVal;
            String[] elmMatchA;
            for(String condition : arrConditions) {
                conVal = condition.split(":");
                conVal[0] = conVal[0].replaceAll("\"", "");
                if(conVal[0].contains(".")) {
                    elmMatchA = conVal[0].split("\\.");
                    elmMatch = elmMatchA[0];
                    addToElmMatch(elmMatchA[1], conVal[1]);
                } else {
                    addToFilters(conVal[0], conVal[1]);
                }
            }
        }

        if(!fields.equals("")) {
            String[] arrFields = fields.split(",");
            fields = "";
            String[] fieldVal;
            for(String field : arrFields) {
                fieldVal = field.split(":");
                fieldVal[0] = fieldVal[0].replaceAll("\"", "").replaceAll("\\'", "");
                fieldVal[1] = fieldVal[1].replaceAll("\"", "");
                if(fieldVal[1].equals("1")) {
                    fields = fields + (fields.equals("") ? "" : ",") + fieldVal[0];
                }
            }
        }
    }

    public void addToFilters(String con, String val) {
    	System.out.println("--addToFilter start  con "+con+ " val "+ val);
        if(val.matches("^\".*?\"$")) {
            val = val.replaceAll("\"", "");
            System.out.println(" --val if matches "+ val);
            filters.add(Filters.eq(con, val));
        } else if(val.matches(".*?(\\w{8}-\\w{4}-\\w{4}-\\w{12}).*?$")) {
        	
            String encoding = "J";
            if(val.contains("LUUID")) {
                encoding = "L";
            }
            val = val.replaceAll(".*?(\\w{8}-\\w{4}-\\w{4}-\\w{12}).*?$", "$1");
            UUID originalUUID = UUID.fromString(val);
            byte[] bytes = new byte[16];
            ByteBuffer bb = ByteBuffer.wrap(bytes);
            bb.order(ByteOrder.LITTLE_ENDIAN);
            bb.putLong(originalUUID.getMostSignificantBits());
            bb.putLong(originalUUID.getLeastSignificantBits());
            if(encoding.equals("L")) {
                filters.add(Filters.eq(con, legacyToBinaryUUID(originalUUID)));
            } else {
                filters.add(Filters.eq(con, javaToBinaryUUID(originalUUID)));
            }
        } else if(val.matches("^.*?\\..*?$")) {
        	System.out.println("**----*-*-*-*-*-2");
            filters.add(Filters.eq(con, Double.parseDouble(val)));
        } else if(val.matches("(?<=\\s|^)\\d+(?=\\s|$)")) {
            filters.add(Filters.eq(con, Integer.parseInt(val)));
            System.out.println("**----*-*-*-*-*-3");
        } else {
            filters.add(Filters.eq(con, val));
            System.out.println("**----*-*-*-*-*-*4");
        }
        
        System.out.println("--addToFilter end  con "+con+ " val "+ val);
        System.out.println("--fielters "+filters);
    }

    public void addToElmMatch(String con, String val) {
        if(val.matches("^\".*?\"$")) {
            val = val.replaceAll("\"", "");
            elmMatchFilters.add(Filters.eq(con, val));
        } else if(val.matches(".*?(\\w{8}-\\w{4}-\\w{4}-\\w{12}).*?$")) {
            String encoding = "J";
            if(val.contains("LUUID")) {
                encoding = "L";
            }
            val = val.replaceAll(".*?(\\w{8}-\\w{4}-\\w{4}-\\w{12}).*?$", "$1");
            UUID originalUUID = UUID.fromString(val);
            byte[] bytes = new byte[16];
            ByteBuffer bb = ByteBuffer.wrap(bytes);
            bb.order(ByteOrder.LITTLE_ENDIAN);
            bb.putLong(originalUUID.getMostSignificantBits());
            bb.putLong(originalUUID.getLeastSignificantBits());
            if(encoding.equals("L")) {
                elmMatchFilters.add(Filters.eq(con, legacyToBinaryUUID(originalUUID)));
            } else {
                elmMatchFilters.add(Filters.eq(con, javaToBinaryUUID(originalUUID)));
            }
        } else if(val.matches("^.*?\\..*?$")) {
            elmMatchFilters.add(Filters.eq(con, Double.parseDouble(val)));
        } else if(val.matches("(?<=\\s|^)\\d+(?=\\s|$)")) {
            elmMatchFilters.add(Filters.eq(con, Integer.parseInt(val)));
        } else {
            elmMatchFilters.add(Filters.eq(con, val));
        }
    }

    public void close() {
        try {
            if(mClient != null) {
                mClient.close();
                mClient = null;
            }
        } catch(Exception e) {
            e.getMessage();
        }
    }

    public long executeSelectCount(String query) throws JSONException {
        if(query.matches("select(.*?)from(.*?)")) {
            parseQuery(query);
            all = this.fields.equals("*");
        } else {
            parseQuery2(query);
            all = this.fields.equals("");
        }

        MongoCollection<Document> collection = mDataBase.getCollection(this.collection);
        hasFilters = filters.isEmpty();
        hasElemMatch = elmMatchFilters.isEmpty();
        return (hasFilters ? hasElemMatch ? collection.countDocuments() : collection.countDocuments(Projections.elemMatch(elmMatch, Filters.and(elmMatchFilters))) : collection.countDocuments(Filters.and(filters)));
    }

    public String executeSelectSingle(String query) {
    	System.out.println("-----query " + query);
        String value = "";
        if(query.matches("select(.*?)from(.*?)")) {
        	System.out.println("---------------parseQuery  ");
            parseQuery(query);            
        } else {
        	System.out.println("---------------parseQuery 2 ");
            parseQuery2(query);            
        }
        
        
        System.out.println("-000000000000000000---if passed and watch collection  "+this.collection+ "  field "+ this.fields +" field sin this "+fields);
        
        MongoCollection<Document> collection = mDataBase.getCollection(this.collection);
        List<String> fields = Arrays.asList(this.fields.split("\\s*,\\s*"));
        System.out.println("--fields "+ fields+ "--collection "+collection);
        hasElemMatch = elmMatchFilters.isEmpty();
        System.out.println("--hasfilter: "+hasFilters + "--hashelement: "+hasElemMatch +" elmMatch:"+this.elmMatch +" elmMatchFilters: "+this.elmMatchFilters);
        //Document doc = (hasFilters ? hasElemMatch ? collection.find() : collection.find(Projections.elemMatch(this.elmMatch, Filters.and(this.elmMatchFilters))) : collection.find(Filters.and(this.filters))).projection(fields(include(this.fields))).first();
        Document doc = (hasFilters ? hasElemMatch ? collection.find() : collection.find(Projections.elemMatch(elmMatch, Filters.and(elmMatchFilters))) : collection.find(Filters.and(filters))).projection(fields(include(fields))).first();
        System.out.println("--doc   "+doc);
        System.out.println("----------fields "+this.fields + "value"+value);
        value = doc.get(this.fields).toString();
        System.out.println("--value "+ value);
        return value;
    }

    public JSONObject executeSelectJson(String query, boolean excludeId) {
        if(query.matches("select(.*?)from(.*?)")) {
            parseQuery(query);
            all = this.fields.equals("*");
        } else {
            parseQuery2(query);
            all = this.fields.equals("");
        }
        MongoCollection<Document> collection = mDataBase.getCollection(this.collection);
        Document doc;
        hasFilters = filters.isEmpty();
        hasElemMatch = elmMatchFilters.isEmpty();

        if(excludeId) {
            doc = (hasFilters ? hasElemMatch ? collection.find() : collection.find(Projections.elemMatch(elmMatch, Filters.and(elmMatchFilters))) : collection.find(Filters.and(filters))).projection(fields(all ? include() : include(fields), excludeId())).first();
        } else {
            doc = (hasFilters ? hasElemMatch ? collection.find() : collection.find(Projections.elemMatch(elmMatch, Filters.and(elmMatchFilters))) : collection.find(Filters.and(filters))).projection(fields(all ? include() : include(fields), include())).first();
        }

        try{
            gson = new Gson();
            resultJson = new JSONObject(gson.toJson(doc));
        } catch(Exception e) {
            e.printStackTrace();
        }
        return resultJson;
    }

    public List<JSONObject> executeSelectJsonList(String query, boolean excludeId) throws JSONException {
        if(query.matches("select(.*?)from(.*?)")) {
            parseQuery(query);
            all = this.fields.equals("*");
        } else {
            parseQuery2(query);
            all = this.fields.equals("");
        }
        resultList = new ArrayList<JSONObject>();
        MongoCollection<Document> collection = mDataBase.getCollection(this.collection);
        List<String> fields = Arrays.asList(this.fields.split("\\s*,\\s*"));
        FindIterable<Document> docs;
        hasFilters = filters.isEmpty();
        hasElemMatch = elmMatchFilters.isEmpty();
        if(excludeId) {
            docs = (hasFilters ? hasElemMatch ? collection.find() : collection.find(Projections.elemMatch(elmMatch, Filters.and(elmMatchFilters))) : collection.find(Filters.and(filters))).projection(fields(all ? include() : include(fields), excludeId()));
        } else {
            docs = (hasFilters ? hasElemMatch ? collection.find() : collection.find(Projections.elemMatch(elmMatch, Filters.and(elmMatchFilters))) : collection.find(Filters.and(filters))).projection(fields(all ? include() : include(fields)));
        }

        try{
            for(Document doc : docs) {
                resultJson = new JSONObject(doc.toJson());
                JSONObject js = new JSONObject(doc.toJson());
                Iterator<?> iter = js.keys();
                while(iter.hasNext()) {
                    String key = (String) iter.next();
                    resultJson.put(key, doc.get(key));
                }
                resultList.add(resultJson);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return resultList;
    }

    public String executeRandomSelect(String collection, String field) {
    	String randomResult = "";
    	System.out.println("------------field" + field);
    	System.out.println("------------collection" + collection);
        MongoCollection<Document> coll = mDataBase.getCollection(collection);
        //MongoCollection<Document> coll = mDataBase.getCollection(this.collection);
        AggregateIterable<Document> output = coll.aggregate(Arrays.asList(Aggregates.sample(1)));
                
        for(Document dbObject : output) {
            if(dbObject.containsKey(field)) {
                randomResult = dbObject.get(field).toString();
            }
        }
        return randomResult;
    }

    public String executeRandomSelectID(String collection, String field) {
    	String randomResult = "";
    	System.out.println("------------field" + field);
    	System.out.println("------------collection" + collection);
        MongoCollection<Document> coll = mDataBase.getCollection(collection);
        //MongoCollection<Document> coll = mDataBase.getCollection(this.collection);
        AggregateIterable<Document> output = coll.aggregate(Arrays.asList(Aggregates.sample(1)));
                
        for(Document dbObject : output) {
            if(dbObject.containsKey(field)) {
                randomResult = dbObject.get(field).toString();
            }
        }
        return randomResult;
    }
    Block<Document> printBlock = new Block<Document>() {
        @Override
        public void  apply(final Document document) {
        	System.out.println("-----document length: "+document.toJson().length());
            System.out.println("----------- Result: "+ document.toJson());
	
        }
    };
    
    public boolean executeSelectByFields(String collection, String role) {
    	boolean ban = false;
    	System.out.println("------------Collection selected to search : " + collection);
    	MongoCollection<Document> coll = mDataBase.getCollection(collection);	
    	//busca todos los documentos 
    	//FindIterable<Document> findIterable = coll.find(new Document());
    	//busca con filtros
    	//FindIterable<Document> findIterable = coll.find(new Document("firstName", "Mike"));
    	FindIterable<Document> findIterable = coll.find(Document.parse("{role: '" + role +"'}"));

    	
    	for (Document document : findIterable) {
    		ban = true;
    		System.out.println("----------- Result: "+ document.toJson());
        }
    	//findIterable.forEach(printBlock);
        return ban;  
    }
    
    public boolean executeSelectByFields2(String collection, String firstName, String lastName, String phone) {
    	boolean ban = false;
    	System.out.println("------------Collection selected to search : " + collection);
    	MongoCollection<Document> coll = mDataBase.getCollection(collection);	
    	//busca todos los documentos 
    	//FindIterable<Document> findIterable = coll.find(new Document());
    	//busca con filtros
    	//FindIterable<Document> findIterable = coll.find(new Document("firstName", "Mike"));
    	FindIterable<Document> findIterable = coll.find(Document.parse("{firstName : '"+firstName+"' , lastName: '"+lastName+"' , phone:'"+phone+"'}"));


    	for (Document document : findIterable) {
    		ban = true;
    		System.out.println("----------- Result: "+ document.toJson());
        }
    	//findIterable.forEach(printBlock);
        return ban;  
    }
    
    public String executeSelectByID(String collection, String id) {

    	boolean ban = false;
    	
    	System.out.println("------------Collection selected to search : " + collection);
    	MongoCollection<Document> coll = mDataBase.getCollection(collection);	
    	//busca todos los documentos 
    	//FindIterable<Document> findIterable = coll.find(new Document());
    	//busca con filtros
    	//FindIterable<Document> findIterable = coll.find(new Document("firstName", "Mike"));
    	FindIterable<Document> findIterable = coll.find(Document.parse("{_id : '"+id+"' }"));

    	
    	for (Document document : findIterable) {
    		ban = true;
    		System.out.println("----------- Result: "+ document.toJson());
        }
    	
    	//findIterable.forEach(printBlock);

        assert ban == true: "Scenario fail";
        if(ban == true) {
        	return "Found " ;
        }else {
        	return "Not fount";
        }
        
    }
    
    public JSONArray executeQuerySelect(String collection, String field, String filter) {
        JSONObject json = new JSONObject();
        JSONArray resultJ = new JSONArray();
        
        System.out.println("------------field" + field);
        System.out.println("------------collection" + collection);
        
        MongoCollection<Document> coll = mDataBase.getCollection(collection);
        AggregateIterable<Document> output = coll.aggregate(Arrays.asList(Aggregates.sample(1)));
        
        System.out.println("----- for start  " );
        System.out.println("_______________________________________________");
       try (MongoCursor<Document> cursor = coll.find(Filters.eq(field, filter)).iterator()){
    	   while(cursor.hasNext()) {
    		   resultJ.put(json = new JSONObject(cursor.next().toJson()));
    		   System.out.println(resultJ);
    	    }
       }
            return resultJ;
    }
    
    public JSONArray executeQuerySelectID(String collection, String field, String filter) {
        JSONObject json = new JSONObject();
        JSONArray resultJ = new JSONArray();

        MongoCollection<Document> coll = mDataBase.getCollection(collection);
        AggregateIterable<Document> output = coll.aggregate(Arrays.asList(Aggregates.sample(1)));
       try (MongoCursor<Document> cursor = coll.find(Filters.eq(field, new ObjectId(filter))).iterator()){
    	   while(cursor.hasNext()) {
    		   resultJ.put(json = new JSONObject(cursor.next().toJson()));
    	    }
       }
            return resultJ;
    }
    
    
	   public String executeRandomSelectD(String collection, String field1, String field2, String field3, String field4, String field5, String field6, String field7) {
	        String randomResult = "";
	        MongoCollection<Document> coll = mDataBase.getCollection(collection);
	        AggregateIterable<Document> output = coll.aggregate(Arrays.asList(Aggregates.sample(1)));
	        for(Document dbObject : output) {
	            if((dbObject.containsKey(field1))&(dbObject.containsKey(field2))&(dbObject.containsKey(field3))&(dbObject.containsKey(field4))) {
	                randomResult = dbObject.get(field1).toString() + "," + dbObject.get(field2).toString() + "," + dbObject.get(field3).toString() + "," + dbObject.get(field4).toString() + "," + dbObject.get(field5).toString()
	                		+ "," + dbObject.get(field6).toString() + "," + dbObject.get(field7).toString();
	            }
	        }
	        return randomResult;
	    }
    
    
    /*
    public String executeQuerySelect(String collection, String field, String filter) {
    	String randomResult = "";
    	String result = "";
    	boolean ban = false;
    	System.out.println("------------field" + field);
    	System.out.println("------------collection" + collection);
        MongoCollection<Document> coll = mDataBase.getCollection(collection);
        //MongoCollection<Document> coll = mDataBase.getCollection(this.collection);
        AggregateIterable<Document> output = coll.aggregate(Arrays.asList(Aggregates.sample(1)));
        System.out.println("----- for start  " );
        //coll.find().forEach(printBlock);
        System.out.println("_______________________________________________");

       coll.find(new Document(field, "")).forEach(printBlock);
        
        if(ban == true) {
        	
        	return result;
        }else {
        	return "not match";
        }
        
    }*/


	public JSONObject executeRandomJsonSelect(String collection) {
        MongoCollection<Document> coll = mDataBase.getCollection(this.collection);
        AggregateIterable<Document> output = coll.aggregate(Arrays.asList(Aggregates.sample(1)));
        resultJson = new JSONObject();
        for(Document dbObject : output) {
            try {
                gson = new Gson();
                resultJson = new JSONObject(gson.toJson(dbObject));
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        return resultJson;
    }

    public static Binary legacyToBinaryUUID(java.util.UUID uuid) {
        long msb = uuid.getMostSignificantBits();
        long lsb = uuid.getLeastSignificantBits();

        byte[] uuidBytes = new byte[16];

        for(int i = 15; i >= 0; i--) {
            uuidBytes[i] = (byte) (lsb & 0xFFL);
            lsb >>= 8;
        }

        for(int i = 7; i >= 0; i--) {
            uuidBytes[i] = (byte) (msb & 0xFFL);
            msb >>= 8;
        }

        return new Binary((byte) 0x03, uuidBytes);
    }

    public static Binary javaToBinaryUUID(java.util.UUID uuid) {
        byte[] bytes = new byte[16];
        ByteBuffer bb = ByteBuffer.wrap(bytes);
        bb.order(ByteOrder.LITTLE_ENDIAN);
        bb.putLong(uuid.getMostSignificantBits());
        bb.putLong(uuid.getLeastSignificantBits());

        return new Binary(Bytes.B_UUID, bb.array());
    }

    public static UUID formStandardBinaryUUID(byte[] uuidBytes) {
        long msb = 0;
        long lsb = 0;
        for(int i = 8; i < 16; i++) {
            lsb <<= 8;
            lsb |= uuidBytes[i] & 0xFFL;
        }

        for(int i = 0; i < 8; i++) {
            msb <<= 8;
            msb |= uuidBytes[i] & 0xFFL;
        }

        return new UUID(msb, lsb);
    }

    public JSONObject executeSelect(String collection, List<Document> mQuery) {
        JSONObject result = new JSONObject();
        MongoCollection<Document> coll = mDataBase.getCollection(this.collection);
        AggregateIterable<Document> output = coll.aggregate(mQuery);
        for(Document dbObject : output) {
            try {
                gson = new Gson();
                result = new JSONObject(gson.toJson(dbObject));
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
    //New method Espindola
    public String executeRandomSelectIDUser(String collection, String field) {
    	String randomResult = "";
    	System.out.println("------------field" + field);
    	System.out.println("------------collection" + collection);
        MongoCollection<Document> coll = mDataBase.getCollection(collection);
        //MongoCollection<Document> coll = mDataBase.getCollection(this.collection);
        AggregateIterable<Document> output = coll.aggregate(Arrays.asList(Aggregates.sample(1)));
                
        for(Document dbObject : output) {
            if(dbObject.containsKey(field)) {
                randomResult = dbObject.get(field).toString();
                System.out.println(dbObject);
            }
        }
        return randomResult;
    }
    
    public JSONArray executeQueryRandom(String collection, String field, String filter) {
        JSONObject json = new JSONObject();
        JSONArray resultJ = new JSONArray();
        
        System.out.println("------------field" + field);
        System.out.println("------------collection" + collection);
        
        MongoCollection<Document> coll = mDataBase.getCollection(collection);
        
        System.out.println("----- for start  " );
        System.out.println("_______________________________________________");
       try (MongoCursor<Document> cursor = coll.find(Filters.and(Filters.eq(field, filter), Filters.eq("status", "Active"))).iterator()){
    	   while(cursor.hasNext()) {
    		   resultJ.put(json = new JSONObject(cursor.next().toJson()));
    	    }
       }
            return resultJ;
    }
}
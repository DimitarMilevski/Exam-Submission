package algorithm;


import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class ConnectMongoDb {
	MongoDatabase mdb = null;
	public MongoDatabase connectMongo(String databaseName){
		MongoClient mClient = new MongoClient();
		mdb = mClient.getDatabase(databaseName);
		return mdb;
	}
	public void insert(String sortType ,  long ExecutionTime){
		MongoCollection mCollection = mdb.getCollection("test");
		Document doc = new Document().append(sortType, ExecutionTime);
		mCollection.insertOne(doc); 
	}

}

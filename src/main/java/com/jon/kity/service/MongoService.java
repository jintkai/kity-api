package com.jon.kity.service;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.stereotype.Service;

@Service
public class MongoService {

    private MongoClient mongoClient;
    private MongoDatabase mongoDatabase;

    public MongoService() {
        try {
            this.mongoClient = new MongoClient("localhost", 27017);
            mongoDatabase = this.mongoClient.getDatabase("kity");
            System.out.println("Connect to database successfully");
            MongoCollection collection = mongoDatabase.getCollection("kityminder");
            System.out.println("选择集合成功");
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ":" + e.getMessage());
        }
    }

    public void getDocument() {
        try {
            MongoCollection collection = mongoDatabase.getCollection("kityminder");
            FindIterable<Document> findIterable = collection.find();
            MongoCursor<Document> mongoCursor = findIterable.iterator();
            while (mongoCursor.hasNext()) {
                System.out.println(mongoCursor.next());
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    public void insertDocument(String colName, String json) {
        try {
            MongoCollection collection = mongoDatabase.getCollection(colName);
            Document document = new Document();
            document = Document.parse(json);
            collection.insertOne(document);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }

    }

}

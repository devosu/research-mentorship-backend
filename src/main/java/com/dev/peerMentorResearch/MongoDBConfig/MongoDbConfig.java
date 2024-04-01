package com.dev.peerMentorResearch.MongoDBConfig;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.bson.Document;


@Configuration
public class MongoDbConfig {



    
    //environment variable being used to store connection string
     @Value("${MONGODB_CONNECTION_STRING}")
    private String mongoConnectionString;

    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create(mongoConnectionString);
    }
    @Bean
    public MongoDatabase mongoDatabase() {
        return mongoClient().getDatabase("data");
    }
    
    @Bean
    public MongoCollection<Document> mongoCollection() {
        MongoDatabase database = mongoDatabase();
        return database.getCollection("applicationForms");
    }
    


}

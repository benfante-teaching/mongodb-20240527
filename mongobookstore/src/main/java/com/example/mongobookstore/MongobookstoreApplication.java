package com.example.mongobookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;

@SpringBootApplication
public class MongobookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongobookstoreApplication.class, args);
	}

	@Bean
    MongoTransactionManager transactionManager(MongoDatabaseFactory dbFactory) {  
        return new MongoTransactionManager(dbFactory);
    }
}

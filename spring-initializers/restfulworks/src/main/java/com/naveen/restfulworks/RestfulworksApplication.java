package com.naveen.restfulworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication

public class RestfulworksApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulworksApplication.class, args);
	}


}

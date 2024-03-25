package com.naveen.discoverservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication

public class DiscoverService1Application {

	public static void main(String[] args) {
		SpringApplication.run(DiscoverService1Application.class, args);
	}

}

package org.gemography.backendchallend;

import org.gemography.backendchallend.configs.DateGenerator;
import org.gemography.backendchallend.services.ServiceHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import ch.qos.logback.classic.pattern.DateConverter;

@SpringBootApplication
@EnableFeignClients
public class BackendChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendChallengeApplication.class, args);
		System.out.println("it's done");
		System.out.println("\n******************************\n");
		
	
	}
	

}

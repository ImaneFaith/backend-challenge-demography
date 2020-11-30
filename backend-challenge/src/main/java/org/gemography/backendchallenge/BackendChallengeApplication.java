package org.gemography.backendchallenge;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//start app
@SpringBootApplication
@EnableFeignClients
public class BackendChallengeApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(BackendChallengeApplication.class, args);
		
	}
	

}

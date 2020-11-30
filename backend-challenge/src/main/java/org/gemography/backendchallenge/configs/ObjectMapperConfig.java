package org.gemography.backendchallenge.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

//used for json/ object serialization
@Configuration
public class ObjectMapperConfig {
	
	@Bean
	public ObjectMapper mapper() {
		ObjectMapper mapper = new ObjectMapper();
		return mapper;
	}
	
}

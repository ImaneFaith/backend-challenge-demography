package org.gemography.backendchallenge.services;

import org.gemography.backendchallenge.configs.DateGenerator;
import org.gemography.backendchallenge.configs.ServiceHelperConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.fasterxml.jackson.databind.util.JSONPObject;



@FeignClient(name="repositories",url = "https://api.github.com/search/repositories",configuration = ServiceHelperConfig.class)
public interface  ServiceHelper {
	
	@GetMapping(path = "?q=created:>{date}&sort=stars&order=desc",produces=MediaType.APPLICATION_JSON_VALUE)
	 String getRepositories(@PathVariable("date") String date);

	
	

}

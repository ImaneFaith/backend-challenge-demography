package org.gemography.backendchallenge.services;

import org.gemography.backendchallenge.configs.DateGenerator;
import org.gemography.backendchallenge.configs.ServiceHelperConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.fasterxml.jackson.databind.util.JSONPObject;

//using feign client to send request to github api
@FeignClient(name = "repositories", url = "https://api.github.com/search/repositories", configuration = ServiceHelperConfig.class)
public interface ServiceHelper {

	@GetMapping(path = "?q=created:>{date}&sort=stars&order=desc")
	String getRepositories(@PathVariable("date") String date);

}

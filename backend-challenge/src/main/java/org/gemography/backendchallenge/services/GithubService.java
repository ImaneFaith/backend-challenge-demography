package org.gemography.backendchallenge.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import javax.ws.rs.QueryParam;

import org.gemography.backendchallenge.configs.DateGenerator;
import org.gemography.backendchallenge.models.GithubRepository;
import org.gemography.backendchallenge.models.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class GithubService {
	
	//use the service helper to connect with the Github API
	ServiceHelper serviceHelper;
	
	@Autowired
	ObjectMapper mapper;
	//use hashet to add unique name language
	HashSet<Language> languagesList = new HashSet<>();
	
	
	public GithubService(ServiceHelper serviceHelper) {
		
		this.serviceHelper = serviceHelper;
		
	}
	
	@GetMapping("/languages")
	HashSet<Language> getRepos(@RequestParam("date") String date)
			throws JsonParseException, JsonMappingException, IOException {
		// read response from the service helper while giving a date, before,
		// converting the date to bring the repositories 30 days before the date given
		JsonNode repos = mapper.readTree(serviceHelper.getRepositories(DateGenerator.convertDate(date)));
		// put the repositories in a list
		List<GithubRepository> repositories = new ArrayList<GithubRepository>();
		repos.get("items").forEach(rep -> {
			if (!(rep.get("language").asText().equals("null"))) {
				languagesList.add(new Language(rep.get("language").toString(), new ArrayList<>(), 0));
				repositories.add(new GithubRepository(rep.get("html_url").toString(), rep.get("full_name").toString(),
						rep.get("language").toString()));

			}
		});
		// affect repository to language using it
		languagesList.forEach(l -> {
			repositories.forEach(rep -> {
				if (l.getName().equals(rep.getLanguage())) {
					l.getRepositories().add(rep);
				}
			});
			l.setNumberRepos(l.getRepositories().size());
		});
		return languagesList;

	}
}

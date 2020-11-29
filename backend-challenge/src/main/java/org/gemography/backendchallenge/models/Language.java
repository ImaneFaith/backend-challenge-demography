package org.gemography.backendchallenge.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Language {
	
	private String name;
	List<GithubRepository> repositories;
	private  int numberRepos;
	public Language(String name) {
		super();
		this.name = name;
	}
}

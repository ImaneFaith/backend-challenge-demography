package org.gemography.backendchallenge.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class GithubRepository {
		
	@JsonProperty("html_url")
		private String url;
		private String full_name;
		@JsonIgnore
		private String language;
		public GithubRepository(String url) {
			super();
			this.url = url;
		}
}

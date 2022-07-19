package com.example.mongo.tutorial; 

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.http.ResponseEntity;


public class Tutorial {

	@Id
	private String id;
	private String title;
	private String description;
	private boolean published;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	public Tutorial() {
		
	}
	
	public String toString() {
		return "Tutorial [id = " + id + ", title="  +title+ ", desc = " + description + ", published "  + published + "]";
	}
	
	 public Tutorial(String title, String description, boolean published) {
		    this.title = title;
		    this.description = description;
		    this.published = published;
	 }

	
	

}

package com.lcwd.user.service.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "micro_user")
public class User {
	
	@Id
	@Column(name = "ID", length = 50 )
	private String userId;
	
	@Column(name = "NAME", length = 20 )
	private String name;
	
	@Column(name = "EMAIL", length = 20 )
	private String email;
	
	@Column(name = "ABOUT", length = 100 )
	private String about;
	
	@Transient
	private List<Rating> ratingsList = new ArrayList<>();

	public String getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getAbout() {
		return about;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public List<Rating> getRatingsList() {
		return ratingsList;
	}

	public void setRatingsList(List<Rating> ratingsList) {
		this.ratingsList = ratingsList;
	}


}

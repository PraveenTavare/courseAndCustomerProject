package com.lcwd.hotel.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "micro_hotels")
public class Hotel {
	
	@Id
	@Column(name = "hotelId", length = 50)
	private String hotelId;
	
	@Column(name = "name", length = 20)
	private String name;
	
	@Column(name = "location", length = 30)
	private String location;
	
	@Column(name = "about", length = 100)
	private String about;

	public String getHotelId() {
		return hotelId;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public String getAbout() {
		return about;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setAbout(String about) {
		this.about = about;
	}

}

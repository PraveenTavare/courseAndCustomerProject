package com.lcwd.rating.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "micro_rating")
public class Rating {
	
	@Id
	@Column(name = "ratingId", length = 50)
	private String ratingId;
	
	@Column(name = "userId", length = 50)
	private String userId;
	
	@Column(name = "hotelId", length = 50)
	private String hotelId;
	
	@Column(name = "about", length = 100)
	private int rating;
	
	@Column(name = "feedabck", length = 100)
	private String feedabck;
	
	public String getRatingId() {
		return ratingId;
	}
	public String getUserId() {
		return userId;
	}
	public String getHotelId() {
		return hotelId;
	}
	public int getRating() {
		return rating;
	}
	public String getFeedabck() {
		return feedabck;
	}
	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public void setFeedabck(String feedabck) {
		this.feedabck = feedabck;
	}
	
	

}

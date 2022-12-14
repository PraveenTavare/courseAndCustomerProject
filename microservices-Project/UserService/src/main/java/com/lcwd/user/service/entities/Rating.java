package com.lcwd.user.service.entities;

public class Rating {
	
	private String ratingId;
	private String userId;
	private String hotelId;
	private int rating;
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

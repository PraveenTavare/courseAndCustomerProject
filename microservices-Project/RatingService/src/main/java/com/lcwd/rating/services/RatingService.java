package com.lcwd.rating.services;

import java.util.List;

import com.lcwd.rating.entities.Rating;

public interface RatingService {

	//Rating Operations
	
	//Create
	Rating create(Rating rating);
	
	//get all user
	List<Rating> getAllRatings();
	
	// get  Rating By UserId
	List<Rating> getRatingByUserId(String userId);
	
	// get Rating By hotelId
	List<Rating> getRatingByHotelId(String hotelId);

}

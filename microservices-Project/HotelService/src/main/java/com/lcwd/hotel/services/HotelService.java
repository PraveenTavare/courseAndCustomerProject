package com.lcwd.hotel.services;

import java.util.List;

import com.lcwd.hotel.entities.Hotel;

public interface HotelService {
	
	//create
	Hotel create(Hotel hotel);
	
	//get all
	List<Hotel> getAllHotels();
	
	//get single hotel
	Hotel getHotel(String hotelId);

}

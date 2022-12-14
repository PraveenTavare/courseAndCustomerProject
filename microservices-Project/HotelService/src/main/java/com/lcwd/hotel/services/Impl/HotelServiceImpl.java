package com.lcwd.hotel.services.Impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.entities.Hotel;
import com.lcwd.hotel.exceptions.ResourceNotFoundException;
import com.lcwd.hotel.repository.HotelRepository;
import com.lcwd.hotel.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel create(Hotel hotel) {
		
		hotel.setHotelId(UUID.randomUUID().toString());
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotels() {
		
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotel(String hotelId) {
		
		return hotelRepository.findById(hotelId).
				orElseThrow(() -> new ResourceNotFoundException("hotel not found with id : " + hotelId));
	} 

}

package com.lcwd.user.service.services;

import java.util.List;

import com.lcwd.user.service.entities.User;

public interface UserService {

	//User Operations
	
	//Create
	User saveUSer(User user);
	
	//get all user
	List<User> getAllUser();
	
	// get user base on useId
	User getUser(String userId);
	
	//TODO: delete
	//TODO: update
}

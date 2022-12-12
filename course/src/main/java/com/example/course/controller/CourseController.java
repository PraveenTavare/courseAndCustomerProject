package com.example.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.Course;
import com.example.course.exceptions.CourseNotFoundException;
import com.example.course.services.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "This is a Home Page";
	}

	// get all the courses
//	@Cacheable(cacheNames = "course")
	@GetMapping("/getAllCourses")
	public List<Course> getAllCourses() {
		
		return courseService.getAllCourses();
	}
	
	// get one course details
	@GetMapping("/getCourse/{id}")
	public ResponseEntity<Course> getCourseById(@PathVariable Long id) throws CourseNotFoundException {
		
		return courseService.getCourseById(id);
	}
		
	// Save a course
	@PostMapping("/saveCourse")
//	@CacheEvict(cacheNames = "course")
	public String createcourse(@RequestBody List<Course> course) {
		
		courseService.saveOrUpdate(course);
		
		return "Saved";
	}
	
	
	// Delete a course
	@DeleteMapping("/deleteCourse/{id}")
//	@CacheEvict(cacheNames = "course")
	public String deleteCourseByid(@PathVariable Long id) throws Exception {
		
		return courseService.deleteCourseByid(id);
		
	}
	// To update the course
	
	 @PutMapping("/updateCourse/{id}")
//	 @CachePut(cacheNames = "course")
	  public ResponseEntity<Course> updateCourseById(@PathVariable(value = "id") Long id, 
	      @RequestBody Course course) throws CourseNotFoundException {
		 
		 return courseService.updateCourseById(id, course);

	  }
	
}

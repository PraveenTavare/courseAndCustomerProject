package com.example.course.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.course.entities.Course;
import com.example.course.exceptions.CourseNotFoundException;

public interface CourseService {
	
	public List<Course> getAllCourses();

	public ResponseEntity<Course> getCourseById(Long id) throws CourseNotFoundException;

	public void saveOrUpdate(List<Course> course);

	public String deleteCourseByid(Long id) throws Exception;

	ResponseEntity<Course> updateCourseById(Long id, Course courseDtls) throws CourseNotFoundException;

}

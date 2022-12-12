package com.example.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.course.Repository.CourseRepository;
import com.example.course.entities.Course;
import com.example.course.exceptions.CourseNotFoundException;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public ResponseEntity<Course> getCourseById(Long id) throws CourseNotFoundException {
		// TODO Auto-generated method stub
		Course course=  courseRepository.findById(id).
				orElseThrow(() -> new CourseNotFoundException(id));
		
		return ResponseEntity.ok().body(course);
	}

	@Override
	public void saveOrUpdate(List<Course> course) {
		
		courseRepository.saveAll(course);
	}

	@Override
	public String deleteCourseByid(Long id) throws Exception {
		
		Course course=  courseRepository.findById(id).
				orElseThrow(() -> new CourseNotFoundException(id));
		courseRepository.delete(course);
		
		return "Deleted";
		
	}

	@Override
	public ResponseEntity<Course> updateCourseById(Long id, Course courseDtls) throws CourseNotFoundException {
		
		Course course = courseRepository.findById(id)
		            .orElseThrow(() -> new CourseNotFoundException(id));

		course.setTitle(courseDtls.getTitle());
		course.setDescription(courseDtls.getDescription());
		final Course updtedCourse = courseRepository.save(course);
		 
		return ResponseEntity.ok(updtedCourse);
	}

}

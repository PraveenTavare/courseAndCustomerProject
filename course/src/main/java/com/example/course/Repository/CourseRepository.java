package com.example.course.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.course.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}

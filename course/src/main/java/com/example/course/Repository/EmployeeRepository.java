package com.example.course.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.course.entities.Employee;

@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

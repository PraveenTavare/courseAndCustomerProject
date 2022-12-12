package com.example.course.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.course.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}

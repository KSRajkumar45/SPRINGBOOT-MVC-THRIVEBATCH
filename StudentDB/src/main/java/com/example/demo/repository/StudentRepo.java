package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Studentdomain;  
public interface StudentRepo extends JpaRepository<Studentdomain, Long> {

	default void delStudentById(long id)
	{
		this.deleteById(id);
	}
}
package com.Springexample.repository;

import org.springframework.data.repository.CrudRepository;

import com.Springexample.domain.Weather;

public interface Weatherrepository extends CrudRepository<Weather, String> {  
	}  


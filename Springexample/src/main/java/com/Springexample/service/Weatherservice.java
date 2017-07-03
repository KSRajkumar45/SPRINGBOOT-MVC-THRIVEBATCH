package com.Springexample.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springexample.domain.Weather;
import com.Springexample.repository.Weatherrepository;
@Service
public class Weatherservice {
	@Autowired
	 private Weatherrepository weatherrepository;  
	    public List<Weather> getAllWeathers(){  
	        List<Weather>Weather = new ArrayList<>();  
	        weatherrepository.findAll().forEach(Weather::add);  
	        return Weather;  
	    }  
	    public Optional<Weather> getWeather(String city){  
	        return  weatherrepository.findById(city);  
	    }  
	    public void addWeather(Weather weather){  
	    	weatherrepository.save(weather);  
	    }  
	    public void delete(String city){  
	    	weatherrepository.deleteById(city);  
	    }  

}

package com.Springexample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.Springexample.service.Weatherservice;
import com.Springexample.domain.Weather;

@RestController
public class WeatherController {
	@Autowired
	 private Weatherservice Weatherservice;   
	    @RequestMapping("/")  
	    public List<Weather> getAllWeather(){  
	        return Weatherservice.getAllWeathers();  
	    }     
	    @RequestMapping(value="/add", method=RequestMethod.POST)  
	    public void addWeather(@RequestBody Weather Weather){  
	    	Weatherservice.addWeather(Weather);  
	    }  
	    @RequestMapping(value="/get", method=RequestMethod.GET)  
	    public Optional<Weather> getWeather(@PathVariable String city){  
	        return Weatherservice.getWeather(city);  
	    }  


}

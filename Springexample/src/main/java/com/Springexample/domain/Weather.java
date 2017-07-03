package com.Springexample.domain;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Weather {
	 @Id
	 private String city;
	 private String weather;
	 private String celcius;
	 
	public Weather()
	{
		
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city= city;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getCelcius() {
		return celcius;
	}
	public void setCelcius(String celcius) {
		this.celcius = celcius;
	}
	

}

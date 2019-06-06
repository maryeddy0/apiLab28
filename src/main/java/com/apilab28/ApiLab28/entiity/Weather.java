package com.apilab28.ApiLab28.entiity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

	private Location location;
	private String time;
	private String data;
	private String currentobservation;
	
	
	public Weather(Location location, String time, String data, String currentobservation) {
		super();
		this.location = location;
		this.time = time;
		this.data = data;
		this.currentobservation = currentobservation;
	}


	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location  getLocation() {
		return location;
	}


	public void setLocation(Location  location) {
		this.location = location;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getCurrentobservation() {
		return currentobservation;
	}


	public void setCurrentobservation(String currentobservation) {
		this.currentobservation = currentobservation;
	}


	@Override
	public String toString() {
		return "Weather [location=" + location + ", time=" + time + ", data=" + data + ", currentobservation="
				+ currentobservation + "]";
	}
	
	
}

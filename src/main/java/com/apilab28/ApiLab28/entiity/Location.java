package com.apilab28.ApiLab28.entiity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location extends Weather{

//	private String region;
	private double latitude;
	private double longitude;
//	private int elevation;
//	private String wfo;
//	private String timezone;
//	private String areaDescription;
//	private String radar;
//	private String zone;
//	private String country;
//	private String firezone;
//	private String metar;
	
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Location(double lat, double lon) {
		super();
		this.latitude = lat;
		this.longitude = lon;
	}


	public double getLatitude() {
		return latitude;
	}


	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}


	public double getLongitude() {
		return longitude;
	}


	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	@Override
	public String toString() {
		return "Location [latitude=" + latitude + ", longitude=" + longitude + "]";
	}


	
}

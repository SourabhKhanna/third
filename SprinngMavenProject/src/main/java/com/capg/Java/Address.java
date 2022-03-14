package com.capg.Java;

public class Address {

	private String cityName;
	private String stateName;
	private String countryName;
	
	
//	public Address(String cityName, String stateName, String countryName) {
//		super();
//		this.cityName = cityName;
//		this.stateName = stateName;
//		this.countryName = countryName;
//	}
	
	
	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public String getStateName() {
		return stateName;
	}


	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	
	public String toString()
	{
		return cityName + " " + stateName + " " +countryName;
	}
}

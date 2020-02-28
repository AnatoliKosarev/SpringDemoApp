package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	
	// LinkedHashMap - ordered "key, value" list
	private LinkedHashMap<String, String> countryList;
	
	public Student() {
		
		// populating countryList with values which'll be displayed in studentForm dropdown
		countryList = new LinkedHashMap<>();
		
		countryList.put("BR", "Brazil");
		countryList.put("FR", "France");
		countryList.put("DE", "Germany");
		countryList.put("BY", "Belarus");
		countryList.put("US", "USA");
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}
	
	

}

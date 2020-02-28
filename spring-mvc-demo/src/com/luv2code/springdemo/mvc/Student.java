package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	
	// LinkedHashMap - ordered "key, value" list
	private LinkedHashMap<String, String> countryList;
	
	private LinkedHashMap<String, String> languageList;
	
	public Student() {
		
		// populating countryList with values which'll be displayed in studentForm dropdown
		countryList = new LinkedHashMap<>();
		
		countryList.put("BR", "Brazil");
		countryList.put("FR", "France");
		countryList.put("DE", "Germany");
		countryList.put("BY", "Belarus");
		countryList.put("US", "USA");
		
		languageList = new LinkedHashMap<>();
		
		languageList.put("Java", "Java");
		languageList.put("JS", "JS");
		languageList.put("Python", "Python");
		languageList.put("Kotlin", "Kotlin");
		
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

	public String getCountryKey() {
		return country;
	}
	
	public String getCountryValue() {
		return countryList.get(country);
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

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getLanguageList() {
		return languageList;
	}
	
	
	
	

}

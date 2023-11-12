package com.fit.entities;

import java.util.ArrayList;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String[] operatingSystems;

	private ArrayList<String> countryOptions;
	private ArrayList<String> favoriteLanguageOptions;
	private ArrayList<String> operatingSystemOptions;

	public Student() {
		// TODO Auto-generated constructor stub

		favoriteLanguageOptions = new ArrayList();
		favoriteLanguageOptions.add("Java");
		favoriteLanguageOptions.add("C#");
		favoriteLanguageOptions.add("PHP");
		favoriteLanguageOptions.add("Ruby");

		operatingSystemOptions = new ArrayList();
		operatingSystemOptions.add("Linux");
		operatingSystemOptions.add("Mac OS");
		operatingSystemOptions.add("MS Windowns");

		countryOptions = new ArrayList();
		countryOptions.add("Brazil");
		countryOptions.add("France");
		countryOptions.add("Germany");
		countryOptions.add("India");
		countryOptions.add("United State");
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

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public ArrayList<String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(ArrayList<String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public ArrayList<String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public void setFavoriteLanguageOptions(ArrayList<String> favoriteLanguageOptions) {
		this.favoriteLanguageOptions = favoriteLanguageOptions;
	}

	public ArrayList<String> getOperatingSystemOptions() {
		return operatingSystemOptions;
	}

	public void setOperatingSystemOptions(ArrayList<String> operatingSystemOptions) {
		this.operatingSystemOptions = operatingSystemOptions;
	}

}

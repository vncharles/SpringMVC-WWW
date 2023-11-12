package model;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favorileLanguage;
	private String[] operatingSystems;
	
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	private ArrayList<String> operatingSystemOptions;
	
	public Student() {
		favoriteLanguageOptions = new LinkedHashMap();
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("PHP", "PHP");
		favoriteLanguageOptions.put("Ruby", "Ruby");
		
		operatingSystemOptions = new ArrayList();
		operatingSystemOptions.add("Linux");
		operatingSystemOptions.add("Mac OS");
		operatingSystemOptions.add("MS Windows");
		
		countryOptions = new LinkedHashMap();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United State");
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

	public String getFavorileLanguage() {
		return favorileLanguage;
	}

	public void setFavorileLanguage(String favorileLanguage) {
		this.favorileLanguage = favorileLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguageOptions) {
		this.favoriteLanguageOptions = favoriteLanguageOptions;
	}

	public ArrayList<String> getOperatingSystemOptions() {
		return operatingSystemOptions;
	}

	public void setOperatingSystemOptions(ArrayList<String> operatingSystemOptions) {
		this.operatingSystemOptions = operatingSystemOptions;
	}
	
	
}

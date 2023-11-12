package model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	private String courseCode;
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 chars/digits")
	private String postalCode;
	private String firstName;
	@NotNull(message = "Last name is require!")
	@Size(min = 4, message = "Last name from 4 chars")
	private String lastName;
	@Min(value = 0, message = "min is 0")
	@Max(value = 10, message = "max is 10")
	private Integer freePasses;
	
	
	
	public Customer(String courseCode, String postalCode, String firstName, String lastName, Integer freePasses) {
		super();
		this.courseCode = courseCode;
		this.postalCode = postalCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.freePasses = freePasses;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
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
	
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
}

package com.fit.entities;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	@NotNull(message = "is required!")
	@Size(min = 4, message = "min is 4 characters" )
	private String fname;
	@NotNull(message = "is required!")
	@Size(min = 4, message = "min is 4 characters" )
	private String lname;
	@Min(value = 0, message = "min is 0")
	@Max(value = 10, message = "max is 10")
	private int freePasses;
	@Pattern(regexp = "^[0-9a0zA-Z]{5}", message = "not correct!")
	private String postalCode;
	private String courseCode;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(int freePasses) {
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

	@Override
	public String toString() {
		return "Customer [fname=" + fname + ", lname=" + lname + ", freePasses=" + freePasses + ", postalCode="
				+ postalCode + ", courseCode=" + courseCode + "]";
	}

}

package com.spring;

public class Employee {

	// this is spring been class/ or we can say this is pojo class
	
	private String firstName;
	private String city;
	
	//hare provide getter and setter for bath fields
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	//  generete/override toString method hare
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", city=" + city + "]";
	}
	
	
	
	
	
}

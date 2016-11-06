package main.java.com.mikejfromva.cnu.cpsc440.mybatis;

import java.util.Date;

public class Person {
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private Address homeAddress;
	private Address workAddress;
	
	public Person(String firstName, String lastName, Date dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	
}

package com.app;
import java.io.Serializable;

public class Customer implements Serializable{
	
	private String firstName;
	private String lastName;
	private boolean status;
	
	public Customer() {}

	public Customer(String firstName, String lastName, boolean status) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.status = status;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", status=" + status + "]";
	}
	
	

}

package com.techxyte1;

import org.springframework.stereotype.Component;

@Component
public class Address {

	String City;
	String State;
     
	public Address() {
		System.out.println("Address bean");
	}
//
//	public Address(String city, String state) {
//
//		City = city;
//		State = state;
//	}

	@Override
	public String toString() {
		return "Address [" + City + ", " + State + "]";
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

}

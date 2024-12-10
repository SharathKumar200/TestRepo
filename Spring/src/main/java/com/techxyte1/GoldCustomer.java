package com.techxyte1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("goldcustomer")
public class GoldCustomer implements Customer {
	@Value("11")
	int id;
	@Value("alex")
	String name;
	//@Autowired
	Address address;

//	public GoldCustomer() {
//
//	}
//
//	public GoldCustomer(int id, String name, Address address) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.address = address;
//	}

	public void start() {
		System.out.println("START - INIT");
	}

	public void stop() {
		System.out.println("STOP - DESTROY");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + ", " + name + " ," + address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String getCustomerDetails() {
		return "New Gold customer";
	}
}

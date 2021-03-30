package com.bhawnagunwani.ioc;

public class Address {

	private String City;
	private String State;
	private String Country;
	
	public Address() {
		super();
		System.out.println("Address - Default Constructor Invoked..!!");
	}

	public Address(String city, String state, String country) {
		super();
		System.out.println("Address - Parameterized Constructor Invoked..!!");
		City = city;
		State = state;
		Country = country;
	}

	@Override
	public String toString() {
		return "Address [City=" + City + ", State=" + State + ", Country=" + Country + "]";
	}

}

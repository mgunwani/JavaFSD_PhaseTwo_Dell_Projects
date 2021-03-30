package com.bhawnagunwani.ioc;

public class Employee {

	private int Id;
	private String Name;
	private String Company;
	private Address Address;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		System.out.println("Id Setter Invoked..!!");
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		System.out.println("Name Setter Invoked..!!");
		Name = name;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		System.out.println("Company Setter Invoked..!!");
		Company = company;
	}
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		System.out.println("Address Setter Invoked..!!");
		Address = address;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Company=" + Company + ", Address=" + Address + "]";
	}
}

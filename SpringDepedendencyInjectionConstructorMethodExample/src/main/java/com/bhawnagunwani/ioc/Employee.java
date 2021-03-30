package com.bhawnagunwani.ioc;

public class Employee {
	
	private int Id;
	private String Name;
	private String Company;
	private Address Address;
	
	public Employee() {
		super();
		System.out.println("Employee - Default Constructor Invoked..!!");
		this.Id = 1001;
		this.Name = "Bhawna";
		this.Company = "BhawnaGunwani";
	}

	public Employee(int id, String name, String company) {
		super();
		System.out.println("Employee - Parameterized COnstructor Invoked..!!");
		Id = id;
		Name = name;
		Company = company;
	}

	public Employee(int id, String name, String company, Address address) {
		super();
		System.out.println("Employee - Constructor with Address Invoked..!!");
		Id = id;
		Name = name;
		Company = company;
		Address = address;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Company=" + Company + ", Address=" + Address + "]";
	}

}

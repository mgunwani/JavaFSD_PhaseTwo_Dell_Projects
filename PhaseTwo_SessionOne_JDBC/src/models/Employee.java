package models;

public class Employee {
	
	int Id;
	String name;
	Float salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, Float salary) {
		super();
		Id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee(String name, Float salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}
	

}

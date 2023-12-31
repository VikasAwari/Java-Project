package com.jbk.Model;

public class Model {

	private int id;
	private String name;
 	private String address;
 	private double salary;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
	
}

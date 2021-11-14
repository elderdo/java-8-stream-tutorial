package com.javaguides.java.tutorial;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private Long id;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	private int age;
	private float salary;

	
	
	public Employee(Long id, String name, int age, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	static public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10L,"Ramesh",30, 400000f));
		employees.add(new Employee(20L,"Santosh",29, 35000f));
		employees.add(new Employee(30L,"Sanjay",30, 450000f));
		employees.add(new Employee(40L,"Pramod",29, 500000f));
		return employees;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}

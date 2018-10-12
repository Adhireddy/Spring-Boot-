package com.anr.model;

public class Employee {

	private String empId;
	private String name;
	private String desigination;
	private double salary;
	
	public Employee(){
		
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesigination() {
		return desigination;
	}

	public void setDesigination(String desigination) {
		this.desigination = desigination;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}

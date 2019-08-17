package com.cg.lab1.prob2;

public class Employeebean {
	private int employeeId;
	private String employeeName;
	private double salary;
	private int age;
	private SbuBean businessUnit;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public SbuBean getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(SbuBean businessUnit) {
		this.businessUnit = businessUnit;
	}
	@Override
	public String toString() {
		return "Employeebean [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ "\n businessUnit=" + businessUnit + "]";
	}
	
	

}

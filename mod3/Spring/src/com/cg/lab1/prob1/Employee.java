package com.cg.lab1.prob1;
public class Employee
{
	private int empId;
	private String empName;
	private double salary;
	private int age;
	private String businessUnit;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
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
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	@Override
	public String toString() {
		return " Employee Details\n -------------\n Employee Id:" + empId + "\n Employee Name:" + empName + "\n Employee Salary:" + salary + "\n Employee Age:"
				+ age + "\n Employee BusinessUnit:" + businessUnit + "";
	}
	

}

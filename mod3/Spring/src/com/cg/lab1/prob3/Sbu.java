package com.cg.lab1.prob3;

import java.util.ArrayList;
import java.util.List;

public class Sbu
{
	private String subId;
	private String subName;
	private String subHead;
    List<Employee> empList= new ArrayList<>();
	public String getSubId() {
		return subId;
	}
	public void setSubId(String subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getSubHead() {
		return subHead;
	}
	public void setSubHead(String subHead) {
		this.subHead = subHead;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	@Override
	public String toString() {
		return "Sbu [subId=" + subId + ", subName=" + subName + ", subHead=" + subHead +  "\n Employee Details:-------------\n"  + empList + "]";
	}
    
}

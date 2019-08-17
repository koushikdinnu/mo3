package com.cg.lab1.prob2;

public class SbuBean
{
	private String subId;
	private String subName;
	private String subHead;
	
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
	@Override
	public String toString() {
		return "SbuBean [subId=" + subId + ", subName=" + subName + ", subHead=" + subHead + "]";
	}

}

package com.capg.Java;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int stid;
	private String stname;
	@Autowired
	private Address address;

	
//	public Student(int stid, String stname, Address address) {
//		super();
//		this.stid = stid;
//		this.stname = stname;
//		this.address = address;
//	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	
	public Student()
	{
		
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void displayStudentInfo()
	{
		System.out.println(stid + " " + stname + " " +address);
	}

}

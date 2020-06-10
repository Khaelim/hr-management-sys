package com.amazingsoftware.hr.employees;

import java.io.Serializable;
import java.time.LocalDate;

import com.amazingsoftware.hr.enums.DeveloperLevel;

public class Developer extends Employee implements Serializable {
	private DeveloperLevel level;
	//private double rate;

	public Developer(Name name, LocalDate dateStarted, int deptID, String phoneNo, DeveloperLevel level) {
		super(name, dateStarted, deptID, phoneNo);
		this.level = level;
	}
	
	public Name getName() {
		return super.getName();
	}
	public void setName(Name name) {
		super.setName(name);
	}
	
	public LocalDate getDateStarted() {
		return super.getDateStarted();
	}
	public void setDateStarted(LocalDate date) {
		super.setDateStarted(date);
	}
	
	public void setDepartment(int dept) {
		super.setDeptID(dept);
	}
	public int getDepartmentID() {
		return super.getDeptID();
	}
	
	public void setPhonenumber(String phoneNo) {
		super.setPhoneNo(phoneNo);
	}
	public String getPhonenumber() {
		return super.getPhoneNo();
	}
	
	public DeveloperLevel getLevel() {
		return level;
	}
	public void setLevel(DeveloperLevel level) {
		this.level = level;
	}
	
	public double getRate() {
		return level.getRate();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString()+"Developer Level="+level+"\n";
	}
	@Override
	public void pay() {
		//TODO: right the thing
	}
	
}

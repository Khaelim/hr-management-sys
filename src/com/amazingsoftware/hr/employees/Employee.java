package com.amazingsoftware.hr.employees;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Employee implements Serializable{
	private Name name;
	private LocalDate dateStarted;
	private int deptID;
	private String phoneNo;
	private int empID;

	private static int nextID = 0;

	public Employee(Name name, LocalDate dateStarted, int deptID, String phoneNo) {
		this.name = name;
		this.dateStarted = dateStarted;
		this.deptID = deptID;
		this.phoneNo = phoneNo;
		
		this.empID=++nextID;
	}

	@Override
	public String toString() {
		return "Employee name=" + name + "\ndateStarted=" + dateStarted + "\ndeptID=" + deptID + "\nphoneNo=" + phoneNo
				+ "\nempID=" + empID + "\n";
	}

	public boolean equals(Object obj) {
		Employee pObject;
		if (obj instanceof Employee)
			pObject = (Employee) obj;
		else
			return false;

		return (name.equals(pObject.name) && dateStarted.equals(pObject.dateStarted));
	}

	// set() and get() methods

	
	
	
	public static void setnextID(int num) { //Should be called where the file gets deserialized
		nextID = num;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public LocalDate getDateStarted() {
		return dateStarted;
	}

	public void setDateStarted(LocalDate dateStarted) {
		this.dateStarted = dateStarted;
	}

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) { ///TODO check that department exists and approve request
		this.deptID = deptID;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
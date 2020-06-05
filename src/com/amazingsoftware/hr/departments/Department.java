package com.amazingsoftware.hr.departments;

import java.io.Serializable;

public class Department implements Serializable {
	private int deptID;
	private String deptName;
	private int noOfEmployees;
	//
	private static int nextID=0;
	
	public Department(String deptName, int noOfEmployees) {
		this.deptName = deptName;
		this.noOfEmployees = noOfEmployees;
		
		this.deptID = ++nextID;;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (deptID != other.deptID)
			return false;
		if (deptName == null) {
			if (other.deptName != null)
				return false;
		} else if (!deptName.equals(other.deptName))
			return false;
		if (noOfEmployees != other.noOfEmployees)
			return false;
		return true;
	}
	
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	public int getDeptID() {
		return deptID;
	}

	public static void setNextID(int num) {
		nextID = num;
	}
	
}

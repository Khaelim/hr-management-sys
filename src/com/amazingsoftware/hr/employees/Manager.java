package com.amazingsoftware.hr.employees;

import java.io.Serializable;
import java.time.LocalDate;

public class Manager extends Employee implements Serializable {
    private double monthlySalary;
    private double bonus;

    public Manager(Name name, LocalDate dateStarted, int deptID, String phoneNo, double monthlySalary, double bonus) {
		super(name, dateStarted, deptID, phoneNo);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
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
	
	public double getSalary() {
		return monthlySalary;
	}
	public void setsalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	public double getBonus() {
		return bonus;
	}
    public void setBonus(double bonus) {
		this.bonus= bonus;
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
		return super.toString()+"Monthly Salary="+monthlySalary+"\nBonus="+bonus+"\n";
	}
	@Override
	public void pay() {
		//TODO: right the thing
	}


}

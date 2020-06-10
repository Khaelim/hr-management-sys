package com.amazingsoftware.hr.employees;

import java.io.Serializable;
import java.time.LocalDate;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.amazingsoftware.hr.utils.Payable;

public abstract class Employee implements Serializable, Payable{
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
	public int getID() {
		return empID;
	}

	public void setID(int empid) {
		this.empID = empid;
	}
	
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
	
	//Completley fucked and needs to be repurposed
//	public void read()
//	{
//		  String[] title = {"Mr","Mrs","Ms","Dr"};
//		  String[] days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
//		  String[] months = {"1","2","3","4","5","6","7","8","9","10","11","12"};
//		  String[] years = {"1990","1991","1992",	"1993",	"1994",	"1995",	"1996",	"1997",	"1998",	"1999",	"2000",	"2001",	"2002",	"2003",	"2004",	"2005",	"2006",	"2007",	"2008",	"2009",	"2010",	"2011",	"2012",	"2013",	"2014",	"2015",	"2016",	"2017",	"2018"};
//	      JComboBox comboNameTitle = new JComboBox(title);
//	      JTextField txtFname = new JTextField();
//	      JTextField txtSname = new JTextField();
//	      JComboBox comboStartDay = new JComboBox(days);
//	      JComboBox comboStartMonth = new JComboBox(months);
//	      JComboBox comboStartYear = new JComboBox(years);
//		  JTextField txtDeptID = new JTextField();
//		  JTextField txtPhoneNo = new JTextField();
//	      Object[] message = {
//	          "Title:", comboNameTitle,
//	          "First name:", txtFname,
//	          "Last Name:", txtSname,
//	          "Start day:", comboStartDay,
//	          "Start month:", comboStartMonth,
//	          "Start year:", comboStartYear,
//			  "Department ID:", txtDeptID,
//			  "Phone Number:", txtPhoneNo
//	      };
//	      int option = JOptionPane.showConfirmDialog(null, message, "Enter employee details", JOptionPane.OK_CANCEL_OPTION);
//	      if (option == JOptionPane.OK_OPTION){
//	    	  String titletxt= comboNameTitle.getSelectedItem().toString();
//	    	  this.name = new Name(titletxt, txtFname.getText(), txtSname.getText());
//
//	    	  String t1=comboStartDay.getSelectedItem().toString(); String t2=comboStartMonth.getSelectedItem().toString(); String t3=comboStartYear.getSelectedItem().toString();
//	    	  int d=Integer.parseInt(t1); int m=Integer.parseInt(t2); int y=Integer.parseInt(t3);
//	    	  this.dateStarted = LocalDate.of(y, m, d);    	  
//	    	  try {
//	    		  this.deptID = Integer.parseInt(txtDeptID.getText());
//	    	  }catch(NumberFormatException e){
//	    		  e.printStackTrace();
//	    		  //System.out.println("ClassCastException Error " + e.getMessage());
//	    		  //System.out.println("Invalid salary. Select edit to amend.");
//	    	  } 
//	      }   
//		}


}
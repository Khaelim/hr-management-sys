package com.amazingsoftware.hr.utils;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.amazingsoftware.hr.departments.Department;
import com.amazingsoftware.hr.employees.Developer;
import com.amazingsoftware.hr.employees.Employee;
import com.amazingsoftware.hr.employees.Manager;

public class DataStorage {
	List<Employee> employees;
	List<Department> departments;
	public DataStorage(List<Employee> employees, List<Department> departments) {
		///TODO im not even sure to bo honest
		this.employees = employees;
		this.departments = departments;
	}
	//listing all employees 
	public void listEmployees() 
	{
		for(Employee emp:employees)
		{
			System.out.println(emp);
		}
	}
	
	//listing all departments
	public void listDepartments() 
	{
		for(Department dept:departments)
		{
			System.out.println(dept);
		}
	}
	//add an employee 
	//TODO: make this method
	
	
	//edit
	public void edit() {
		Employee tmpEmp = view();
	    if(tmpEmp != null){
		   int index=employees.indexOf(tmpEmp);
		   //TODO: add some method for editing fields of an employee
		   
		   employees.set(index, tmpEmp);
	    }
	}
	//view a specific employee
	public Employee view() {
		Scanner keyboard = new Scanner(System.in);		
		int empToView;
		System.out.println("ENTER EMPLOYEE NUMBER OF EMPLOYEE : ");
		try {
			empToView=keyboard.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Invalid Number.");
			return null;
		}
        for(Employee tmpEmp:employees) 
        {
        	if(tmpEmp.getID() == empToView)
        	{
        		System.out.println(tmpEmp);
  			    return tmpEmp;
  		    }
        }
  		return null;  
	}
	
	
	//Delete an employee based on ID
	public void delete(int number) 
	{
		for(Employee b:employees)
		{
			if(number==b.getID())
			{
				employees.remove(b);
				break;
			}
		}
		
	}
	//listing all Managers 
	public void listManagers() 
	{
		for(Employee emp:employees)
		{
			if(emp instanceof Manager) {
				System.out.println(emp);
			}
		}
	}
	//listing all Developers 
	public void listDevelopers() 
	{
		for(Employee emp:employees)
		{
			if(emp instanceof Developer) {
				System.out.println(emp);
			}
		}
	}
	
	
	
}

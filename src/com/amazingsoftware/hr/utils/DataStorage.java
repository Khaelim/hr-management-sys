package com.amazingsoftware.hr.utils;

import java.util.List;

import com.amazingsoftware.hr.departments.Department;
import com.amazingsoftware.hr.employees.Employee;

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
	
	
}

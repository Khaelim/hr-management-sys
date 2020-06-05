package com.amazingsoftware.hr.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.amazingsoftware.hr.departments.Department;
import com.amazingsoftware.hr.employees.Employee;

public class FileReaderWriter {

    //serialize method to store employees
	public void serializeEmployees(List<Employee> emps) 
	{
		try
		{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("employees.ser"));
			os.writeObject(emps);
			os.close();
		}
		catch(FileNotFoundException f)
		{
			 System.out.println("File Not Found" + f.getMessage());
			 f.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			 System.out.println("Input Output Error: " + e.getMessage());
		}
	}
	//deserialize method to read departments
	public List<Employee> deserializeEmployees()
	{
        List<Employee> emps=null;
		ObjectInputStream is = null;
		try
		{
			FileInputStream fileStream = new FileInputStream("employees.ser");
			is = new ObjectInputStream(fileStream);
			emps= (List<Employee>) is.readObject();
            is.close();
            return emps;
		}
		catch(FileNotFoundException f)
		{
			//f.printStackTrace();
			System.out.println("File Not Found" + f.getMessage());
		}
		catch(IOException e)
		{
			//e.printStackTrace();
			 System.out.println("Input Output Error: " + e.getMessage());
			 System.out.println("File corrupt.");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
			System.out.println("ClassNotFoundException Error" + e.getMessage());
		}
		catch (ClassCastException e) 
		{
			e.printStackTrace();
			System.out.println("ClassCastException Error" + e.getMessage());
        }
        return emps;
	}
    public void serializeDepartments(List<Department> depts) 
	{
		try
		{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("department.ser"));
			os.writeObject(depts);
			os.close();
		}
		catch(FileNotFoundException f)
		{
			 System.out.println("File Not Found" + f.getMessage());
			 f.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			 System.out.println("Input Output Error: " + e.getMessage());
		}
	}
	//deserialize method to read employees
	public List<Department> deserializeDepartments()
	{
        List<Department> depts=null;
		ObjectInputStream is = null;
		try
		{
			FileInputStream fileStream = new FileInputStream("employees.ser");
			is = new ObjectInputStream(fileStream);
			depts= (List<Department>) is.readObject();
            is.close();
            return depts;
		}
		catch(FileNotFoundException f)
		{
			//f.printStackTrace();
			System.out.println("File Not Found" + f.getMessage());
		}
		catch(IOException e)
		{
			//e.printStackTrace();
			 System.out.println("Input Output Error: " + e.getMessage());
			 System.out.println("File corrupt.");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
			System.out.println("ClassNotFoundException Error" + e.getMessage());
		}
		catch (ClassCastException e) 
		{
			e.printStackTrace();
			System.out.println("ClassCastException Error" + e.getMessage());
        }
        return depts;
	}




}
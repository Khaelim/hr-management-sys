package com.amazingsoftware.hr.employees;

import java.io.Serializable;

public class Name implements Serializable{
    private String title;
    private String firstName;
    private String surname;
   //change this title for enums ****************
	public Name() {
	   title=firstName=surname="";
	}   


	public Name(String t, String fN, String sn){
		title=t;
		firstName=fN;
		surname=sn;
	}

	@Override
	public String toString(){
	   return title + " " + firstName + " " + surname;
	}

	@Override
	public boolean equals(Object obj){
	   Name nObject;
	   if (obj instanceof Name)
	      nObject = (Name)obj;
	   else
	       return false;
	 
	   return this.title.equals(nObject.title)
	          && this.firstName.equals(nObject.firstName)
	          && this.surname.equals(nObject.surname);
	}

	public String getTitle(){
	   return title;
	}
	public String getFirstName(){
	   return firstName;
	}
	public String getSurname(){
	   return surname;
	}
	
	public void setTitle(String setTitleTo){
	   title=setTitleTo;
	}
	public void setFirstName(String setFirstNameTo){
	   firstName=setFirstNameTo;
	}
	public void setSurname(String setSurnameTo){
	   surname=setSurnameTo;
	}

}
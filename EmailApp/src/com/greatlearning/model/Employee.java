package com.greatlearning.model;

import java.util.Objects;

public class Employee 
{
 private String FirstName;
 private String LastName;
 

 	public Employee(String firstName, String lastName)
	{
	super();
	FirstName = firstName;
	LastName = lastName;
	}
 	public String getFirstName()
 	{
	return FirstName;
 	}
 	public void setFirstName(String firstName) 
 	{
	FirstName = firstName;
 	}

 	public String getLastName() 
 	{
	return LastName;
 	}

 	public void setLastName(String lastName)
 	{
	LastName = lastName;
 	}

@Override
	public int hashCode() 
	{
	return Objects.hash(FirstName, LastName);
	}

@Override
	public boolean equals(Object obj)
	{
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(FirstName, other.FirstName) && Objects.equals(LastName, other.LastName);
	}
}



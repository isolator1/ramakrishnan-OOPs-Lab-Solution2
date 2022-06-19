package com.greatlearning.service;

import com.greatlearning.model.Employee;
import java.util.Random;

public class CredentialService implements ICredentialService 
{
	
	@Override
	public String generatepassword()
	{
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallCaseLetters = "abcdefghijklmnopqurstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters ="!@#$%+-_<>?";
		String values = capitalLetters + smallCaseLetters + numbers + specialCharacters;
		Random random = new Random();
		StringBuilder strBuffer = new StringBuilder();
	
		for (int index=0; index<8; index++)
		{
			int randomCharacter1 = random.nextInt(values.length());
			strBuffer.append(values.charAt(randomCharacter1));
					
		}
		return strBuffer.toString();
		
	}
	


	private int randomCharacter1() {
		return 0;
	}



	@Override
	public String getEmailAddress(String firstName, String lastName, String department) {
		return firstName.trim()+lastName.trim()+ "@"+department+".abc.com";
	}

	@Override
	public void showCredentials(Employee employee, String email, String generatePassword) 
	{
		System.out.println("Dear "+employee.getFirstName().trim() + " your generated credentials are as follows:-");
		System.out.println("Email ->  " + email);
		System.out.println("Password ->  " + generatePassword);
	}
	

}

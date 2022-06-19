package com.greatlearning.driver;

import java.util.Scanner;
import com.greatlearning.model.Employee;
import com.greatlearning.service.*;

public class DriverClass
{
	private static final CredentialService credentialsService = new CredentialService();
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Please enter your first and last name");
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		Employee employee = new Employee(firstName, lastName);
		String generatedEmail;
		String generatedPassword;

		System.out.println("Please Enter the department from the following :-  ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		int department = sc.nextInt();
		//int department=0;
		switch (department) {

		case 1: {
			generatedPassword = credentialsService.generatepassword();
			generatedEmail = credentialsService.getEmailAddress(firstName, lastName, "tech");
			credentialsService.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		}
		case 2: {
			generatedPassword = credentialsService.generatepassword();
			generatedEmail = credentialsService.getEmailAddress(firstName, lastName, "admin");
			credentialsService.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		}
		case 3: {
			generatedPassword = credentialsService.generatepassword();
			generatedEmail = credentialsService.getEmailAddress(firstName, lastName, "hr");
			credentialsService.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		}
		case 4: {
			generatedPassword = credentialsService.generatepassword();
			generatedEmail = credentialsService.getEmailAddress(firstName, lastName, "legal");
			credentialsService.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		}

		}

	}

}

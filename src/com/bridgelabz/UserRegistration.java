package com.bridgelabz;

import java.util.regex.*;
import java.util.Scanner;

public class UserRegistration {
	static void checkFirstAndLast() {
		String nameCheck = "[A-Z]{1}[a-z]{3,7}";
		Pattern pattern = Pattern.compile(nameCheck);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");

		String name = sc.nextLine();
		Matcher matcher = pattern.matcher(name);

		if(matcher.matches()) {
			System.out.println("Valid input");
		}
		else {
			System.out.println("Invalid input");
		}
		System.out.println("Enter last name");
		String lName=sc.nextLine();
		Matcher lastName =pattern.matcher(lName);
		if(lastName.matches()) {
			System.out.println("Valid input");
		}
		else {
			System.out.println("Invalid input");
		}
	}
	static void checkEmail() {
		String emailCheck="[a-z]{12}+[0-9]{4}+@bl.com";
		Pattern pattern =Pattern.compile(emailCheck);
		System.out.println("Enter Email-Id");
		Scanner sc=new Scanner (System.in);
		String emailId=sc.next();
		Matcher email= pattern.matcher( emailId);

		if(email.matches()) {
			System.out.println("Valid input");
		}
		else {
			System.out.println("Invalid input");
		}
	}
	static void checkMobileNo() {
		String noCondition="[91]+[789]{1}+[0-9]{9}";
		Pattern pattern =Pattern.compile(noCondition);
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter mobile number");
		String number=sc.nextLine();
		Matcher matcher=pattern.matcher(number);
		if(matcher.matches()) {
			System.out.println("Valid input");
		}
		else {
			System.out.println("Invalid input");
		}
		//sc.close();
	}
	static void checkPassword() {
		String passCondition="[a-z]{8}";

		Pattern pattern =Pattern.compile(passCondition);
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter password");
		String password=sc.nextLine();
		Matcher matcher=pattern.matcher(password);
		if(matcher.matches()) {
			System.out.println("Valid input");
		}
		else {
			System.out.println("Invalid input");
		}
		sc.close();
	}
	public static void main(String[] args) {
		checkFirstAndLast();
		checkEmail();
		checkMobileNo();
		checkPassword();
	}
}
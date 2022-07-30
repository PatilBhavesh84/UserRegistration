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
		String emailCheck= "[abc]{3}([-+_])?([.a-zA-Z0-9]{2})?([A-Za-z0-9]{1,})?@[a-z0-9]{1,}.[a-z]{2,3}(.[a-z]{2,3})?";
		Pattern pattern =Pattern.compile(emailCheck);
		
		String validEmailId[]= {"abc@yahoo.com","abc-100@yahoo.com","abc-100@yahoo.com",
				"abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au",
				"abc@1.com","abc@gmail.com.com","abc+100@gmail.com",
				"abc","abc@.com.my","abc123@gmail.a","abc123@.com",
				"abc123@.com.com",".abc@abc.com","abc()*@gmail.com",
				"abc@%*.com","abc..2002@gmail.com","abc.@gmail.com",
				"abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au",
				"abc1..@gmail.com"};
		for(int i=0;i<validEmailId.length;i++) {
			Matcher email= pattern.matcher( validEmailId[i]);

			if(email.matches()) {
				System.out.println("Valid input");
			}
			else {
				System.out.println("Invalid input");
			}
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
		String passCondition="[A-Z]{1}[a-z]{7}[.^$@#?&*!]{1}[0-9]{1}";

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

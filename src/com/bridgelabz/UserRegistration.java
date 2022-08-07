package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;
public class UserRegistration {

	public static boolean checkFirst(String fName) {
		String nameCheck = "[A-Z]{1}[a-z]{3,7}";
		Pattern pattern = Pattern.compile(nameCheck);
		Matcher matcher = pattern.matcher(fName);

		if(matcher.matches()) {
			System.out.println("Valid input");
		}
		else {
			System.out.println("Invalid input");
		}
		return matcher.matches();
	}
	public static boolean checkLast(String lastName) {
		String nameCheck= "[A-Z]{1}[a-z]{4}";
		Pattern pattern = Pattern.compile(nameCheck);
		Matcher lName = pattern.matcher(lastName);
		if(lName.matches()) {
			System.out.println("Valid Input");
		}
		else {
			System.out.println("Invalid Input");
		}
		return lName.matches();
	}
	public static boolean checkEmail(String validEmailId) {
		String emailCheck= "[abc]{3}([-+_])?([.a-zA-Z0-9]{2})?([A-Za-z0-9]{1,})?@[a-z0-9]{1,}.[a-z]{2,3}(.[a-z]{2,3})?";
		Pattern pattern =Pattern.compile(emailCheck);
		Matcher email= pattern.matcher( validEmailId);
		if(email.matches()) {
			System.out.println("Valid input");
		}
		else {
			System.out.println("Invalid input");
		}
		return email.matches();
	}
	public static boolean checkMobileNo(String number) {
		String noCondition="[91]+[789]{1}+[0-9]{9}";
		Pattern pattern =Pattern.compile(noCondition);
		Matcher matcher=pattern.matcher(number);
		if(matcher.matches()) {
			System.out.println("Valid input");
		}
		else {
			System.out.println("Invalid input");
		}
		return matcher.matches();
	}
	public static boolean checkPassword(String password) {
		String passCondition="[A-Z]{1}[a-z]{6}[.^$@#?&*!]{1}[0-9]{1}";
		Pattern pattern =Pattern.compile(passCondition);
		Matcher matcher=pattern.matcher(password);
		if(matcher.matches()) {
			System.out.println("Valid input");
		}
		else {
			System.out.println("Invalid input");
		}
		return matcher.matches();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First name");
		String fName =sc.nextLine();
		checkFirst(fName);
		System.out.println("Enter last name");
		String lName =sc.nextLine();
		checkLast(lName);

		String validEmailId[]= {"abc@yahoo.com","abc-100@yahoo.com","abc-100@yahoo.com",
				"abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com",
				"abc+100@gmail.com","abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",
				".abc@abc.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com",
				"abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au","abc1..@gmail.com"};
		for(int i=0;i<validEmailId.length;i++) {
			checkEmail(validEmailId[i]);
		}
		System.out.println("Enter mobile number");
		String number =sc.nextLine();
		checkMobileNo(number);

		System.out.println("Enter password number");
		String password =sc.nextLine();
		checkPassword(password);
		sc.close();
	}
}



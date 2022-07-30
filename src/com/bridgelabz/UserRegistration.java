package com.bridgelabz;

import java.util.regex.*;
import java.util.Scanner;

public class UserRegistration {
	String nameCheck = "[A-Z]{1}[a-z]{3}";
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
		sc.close();
	}
	public static void main(String[] args) {
		checkFirstAndLast();
	}
}

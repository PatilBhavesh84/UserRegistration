package com.bridgelabz;

import java.util.regex.*;
import java.util.Scanner;

public class UserRegistration {
	static void checkFirstAndLast() {
		String nameCheck = "[A-Z]{1}[a-z]{3}";
		Pattern pattern = Pattern.compile(nameCheck);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Last Name");

		String name = sc.nextLine();

		Matcher matcher = pattern.matcher(name);

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
	}
}
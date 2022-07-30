package com.bridgelabz;

import java.util.regex.*;
import java.util.Scanner;

public class UserRegistration {
	static void checkFormat() {
		System.out.println("Enter first Name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String nameCheck = "[A-Z]{1}[a-z]{3}";

		Pattern pattern = Pattern.compile(nameCheck);
		Matcher matcher = pattern.matcher(name);
		System.out.println(matcher.matches());
		sc.close();
	}
	public static void main(String[] args) {
		checkFormat();
	}
}
package com.bridgelabz;
import java.util.regex.*;
import java.util.Scanner;

class InvalidDetails extends Exception{
	InvalidDetails (String message){
		System.out.println(message); 
	}

	public class UserRegistration {

		public static boolean checkFirst(String fName) throws InvalidDetails{
			String nameCheck = "[A-Z]{1}[a-z]{3,7}";
			Pattern pattern = Pattern.compile(nameCheck);
			Matcher matcher = pattern.matcher(fName);

			if(matcher.matches()) {
				System.out.println("Valid input");
			}
			else {
				throw new InvalidDetails("Invalid input");
			}
			return matcher.matches();
		}
		public static boolean checkLast(String lastName)throws InvalidDetails {
			String nameCheck= "[A-Z]{1}[a-z]{4}";
			Pattern pattern = Pattern.compile(nameCheck);
			Matcher lName = pattern.matcher(lastName);
			if(lName.matches()) {
				System.out.println("Valid Input");
			}
			else {
				throw new InvalidDetails("Invalid Input");
			}
			return lName.matches();
		}
		public static boolean checkEmail(String validEmailId)throws InvalidDetails {
			String emailCheck= "[abc]{3}([-+_])?([.a-zA-Z0-9]{2})?([A-Za-z0-9]{1,})?@[a-z0-9]{1,}.[a-z]{2,3}(.[a-z]{2,3})?";
			Pattern pattern =Pattern.compile(emailCheck);
			Matcher email= pattern.matcher( validEmailId);
			if(email.matches()) {
				System.out.println("Valid input");
			}
			else {
				throw new InvalidDetails("Invalid input");
			}
			return email.matches();
		}
		public static boolean checkPassword(String password)throws InvalidDetails {
			String passCondition="[A-Z]{1}[a-z]{6}[.^$@#?&*!]{1}[0-9]{1}";
			Pattern pattern =Pattern.compile(passCondition);
			Matcher matcher=pattern.matcher(password);
			if(matcher.matches()) {
				System.out.println("Valid input");
			}
			else {
				throw new InvalidDetails("Invalid input");
			}
			return matcher.matches();
		}
		public static void main(String[] args) {
			try {
				checkFirst("fName");
			}
			catch(Exception e) {
				System.out.println("Enter input");
			}
			try {
				checkLast("Patil");
			}
			catch(Exception e) {
				System.out.println("Enter input");
			}
			String validEmailId[]= {"abc@yahoo.com","abc-100@yahoo.com","abc-100@yahoo.com",
					"abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com",
					"abc+100@gmail.com","abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",
					".abc@abc.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com",
					"abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au","abc1..@gmail.com"};
			for (int i =0;i<validEmailId.length;i++) {
				try {
					checkEmail(validEmailId[i]);
				}
				catch(Exception e) {
					System.out.println("Enter the proper input");
				}
				try {
					checkPassword("BridgeLabz@RFP167");
				}
				catch(Exception e) {
					System.out.println("Enter the proper input");
				}
			}
		}
	}
}




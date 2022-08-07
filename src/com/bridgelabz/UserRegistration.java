package com.bridgelabz;
import java.util.regex.*;

interface check{  
	public String format(String name);   
}  
public class UserRegistration {

	public static void main(String[] args) {

		check obj = (name)->{ 
			String nameCondition = "[A-Z]{1}[a-z]{2,}";
			Pattern pattern = Pattern.compile(nameCondition);
			Matcher fmatcher = pattern.matcher(name);
			if(fmatcher.matches()) {
				return"Valid Input";
			}
			else {
				return "Invalid Input";
			}
		};
		System.out.println(obj.format("Bhavesh"));
		check lastName = (name)->{ 
			String nameCondition = "[A-Z]{1}[a-z]{2,}";
			Pattern pattern = Pattern.compile(nameCondition);
			Matcher fmatcher = pattern.matcher(name);
			if(fmatcher.matches()) {
				return"Valid Input";
			}
			else {
				return "Invalid Input";
			}
		};
		System.out.println(lastName.format("Patil"));
		check emailIdCheck = (enteredValue)->{ 
			String emailCondition = "[a-z]{3}([-+_])?([.][a-zA-Z0-9]{2})?([A-Za-z0-9]{1,})?@[a-z0-9]{1,}.[a-z]{2,3}(.[a-z]{2,3})?";
			Pattern pattern = Pattern.compile(emailCondition);
			Matcher email = pattern.matcher(enteredValue);
			if(email.matches()) {
				return"Valid Input";
			}
			else {
				return "Invalid Input";
			}
		};
		System.out.println(emailIdCheck.format("xyz.123@gmail.com"));
		check mobileNumber = (enteredValue)->{ 
			String emailCondition = "(91\s)[0-9]{10}";
			Pattern pattern = Pattern.compile(emailCondition);
			Matcher email = pattern.matcher(enteredValue);
			if(email.matches()) {
				return"Valid Input";
			}
			else {
				return "Invalid Input";
			}
		};
		System.out.println(mobileNumber.format("91 9967945885"));
		check password = (enteredValue)->{ 
			String emailCondition = "^(?=.*[@!#$%&*?])(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9@!#$%&*?]{8,}$";
			Pattern pattern = Pattern.compile(emailCondition);
			Matcher email = pattern.matcher(enteredValue);
			if(email.matches()) {
				return"Valid Input";
			}
			else {
				return "Invalid Input";
			}
		};
		System.out.println(password.format("Abcd@1234"));      
	}
}
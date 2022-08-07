package com.bridgelabz;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void firtsNameTestReturnTrue() {
		UserRegistration obj1 = new UserRegistration();
		boolean value = obj1.checkFirst("Bhavesh");
		//test output
		Assert.assertEquals(true,value);
	}

	@Test
	public void lastNameTest2ReturnTrue() {
		UserRegistration obj2 = new UserRegistration();
		boolean value = obj2.checkLast("Patil");
		//test output
		assertEquals(true,value);
	}

	@Test
	public void checkEmailTest3ReturnTrue() {
		UserRegistration obj2 = new UserRegistration();
		boolean value = obj2.checkEmail("abc.xyz@gmail.com");
		//test output
		assertEquals(true,value);
	}
	@Test
	public void checkMobileNumberTest4ReturnTrue() {
		UserRegistration obj2 = new UserRegistration();
		boolean value = obj2.checkMobileNo("91 9975543019");
		//test output
		assertEquals(true,value);
	}
	@Test
	public void checkPasswordTest5ReturnTrue() {
		UserRegistration obj2 = new UserRegistration();
		boolean value = obj2.checkPassword("Bhavesh@1");
		//test output
		assertEquals(true,value);
	}
}
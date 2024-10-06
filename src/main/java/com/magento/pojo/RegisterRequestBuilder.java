package com.nopCommerce.pojo;

public class RegisterRequestBuilder {
	
	private static String firstName;
	private static String lastName;
	private static String emailId;
	private static String password;
	private static String confirmPassword;
	public static String getFirstName() {
		return firstName;
	}
	public static String getLastName() {
		return lastName;
	}
	public static String getEmailId() {
		return emailId;
	}
	public static String getPassword() {
		return password;
	}
	public static String getConfirmPassword() {
		return confirmPassword;
	}
	public static void setFirstName(String firstName) {
		RegisterRequestBuilder.firstName = firstName;
	}
	public static void setLastName(String lastName) {
		RegisterRequestBuilder.lastName = lastName;
	}
	public static void setEmailId(String emailId) {
		RegisterRequestBuilder.emailId = emailId;
	}
	public static void setPassword(String password) {
		RegisterRequestBuilder.password = password;
	}
	public static void setConfirmPassword(String confirmPassword) {
		RegisterRequestBuilder.confirmPassword = confirmPassword;
	}
	
}

package com.magento.pojo;

public class SignInRequestBuilder {
	private static String username;
	private static String password;
	
	public static String getUsername() {
		return username;
	}
	public static String getPassword() {
		return password;
	}
	public static void setUsername(String username) {
		SignInRequestBuilder.username = username;
	}
	public static void setPassword(String password) {
		SignInRequestBuilder.password = password;
	}
}
